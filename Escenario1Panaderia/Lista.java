package Escenario1Panaderia;

    // Clase Lista

class Lista {
    private Nodo cabeza;
    private Nodo cola;

    public Lista() {
        this.cabeza = null;
        this.cola = null;
    }

    // Metodo agregar

    public void agregar(String nombreCliente) {
        Nodo nuevoNodo = new Nodo(nombreCliente);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
        }
        System.out.println("Cliente " + nombreCliente + " registrado.");
    }
    // Metodo eliminar

    public void eliminar() {
        if (cabeza == null) {
            System.out.println("No hay clientes en espera.");
            return;
        }
        System.out.println("Atendiendo a: " + cabeza.cliente);
        cabeza = cabeza.siguiente;
        
        if (cabeza == null) {
            cola = null;
        }
    }

    // Metodo buscar
    
    public boolean buscar(String nombreCliente) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.cliente.equals(nombreCliente)) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    // Metodo mostrar

    public void mostrar() {
        if (cabeza == null) {
            System.out.println("La lista de turnos está vacía.");
            return;
        }
        Nodo actual = cabeza;
        System.out.print("Fila actual: ");
        while (actual != null) {
            System.out.print("[" + actual.cliente + "] -> ");
            actual = actual.siguiente;
        }
        System.out.println("FIN");
    }

    // Metodo consultarSiguiente pedido en el taller.

    public void consultarSiguiente() {
        if (cabeza != null) {
            System.out.println("El siguiente en ser atendido es: " + cabeza.cliente);
        } else {
            System.out.println("No hay nadie en espera.");
        }
    }
}