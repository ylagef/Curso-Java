package Practica2;

/**
 * Created by Yeray on 01/06/2016.
 */
public class CuentaP2 {

    private double balance;

    CuentaP2() {
        this.balance = 0;
    }

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

    protected void muestraBalance() {
        System.out.println("El balance actual es: " + balance);
    }

}
