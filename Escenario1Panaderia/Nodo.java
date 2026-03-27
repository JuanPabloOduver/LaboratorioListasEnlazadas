package Escenario1Panaderia;

    // Clase Nodo

class Nodo {
    String cliente;
    Nodo siguiente;

    public Nodo(String cliente) {
        this.cliente = cliente;
        this.siguiente = null;
    }
}
