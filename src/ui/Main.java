/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        GestorDatos gestor = new GestorDatos();

        ArrayList<Tour> misTours = gestor.cargarTours("src/resources/tours.txt");

        System.out.println("============================================");
        System.out.println("       LLANQUIHUE TOUR - CATALOGO");
        System.out.println("============================================");

        System.out.println("\n--- CATALOGO COMPLETO ---");
        for (Tour tour : misTours) {
            System.out.println(tour);
        }
        System.out.println("Total de tours cargados: " + misTours.size());

        System.out.println("\n--- BUSQUEDA: TOUR LACUSTRE ---");
        boolean encontrado = false;
        for (Tour tour : misTours) {
            if (tour.getNombre().toLowerCase().contains("lacustre")) {
                System.out.println("Encontrado: " + tour);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron tours con ese nombre.");
        }

        System.out.println("\n--- FILTRADO: TOURS DE AVENTURA ---");
        int cantidadAventura = 0;
        for (Tour tour : misTours) {
            if (tour.getTipo().equalsIgnoreCase("Aventura")) {
                System.out.println(tour);
                cantidadAventura++;
            }
        }
        System.out.println("Total de tours de aventura: " + cantidadAventura);
    }
}

