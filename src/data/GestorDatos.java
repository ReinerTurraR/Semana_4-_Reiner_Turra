/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package data;

import model.Tour;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class GestorDatos {

    public ArrayList<Tour> cargarTours(String rutaArchivo) {
        ArrayList<Tour> lista = new ArrayList<>();

   
        try (Scanner lector = new Scanner(new File(rutaArchivo), "UTF-8")) {
            while (lector.hasNextLine()) {
                String linea = lector.nextLine().trim();
                if (linea.isEmpty()) {
                    continue;
                }
                String[] partes = linea.split(";");

                if (partes.length == 3) {
                    String nombre = partes[0].trim();
                    String tipo = partes[1].trim();

                    try {
                        int precio = Integer.parseInt(partes[2].trim());
                        Tour nuevoTour = new Tour(nombre, tipo, precio);
                        lista.add(nuevoTour);
                    } catch (NumberFormatException e) {
                        System.out.println("Precio no válido en el registro: " + linea);
                    }
                } else {
                    System.out.println("Registro con formato incorrecto: " + linea);
                }
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return lista;
    }
}
