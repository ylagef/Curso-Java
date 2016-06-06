package Practica6.paqueteVectores;

import Practica6.paqueteIVector.IVector;

/**
 * Created by Yeray on 06/06/2016.
 */
public class Vector2D implements IVector {
    double x, y;

    public Vector2D() {
        this(0, 0);
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private static double productoEscalar(Vector2D v1, Vector2D v2) {
        return v1.x * v2.x + v1.y * v2.y;
    }

    @Override
    public double getModulo() {
        return Math.sqrt((x * x) + (y * y));
    }

    @Override
    public void mostrarCoordenadas() {
        System.out.println("Las coordenadas son x=" + x + " y=" + y);
    }

    @Override
    public void normalizar() {
        double modulo = getModulo();
        x /= modulo;
        y /= modulo;
    }

    @Override
    public void escalar(double divisor) {
        x /= divisor;
        y /= divisor;
    }

    public Vector2D unitarioOrtogonal() {
        double modulo = getModulo();
        return new Vector2D((-y / modulo), (x / modulo));
    }

    public boolean esOrtogonal(Vector2D v) {
        return productoEscalar(this, v) == 0;
    }

    Vector2D suma(Vector2D v) {
        return new Vector2D(x + v.x, y + v.y);
    }
}
