package Practica3;

import java.util.Random;

/**
 * Created by Yeray on 31/05/2016.
 */
public class Practica3 {

    public static void main(String[] args) {

        System.out.print("Ejercicio 1\n\n");

        double[][] matriz = new double[5][10];

        //Asigna a cada lugar un número.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                Random r = new Random();
                matriz[i][j] = r.nextDouble() * 10;
            }
        }

        //Suma y promedio:
        double suma = 0;
        int cantidad = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
                cantidad++;
            }
        }
        double promedio = suma / cantidad;

        //Maximo y posicion:
        double max = 0;
        String posicion = "";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    posicion = "i=" + i + " j=" + j;
                }
            }
        }

        System.out.println("La suma es: " + suma + "\nEl promedio es: " + promedio + "\nEl máximo es: " + max +
                " y su posición es: " + posicion);

        //Imprimir tabla
        System.out.println("\n\tLA MATRIZ ES: \n");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        ////////////////////////////////////////////////////////////////////////////////////////////////////////// EJ 2

        System.out.print("\nEjercicio 2\n\n");

        int radiacion[][] = new int[5][];
        int dia = 1;

        for (int i = 0; i < radiacion.length; i++) {
            radiacion[i] = new int[dia];
            for (int j = 0; j < dia; j++) {
                radiacion[i][j] = 20 * i;

            }
            dia++;
        }

        //Suma y promedio:
        double sumaR = 0;
        int cantidadValores = 0;

        for (int i = 0; i < radiacion.length; i++) {
            for (int j = 0; j < radiacion[i].length; j++) {
                sumaR += radiacion[i][j];
                cantidadValores++;
            }
        }
        double promedioR = sumaR / cantidadValores;

        //Maximo y posicion:
        double maxR = 0;
        String posicionR = "";

        for (int i = 0; i < radiacion.length; i++) {
            for (int j = 0; j < radiacion[i].length; j++) {
                if (radiacion[i][j] > maxR) {
                    maxR = radiacion[i][j];
                    posicionR = "i=" + i + " j=" + j;
                }
            }
        }

        System.out.println("La suma es: " + sumaR + "\nEl promedio es: " + promedioR + "\nEl máximo es: " + maxR +
                " y su posición es: " + posicionR);

        //Imprimir matriz de radiaciones
        System.out.println("\n\tLA MATRIZ DE RADIACIONES ES: \n");

        for (int i = 0; i < radiacion.length; i++) {
            for (int j = 0; j < radiacion[i].length; j++) {
                System.out.print(radiacion[i][j] + " ");
            }
            System.out.println();
        }

    }

}
