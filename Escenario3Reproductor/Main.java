package org.example.Trabajo2703;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReproductorMusica reproductor = new ReproductorMusica();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Cuantas canciones quieres ingresar? ");
            int cantidad;
            try {
                cantidad = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Debes ingresar un numero entero.");
                return;
            }

            if (cantidad <= 0) {
                System.out.println("Debes ingresar al menos una cancion.");
                return;
            }

            for (int i = 1; i <= cantidad; i++) {
                System.out.println("\nCancion " + i + "/" + cantidad);
                reproductor.pedirCancionYReproducir(scanner);
            }

            System.out.println("\nResumen final de reproduccion:");
            reproductor.reproducirMensajes();
        }
    }
}

