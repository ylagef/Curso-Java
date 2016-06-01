package Practica4;

/**
 * Created by Yeray on 01/06/2016.
 */
public class CuentaP4 {

    static double factorConversion = 166.386;
    private long identificador;
    private double balance;

    CuentaP4() {
        this.balance = 0;
        this.identificador = 0;
    }

    CuentaP4(long identificador) {
        this.identificador = identificador;
    }

    CuentaP4(CuentaP4 c) {
        this(c.getIdentificador());
    }

    //Métodos
    protected void deposito(double cantidad) {
        balance += cantidad;
        muestraBalance();
        return;
    }

    protected double sacar(double cantidad) {
        if (cantidad > balance) {
            System.out.println("ERROR: La cantidad a sacar es mayor que el balance actual.");
            muestraBalance();
            return 0;
        }

        balance -= cantidad;
        muestraBalance();
        return cantidad;
    }

    protected double leeBalance() {
        muestraBalance();
        return balance;
    }

    protected boolean comparar(CuentaP4 c) {
        return this.identificador == c.getIdentificador();
    }

    protected CuentaP4 clonar(CuentaP4 c) {
        return new CuentaP4(this);
    }

    protected double eurosAPesetas(double euros) {
        return euros * factorConversion;
    }

    protected void intercambiarBalance(CuentaP4 c) {
        c.set(c.leeBalance() + this.balance);
        this.balance = 0;
        return;
    }

    //Getters y setters
    public void set(long identificador) {
        this.identificador = identificador;
    }

    public void set(double balance) {
        this.balance = balance;
    }

    public long getIdentificador() {
        return identificador;
    }

    //ToString
    protected void muestraBalance() {
        System.out.println("El balance actual es: " + balance);
    }

}
