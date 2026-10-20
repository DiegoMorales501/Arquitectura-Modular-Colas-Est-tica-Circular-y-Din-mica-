package Listas;

public class MainLista_Simples {
    static void main(String[] args) {
        Listas_Simples lista = new Listas_Simples();

        System.out.println("¿La lista esta vacia? " + lista.estaVacia());

        lista.insertarAlFinal(10);
        lista.insertarAlFinal(20);
        lista.insertarAlFinal(30);
        lista.insertarAlInicio(5);

        lista.mostrar();

        System.out.println("¡El 20 esta en la lista? " + lista.buscar(20));
        System.out.println("¡El 99 esta en la lista? " + lista.buscar(99));

        System.out.println("\n Eliminando el numero 20 (del centro)...");
        lista.eliminar(20);

        lista.mostrar();
    }
}
