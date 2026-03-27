package Escenario3Juego;

class JuegoTurnos {
    private NodoJugador cabeza = null;
    private int tamano = 0;

    public void agregar(String nombre) {
        NodoJugador nuevo = new NodoJugador(nombre);
        if (cabeza == null) {
            cabeza = nuevo;
            nuevo.siguiente = cabeza;
            nuevo.anterior = cabeza;
        } else {
            NodoJugador ultimo = cabeza.anterior;
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
        }
        tamano++;
        System.out.println("Jugador " + nombre + " se ha unido a la mesa.");
    }

    public void eliminar(String nombre) {
        if (cabeza == null) return;

        NodoJugador actual = cabeza;
        boolean encontrado = false;

        for (int i = 0; i < tamano; i++) {
            if (actual.nombre.equals(nombre)) {
                encontrado = true;
                break;
            }
            actual = actual.siguiente;
        }

        if (encontrado) {
            if (tamano == 1) {
                cabeza = null;
            } else {
                actual.anterior.siguiente = actual.siguiente;
                actual.siguiente.anterior = actual.anterior;
                if (actual == cabeza) {
                    cabeza = actual.siguiente;
                }
            }
            tamano--;
            System.out.println("Jugador " + nombre + " ha sido expulsado.");
        } else {
            System.out.println("Jugador " + nombre + " no encontrado.");
        }
    }

    public void consultarTurnos(String nombreBusqueda) {
        NodoJugador actual = cabeza;
        for (int i = 0; i < tamano; i++) {
            if (actual.nombre.equals(nombreBusqueda)) {
                System.out.println("Jugador actual: " + actual.nombre);
                System.out.println("Jugó antes: " + actual.anterior.nombre);
                System.out.println("Jugará después: " + actual.siguiente.nombre);
                return;
            }
            actual = actual.siguiente;
        }
        System.out.println("El jugador no está en la partida.");
    }

    public void mostrar() {
        if (cabeza == null) {
            System.out.println("La mesa está vacía.");
            return;
        }
        NodoJugador actual = cabeza;
        System.out.print("Círculo de juego: ");
        for (int i = 0; i < tamano; i++) {
            System.out.print("[" + actual.nombre + "] <-> ");
            actual = actual.siguiente;
        }
        System.out.println("(Vuelve a " + cabeza.nombre + ")");
    }
}