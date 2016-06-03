package Practica5;

/**
 * Created by Yeray on 03/06/2016.
 */
public class Practica5 {
    public static void main(String[] args) {

        //Vehiculo v = new Vehiculo(2, 50, (float) 9.2);        NO PUEDES CREAR UN OBJETO DE UNA CLASE ABSTRACT.
        Vehiculo c = new Camion(2, 200, (float) 12.2, 2000);

        //System.out.println(v.visual());
        System.out.println(c.visual());
    }
}
