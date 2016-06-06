package Practica6.paqueteVectores;

/**
 * Created by Yeray on 06/06/2016.
 */
public class Practica6_Vectores {

    public static void main(String[] args) {

        Vector2D v1 = new Vector2D(1.5, 3.5);
        Vector3D v2 = new Vector3D(1.2, 2.3, 4.6);

        System.out.println("El módulo de v1 es: " + v1.getModulo());
        System.out.println("El módulo de v2 es: " + v2.getModulo());

        System.out.println("Las coordendas de v1 son: ");
        v1.mostrarCoordenadas();
        System.out.println("Las coordendas de v2 son: ");
        v2.mostrarCoordenadas();


    }

}
