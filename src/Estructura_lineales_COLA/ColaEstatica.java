package Estructura_lineales_COLA;

public class ColaEstatica {
    private int[] arreglo;// Almacena los elementos de la cola
    private int frente;// Índice del siguiente elemento que saldrá
    private int fin;// Índice del último elemento que entró
    private int capacidad; // Tamaño máximo del arreglo (no cambia)

    private int tamaño; // Declarado e inicializado, pero esta clase nunca lo usa (ver nota 1)

    // Constructor: crea una cola vacía. El parámetro 'tamaño' define la capacidad
    public ColaEstatica(int tamaño) {
        this.capacidad = tamaño;
        this.arreglo = new int[this.capacidad];
        this.frente = 0;
        this.fin = -1;
        this.tamaño = 0;

        }

    // ENQUEUE: agrega un valor al final de la cola
        public void enqueue(int valor){
        if(this.fin == capacidad - 1){
            System.out.println("Error la cola esta llena.");
        }
        else{
            fin++;
            arreglo[fin] = valor;
            System.out.println("Entro la fila: " + valor);
        }
    }

    // DEQUEUE: saca el elemento del frente (no lo devuelve, solo lo imprime)
    public void dequeue(){
        if(frente > fin){
            System.out.println("Error la cola esta vacia.");
        }
        else{
            System.out.println("Atendiendo y fuera: " + arreglo[frente]);
            frente++;
        }
    }

    // MOSTRAR: imprime los elementos del frente al fin, sin modificarlos
    public void mostrar(){
        if(frente > fin){
            System.out.println("La cola esta vacia.");
            return;
        }
        System.out.print("Fiila actual: ");
        for(int i = frente; i <= fin; i++){
            System.out.print(arreglo[i] + " ");
        }

        System.out.println();
    }

    // PEEK: consulta el elemento del frente sin sacarlo
    public int peek(){
        if(frente > fin){
            System.out.println("la cola esta vacia.");
            return -1;
        }
        System.out.print("Frente de la cola: " + arreglo[frente]);
        return arreglo[frente];
    }
}
