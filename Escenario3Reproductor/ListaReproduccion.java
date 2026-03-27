package org.example.Trabajo2703;

import lombok.Data;
import org.example.LinkedListTrabajo.LinkedListPropia;

import java.util.Iterator;

@Data
public class ListaReproduccion implements Iterable<Cancion> {
    private LinkedListPropia<Cancion> canciones = new LinkedListPropia<>();

    public void agregarCancion(Cancion cancion) {
        canciones.agregarFinal(cancion);
    }

    public boolean estaVacia() {
        return canciones.estaVacia();
    }

    @Override
    public Iterator<Cancion> iterator() {
        // Each call returns a fresh iterator, so iteration starts from the head again.
        return canciones.iterator();
    }

    public Iterator<Cancion> reiniciarDesdeInicio() {
        return iterator();
    }
}
