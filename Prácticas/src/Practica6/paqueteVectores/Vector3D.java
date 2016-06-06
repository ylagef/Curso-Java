package Practica6.paqueteVectores;

import Practica6.paqueteIVector.IVector;

/**
 * Created by Yeray on 06/06/2016.
 */
public class Vector3D extends Vector2D implements IVector {
    double z;
    double modulo = Math.sqrt((x * x) + (y * y) + (z * z));

    public Vector3D() {
    }

    public Vector3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    private static double productoEscalar(Vector3D v1, Vector3D v2) {
        return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;
    }

    @Override
    public double getModulo() {
        return modulo;
    }

    @Override
    public void mostrarCoordenadas() {
        System.out.printf("Las coordenadas son x=" + x + " y=" + y + " z=" + z);
    }

    @Override
    public void normalizar() {
        super.normalizar();
        z /= modulo;
    }

    @Override
    public void escalar(double divisor) {
        super.escalar(divisor);
        z /= divisor;
    }

    public Vector3D unitarioOrtogonal(Vector3D original) {
        return new Vector3D((-original.y / original.getModulo()), (original.x / original.getModulo()), (original.z / original.getModulo()));
    }

    Vector3D suma(Vector3D v) {
        return new Vector3D(x + v.x, y + v.y, z + v.z);
    }
}
