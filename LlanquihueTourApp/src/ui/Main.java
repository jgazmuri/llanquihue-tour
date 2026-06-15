package ui;

import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;

// Clase principal que ejecuta el programa
public class Main {

    public static void main(String[] args) {

        // Creamos el gestor para cargar los datos del archivo
        GestorDatos gestor = new GestorDatos();
        ArrayList<Tour> lista = gestor.cargarTours();

        // Recorremos y mostramos todos los tours disponibles
        System.out.println("=== TODOS LOS TOURS ===");
        for (Tour tour : lista) {
            System.out.println(tour);
        }

        // Filtramos solo los tours de tipo Cultural
        System.out.println("\n=== TOURS CULTURALES===");
        for (Tour tour : lista) {
            if (tour.getTipo().equalsIgnoreCase("CULTURAL")) {
                System.out.println(tour);
            }

        }

        // Filtramos tours con precio menor a $30.000
        System.out.println("\n=== TOURS ECONÓMICOS (menos de $30.000) ===");
        for (Tour tour : lista) {
            if (tour.getPrecio() < 30000) {
                System.out.println(tour);
            }
        }

    }

}
