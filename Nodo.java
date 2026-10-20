package Estructuras_lineales;

// Nodo de la pila dinámica: guarda un dato y apunta al nodo de abajo
public class Nodo {
    int dato;  // valor que almacena el nodo
    Nodo siguiente;// referencia al siguiente nodo (null si es el último)


    // Crea un nodo con el dato recibido y sin nodo siguiente
    public Nodo(int x) {
        this.dato = x;
        this.siguiente = null;
    }
}
