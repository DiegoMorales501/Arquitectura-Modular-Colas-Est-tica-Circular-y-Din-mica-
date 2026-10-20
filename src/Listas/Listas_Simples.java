package Listas;

import Estructuras_lineales.Nodo;

public class Listas_Simples {
        public Nodo cabeza;

        public Listas_Simples(){
            this.cabeza = null;
        }
    public boolean estaVacia(){
        return this.cabeza == null;
    }

    public void insertarAlInicio(int x){
            Nodo nuevo = new Nodo(x);
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
    }

    public void insertarAlFinal(int x){
            Nodo nuevo = new Nodo(x);

            if(estaVacia()){
                cabeza = nuevo;
                return;
            }
            Nodo actual = cabeza;
            while(actual.siguiente != null){
                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;
    }


    public void mostrar(){
            if(estaVacia()){
                System.out.println("La lista Vacia");
                return;
            }

            Nodo actual = cabeza;
            System.out.println("Lista: ");
            while(actual != null){
                System.out.print("[" + actual.dato + "] ->");
                actual = actual.siguiente;
            }

            System.out.println("null");
    }

    public boolean buscar(int x){
            Nodo actual = cabeza;

            while(actual != null){
                if(actual.dato == x){
                    return true;
                }

                actual = actual.siguiente;
            }

            return false;
    }

    public void eliminar(int x){
            if(estaVacia()){
                return;
            }
            if(cabeza.dato == x){
                cabeza = cabeza.siguiente;
                return;
            }

            Nodo actual = cabeza;
            while(actual.siguiente != null && actual.siguiente.dato != x){
                actual = actual.siguiente;
            }

            if(actual.siguiente != null){
                actual.siguiente = actual.siguiente.siguiente;
            }

    }

}
