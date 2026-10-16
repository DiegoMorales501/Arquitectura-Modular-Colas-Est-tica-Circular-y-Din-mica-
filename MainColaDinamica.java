package Estructura_lineales_COLA;

public class MainColaDinamica {
    static void main(String[] args) {

        // Cola dinámica vacía: no hay que indicar capacidad porque crece con cada encolar
        ColaDinamica cola = new ColaDinamica();

        // 1) ENCOLAR: cada valor se agrega al final (10 queda al frente, 50 al fin)
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        cola.encolar(40);
        cola.encolar(50);

        // 2) MOSTRAR: recorre los nodos de frente a fin (no termina con salto de línea)
        cola.mostrar();
        // 3) PEEK: imprime un salto de línea y luego el valor del frente, sin sacarlo
        cola.peek();
        // 4) CONTAR: recorre la cola y cuenta los nodos
        System.out.println("Total de elementos: " + cola.contarElementos());
        System.out.println();

        // 5) DESENCOLAR: sale el primero en entrar (FIFO). Se ignora el valor devuelto (el 10)
        cola.desencolar();
        System.out.println("Despues de desencolar");
        cola.mostrar();
        cola.peek();
        System.out.println("Total de elementos: " + cola.contarElementos());

    }
}
