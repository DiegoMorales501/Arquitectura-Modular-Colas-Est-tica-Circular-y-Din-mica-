package Estructura_lineales_COLA;

import Estructuras_lineales.Nodo;// Nodo importado de otro paquete

public class ColaDinamica {
    private Nodo frente;// Primer nodo de la cola: de aquí sale el siguiente elemento
    private Nodo fin; // Último nodo de la cola: aquí se agrega el siguiente elemento


    // Constructor: crea una cola vacía (ambos extremos apuntan a null)
    public ColaDinamica() {
        this.frente = null;
        this.fin = null;
    }

    // Una cola está vacía cuando no tiene primer nodo
    public boolean estaVacia() {
        return frente == null;
    }

    // ENCOLAR (enqueue): agrega un valor al final de la cola
    public void encolar(int x){
        Nodo nuevo = new Nodo(x);
        if(estaVacia()){
            frente = nuevo;
            fin = nuevo;
        }
        else{
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    // DESENCOLAR (dequeue): saca y devuelve el valor del frente
    public int desencolar(){
        if(estaVacia()){
            System.out.println("La cola esta vacia");
            return -1;
        }
        int valor = frente.dato;
        frente = frente.siguiente;
        if (frente == null){
            fin = null;
        }
        return valor;
    }

    // MOSTRAR: recorre la cola de frente a fin e imprime cada dato
    public void mostrar(){
        if(estaVacia()){
            System.out.println("Cola vacia");
            return;
        }
        Nodo actual = frente;
        System.out.print("Frente -> ");
        while(actual != null){
            System.out.print("[" + actual.dato + "]");
            actual = actual.siguiente;
        }
        System.out.print("<- Fin ");
    }

    // PEEK: consulta el valor del frente sin sacarlo
    public int peek(){
        if(estaVacia()){
            System.out.println("La cola esta vacia");
            return -1;
        }
        System.out.println();
        System.out.println("Frente de la cola : " + frente.dato);
        return frente.dato;
    }

    // CONTAR ELEMENTOS: recorre toda la cola y cuenta los nodos
    public int contarElementos(){
            int contador = 0;
            Nodo actual = frente;
            while(actual != null){
                contador++;
                actual = actual.siguiente;
        }
            return contador;
    }
}
