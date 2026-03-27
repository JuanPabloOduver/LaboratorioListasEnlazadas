public class Nodo {
    private String pagina;
    private Nodo siguiente;
    private Nodo anterior;
    
    public Nodo(String pagina) {
        this.pagina = pagina;
        this.siguiente = null;
        this.anterior = null;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "Nodo [pagina=" + pagina + ", siguiente=" + siguiente + ", anterior=" + anterior + "]";
    }
}
