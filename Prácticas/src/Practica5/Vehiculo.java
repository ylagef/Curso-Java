package Practica5;

/**
 * Created by Yeray on 03/06/2016.
 */
abstract class Vehiculo {
    static int numeroObjetos;

    static {
        numeroObjetos = 0;
    }

    private int pasajeros; // número de pasajeros
    private int deposito; // capacidad de combustible
    private float consumo; // consumo en litros/100Km

    Vehiculo() {
        this(0, 0, 0);
        numeroObjetos++;
    }

    Vehiculo(int pasajeros, int deposito, float consumo) {
        this.pasajeros = pasajeros;
        this.deposito = deposito;
        this.consumo = consumo;
        numeroObjetos++;
    }

    Vehiculo(Vehiculo v) {
        this(v.pasajeros, v.deposito, v.consumo);
        numeroObjetos++;
    }

    float autonomia() {
        return 100 * deposito / consumo;
    }

    double combustibleNecesario(float kilometros) {
        return (double) consumo * kilometros / 100;
    }

    void set(int pasajeros, int deposito) {
        this.pasajeros = pasajeros;
        this.deposito = deposito;
    }

    void set(float consumo) {
        this.consumo = consumo;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public int getDeposito() {
        return deposito;
    }

    public float getConsumo() {
        return consumo;
    }

    boolean compara(Vehiculo v) {
        return (v.consumo == consumo) && (v.deposito == deposito) &&
                (v.pasajeros == pasajeros);
    }

    /*
    Vehiculo clonar() {
        return new Vehiculo(this);
    }
    */

    String visual() {
        return "Pasajeros: " + pasajeros + "\nDepósito: " + deposito + "\nConsumo: " + consumo + "\nCuantos nuevos: " + cuantosNuevos();
    }

    public abstract int cuantosNuevos();
}