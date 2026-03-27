package org.example.Trabajo2703;

import lombok.Data;

import java.util.Scanner;

@Data
public class ReproductorMusica {
    private ListaReproduccion listaReproduccion = new ListaReproduccion();

    public void pedirCancionYReproducir(Scanner scanner) {
        Cancion cancion = new Cancion();

        System.out.print("Titulo: ");
        cancion.setTitulo(scanner.nextLine());

        System.out.print("Artista: ");
        cancion.setArtista(scanner.nextLine());

        System.out.print("Genero: ");
        cancion.setGenero(scanner.nextLine());

        System.out.print("Duracion (segundos): ");
        cancion.setDuracion(Integer.parseInt(scanner.nextLine()));

        listaReproduccion.agregarCancion(cancion);
        reproducirMensajes();
    }

    public void reproducirMensajes() {
        if (listaReproduccion == null || listaReproduccion.estaVacia()) {
            System.out.println("No hay canciones para reproducir.");
            return;
        }

        for (Cancion cancion : listaReproduccion) {
            System.out.println("Reproduciendo: " + cancion.getTitulo() + " - " + cancion.getArtista());
        }
    }
}
