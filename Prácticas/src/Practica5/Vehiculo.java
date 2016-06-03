package Practica5;

/**
 * Created by Yeray on 03/06/2016.
 */
class Vehiculo {
    private int pasajeros; // número de pasajeros
    private int deposito; // capacidad de combustible
    private float consumo; // consumo en litros/100Km

    Vehiculo(int pasajeros, int deposito, float consumo) {
        this.pasajeros = pasajeros;
        this.deposito = deposito;
        this.consumo = consumo;
    }

    Vehiculo() {
        this(0, 0, 0); // this para llamar a otro constructor de la misma clase
    }

    Vehiculo(Vehiculo v) {
        this(v.pasajeros, v.deposito, v.consumo);
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

    Vehiculo clonar() {
        return new Vehiculo(this);
    }

    String visual() {
        String resultado = "Pasajeros: " + pasajeros +
                "\nDepósito: " + deposito + "\nConsumo: " + consumo;
        return resultado;
    }
}