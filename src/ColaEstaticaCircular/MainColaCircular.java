package ColaEstaticaCircular;

public class MainColaCircular {
    public static void main(String[] args) {
        // Cola con capacidad para 5 elementos (el arreglo interno mide 5)
        ColaEstaticaCircular cola = new ColaEstaticaCircular(5);

        System.out.println("PRUEBA DE COLA ESTATICA CIRCULAR");

        // 1) LLENAR LA COLA: se ocupan las posiciones 0 a 4 del arreglo
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.enqueue(40);
        cola.enqueue(50);

        System.out.println("\n--- fila actual ---");
        cola.mostrar();

        // 2) ATENDER: salen los dos primeros (FIFO) y 'frente' avanza a la posición 2
        System.out.println("\n--- Atendiendo (Dequeue)---");
        cola.dequeue();
        cola.dequeue();

        System.out.println("\n---Fila después de atender---");
        cola.mostrar();

        // 3) EFECTO CIRCULAR: 'fin' estaba en 4; al avanzar, (4+1) % 5 = 0
        //    y reutiliza los espacios que dejaron 10 y 20
        System.out.println("\n--- Agregando más (Efecto circular)---");
        cola.enqueue(60);
        cola.enqueue(70);

        System.out.println("\n--- Estado final---");
        cola.mostrar();

        // 4) PEEK: solo consulta el frente, no saca ningún elemento
        System.out.println("\n--- Atendiendo (Peek)---");
        cola.peek();


    }

}
