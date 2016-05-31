package Practica3;

/**
 * Created by Yeray on 31/05/2016.
 */
public class Practica3 {

    public static void main(String[] args) {

        float[][] matriz = new float[5][10];

        //Asigna a cada lugar un número.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; ) {
                matriz[i][j] = (i + 1) * (j + 2);
            }
        }

        //Suma y promedio:
        float suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; ) {
                suma += matriz[i][j];
            }
        }
        float promedio = suma / 50;

        //Maximo y posicion
        float max = 0;
        String posicion;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; ) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    posicion = "i=" + i + " j=" + j;
                }
            }
        }

        System.out.println("La suma es: " + suma + "\nEl promedio es: " + promedio + "\nEl máximo es: " + max + " y su posición es: ");

    }

}
