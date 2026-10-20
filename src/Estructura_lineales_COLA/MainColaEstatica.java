package Estructura_lineales_COLA;

public class MainColaEstatica {
    public static void main(String[] args) {
        // Cola lineal con capacidad para 3 elementos (el arreglo interno mide 3)
        ColaEstatica miCola = new ColaEstatica(3);

        // 1) LLENAR LA COLA: se ocupan las posiciones 0, 1 y 2
        miCola.enqueue(10);
        miCola.enqueue(20);
        miCola.enqueue(30);
        System.out.println();

        // 2) MOSTRAR: imprime del frente al fin sin modificar nada
        miCola.mostrar();
        System.out.println();

        // 3) DEQUEUE: sale el primero en entrar (FIFO) y 'frente' avanza a la posición 1
        miCola.dequeue();
        System.out.println();

        // 4) PEEK: solo consulta el nuevo frente, no saca ningún elemento
        miCola.peek();
        System.out.println();

    }
}
