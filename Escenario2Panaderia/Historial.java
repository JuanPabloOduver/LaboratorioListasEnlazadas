public class Historial {
    private Nodo actual;

    public void visitar(String pagina) {

        Nodo nueva = new Nodo(pagina);
        if (actual != null) {

            eliminarPaginasFuturas();

            nueva.setAnterior(actual);
            actual.setSiguiente(nueva);
        }

        actual = nueva;
        System.out.println("Visitando: " + pagina);
    }

    private void eliminarPaginasFuturas() {
        if (actual == null)
            return;

        Nodo aux = actual.getSiguiente();

        while (aux != null) {

            Nodo siguienteNodo = aux.getSiguiente();

            aux.setAnterior(null);
            aux.setSiguiente(null);

            aux = siguienteNodo;
        }

        actual.setSiguiente(null);
    }

    public void retroceder() {

        if (actual != null && actual.getAnterior() != null) {

            actual = actual.getAnterior();
            System.out.println("Retrocediendo a: " + actual.getPagina());
        } else {
            System.out.println("No hay pagina anterior");
        }
    }

    public void avanzar() {

        if (actual != null && actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
            System.out.println("Avanzando a: " + actual.getPagina());

        } else {
            System.out.println("No hay pagina siguiente");

        }
    }

    public void mostrarActual() {
        if (actual != null) {
            System.out.println("Pagina actual: "+ actual.getPagina());
        } else {
            System.out.println( "No hay paginas");
        }
    }
}