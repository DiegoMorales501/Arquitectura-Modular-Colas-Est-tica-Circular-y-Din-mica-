package ColaEstaticaCircular;

public class ColaEstaticaCircular {
    private int[] arreglo;// Almacena los elementos de la cola
    private int capacidad;// Tamaño máximo del arreglo (no cambia)
    private int frente;// Índice del siguiente elemento que saldrá
    private int fin;// Índice del último elemento que entró

    private int tamaño;// Cantidad actual de elementos (distingue cola llena de vacía)

    // Constructor: crea una cola vacía con la capacidad indicada
    public ColaEstaticaCircular(int capacidad) {
        this.capacidad = capacidad;
        this.arreglo = new int[capacidad];
        this.frente = 0;
        this.fin = -1;
        this.tamaño = 0;

    }

    // ENQUEUE: agrega un valor al final de la cola
    public void enqueue(int valor){
        if(tamaño == capacidad){
            System.out.println("Error la cola esta llena.");
            return;
        }

        fin = (fin + 1) %  capacidad;

        arreglo[fin] = valor;

        tamaño++;

        System.out.println("Entro a la fila: " + valor);
    }

    // DEQUEUE: saca y devuelve el elemento del frente de la cola
    public int dequeue(){
        if(tamaño == 0){
            System.out.println("Error la cola esta vacia.");
            return -1;
        }

        int atendio = arreglo[frente];
        frente = (frente + 1) %  capacidad;

        tamaño--;
        System.out.println("Atendiendo y fuera " + atendio);
        return atendio;
    }

    // MOSTRAR: imprime los elementos del frente al final, sin modificarlos
    public void mostrar(){
        if(tamaño == 0){
            System.out.println("La cola esta vacia.");
            return;
        }
        System.out.print("Fila actual: ");
        for(int i = 0; i < tamaño; i++){
            int indice = (frente + i) %  capacidad;
            System.out.print(arreglo[indice] + " ");
        }

        System.out.println();
    }

    // PEEK: consulta el elemento del frente sin sacarlo de la cola
    public int peek(){
        if(tamaño == 0){
            System.out.println("la cola esta vacia.");
            return -1;
        }
        System.out.println("Frente de la cola: " + arreglo[frente]);
        return arreglo[frente];
    }
}
