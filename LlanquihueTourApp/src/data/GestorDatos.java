package data;

import model.Tour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// Clase encargada de leer los datos desde el archivo .txt
public class GestorDatos {

    public ArrayList<Tour> cargarTours(){

        // Creamos la lista vacía donde guardaremos los tours
        ArrayList<Tour> lista = new ArrayList<>();

        try {
            // Abrimos el archivo tours.txt para leerlo
            BufferedReader lector = new BufferedReader(

                    new FileReader(System.getProperty("user.dir") + "/resources/tour.txt")
            );

            String linea;

            // Recorremos el archivo línea por línea
            while ((linea = lector.readLine()) != null) {

                // Separamos cada línea por el punto y coma
                String[] partes = linea.split(";");

                // Asignamos cada parte a su variable correspondiente
                String nombre = partes[0];
                String tipo = partes[1];
                double precio = Double.parseDouble(partes[2]);

                // Creamos el objeto Tour con los datos leídos
                Tour tour = new Tour(nombre, tipo, precio);

                // Agregamos el tour a la lista
                lista.add(tour);
            }

            // Cerramos el archivo al terminar
            lector.close();

        }catch (IOException e) {
            // Si el archivo no se encuentra, mostramos el error
            System.out.println("Error al leer el archivo: " + e.getMessage());


        }
        // Retornamos la lista con todos los tours cargados
        return lista;
    }
}


