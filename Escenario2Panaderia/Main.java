public class Main {

    public static void main(String[] args) {
        Historial historial = new Historial();

        historial.visitar("google.com");
        historial.visitar("youtube.com");
        historial.visitar("wikipedia.org");

        historial.retroceder();

        historial.visitar("twitter.com");

        historial.mostrarActual();

        historial.avanzar();
    }
}
