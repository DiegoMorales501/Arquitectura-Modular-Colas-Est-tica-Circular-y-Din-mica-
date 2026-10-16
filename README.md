# Colas(Estatica, Circular y Dinamica)

Aquí implementé una **cola** (FIFO: el primero que llega es el primero que sale, como la fila de las tortillas) de tres formas distintas, para ver qué ventajas y problemas tiene cada una.

## Las tres versiones

| Versión | Clase | ¿Cómo funciona? | ¿Cuál es su problema? |
|---------|-------|-----------------|-----------------------|
| Estática | `ColaEstatica` | Arreglo de tamaño fijo. `frente` y `fin` solo avanzan. | Desperdicia espacio: al sacar elementos, esos lugares no se vuelven a usar. |
| Estática circular | `ColaEstaticaCircular` | Arreglo fijo, pero cuando `fin` llega al final da la vuelta al inicio (con `%`). | Sigue teniendo tamaño máximo. |
| Dinámica | `ColaDinamica` | Nodos enlazados. Crece y se achica sola. | Ocupa un poco más de memoria por los punteros. |

### Lo clave de cada una

- **Estática:** si la llenas y sacas elementos, igual dice "cola llena" aunque haya huecos al inicio. Por eso existe la circular.
- **Circular:** usa un contador `tamaño` para saber si está llena o vacía, y así reaprovecha los huecos.
- **Dinámica:** no existe "cola llena". Guarda un puntero al `frente` y otro al `fin`, así que encolar y desencolar son rápidos.

## Operaciones

| Operación | Estática y circular | Dinámica | ¿Qué hace? |
|-----------|--------------------|----------|------------|
| Agregar | `enqueue(valor)` | `encolar(x)` | Mete un elemento al final |
| Sacar | `dequeue()` | `desencolar()` | Saca el elemento del frente |
| Ver | `mostrar()` | `mostrar()` | Imprime la cola completa |
| Consultar frente | `peek()` | `peek()` | Ve quién sigue sin sacarlo |
| Contar | | `contarElementos()` | Cuenta los nodos |
| ¿Vacía? | | `estaVacia()` | Revisa si no hay elementos |

## Estructura de archivos

```
Estructuras_lineales/
└── Nodo.java                  (lo usa la cola dinámica)

Estructura_lineales_COLA/
├── ColaEstatica.java
├── MainColaEstatica.java
├── ColaDinamica.java
└── MainColaDinamica.java

ColaEstaticaCircular/
├── ColaEstaticaCircular.java
└── MainColaCircular.java
```

## Cómo compilar y ejecutar

Necesitas el JDK instalado. Desde la carpeta que contiene esas tres carpetas:

```bash
# Compilar todo junto
javac Estructuras_lineales/*.java Estructura_lineales_COLA/*.java ColaEstaticaCircular/*.java

# Ejecutar cada prueba
java Estructura_lineales_COLA.MainColaEstatica
java ColaEstaticaCircular.MainColaCircular
java Estructura_lineales_COLA.MainColaDinamica
```

> ⚠️ `ColaDinamica` necesita la clase `Nodo`, así que compílala junto con las demás (por eso va en el mismo `javac`). Además, el `main` de `MainColaDinamica` debe ser `public static void main`, si no, en versiones de Java no tan recientes no corre.

## Qué sale al ejecutarlas

Estas salidas son las reales de cada programa.

**Cola estática** (capacidad 3):

```
Entro la fila: 10
Entro la fila: 20
Entro la fila: 30

Fiila actual: 10 20 30 

Atendiendo y fuera: 10

Frente de la cola: 20
```

**Cola circular** (capacidad 5): llena con 10 a 50, saca dos, mete 60 y 70. Se ve el efecto circular porque 60 y 70 ocupan los lugares que dejaron 10 y 20:

```
Fila actual: 10 20 30 40 50 
Atendiendo y fuera 10
Atendiendo y fuera 20
Fila actual: 30 40 50 
Entro a la fila: 60
Entro a la fila: 70
Fila actual: 30 40 50 60 70 
Frente de la cola: 30
```

**Cola dinámica:**

```
Frente -> [10][20][30][40][50]<- Fin 
Frente de la cola : 10
Total de elementos: 5

Despues de desencolar
Frente -> [20][30][40][50]<- Fin 
Frente de la cola : 20
Total de elementos: 4
```

## Cosas a tener en cuenta

- En las colas estáticas, `peek()` y `dequeue()` regresan `-1` si la cola está vacía, así que no se distingue de un `-1` real guardado.
- Para ver la limitación de la cola estática, llénala (capacidad 3), saca uno y trata de encolar otro: marca error aunque haya un hueco libre. En la circular, ese mismo caso sí funciona.