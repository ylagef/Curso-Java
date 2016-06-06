package Practica6.otroPaquete;

import Practica6.paqueteVectores.Vector2D;
import Practica6.paqueteVectores.Vector3D;

/**
 * Created by Yeray on 06/06/2016.
 */
public class Practica6_Otro {
    public static void main(String[] args) {

        Vector2D v1 = new Vector2D(1.5, -3.5);
        Vector3D v2 = new Vector3D(-1.2, 2.3, 4.6);

        System.out.println("El módulo de v1 es: " + v1.getModulo());
        System.out.println("El módulo de v2 es: " + v2.getModulo() + "\n");

        v1.mostrarCoordenadas();
        v2.mostrarCoordenadas();

        System.out.println("\n- SE NORMALIZA EL VECTOR -");
        v1.normalizar();
        v1.mostrarCoordenadas();
        v2.normalizar();
        v2.mostrarCoordenadas();

        Vector2D v3 = new Vector2D(1.9, -9.2);
        Vector3D v4 = new Vector3D(3.7, 2.34, -8.56);
        System.out.println("\nNuevos vectores v3, v4:");
        v3.mostrarCoordenadas();
        v4.mostrarCoordenadas();

        System.out.println("\n - SE ESCALAN POR 5.1 Y 10.3 -");
        v3.escalar(5.1);
        v4.escalar(10.3);
        v3.mostrarCoordenadas();
        v4.mostrarCoordenadas();

        System.out.println("\nNuevo vector v5:");
        Vector3D v5 = new Vector3D(-10.53, -50.32, 0);
        v5.mostrarCoordenadas();
        System.out.println("Su vector unitario ortogonal es: ");
        v5.unitarioOrtogonal().mostrarCoordenadas();

        System.out.println("\nSuma de v1 y v3");
        //v1.suma(v3).mostrarCoordenadas(); // No se puede hacer porque no es accesible
        System.out.println("NO ES ACCESIBLE");
    }
}
