package Practica2;

/**
 * Created by Yeray on 01/06/2016.
 */
public class Practica2 {

    public static void main(String[] args) {

        CuentaP2 cuentaBancaria = new CuentaP2();

        cuentaBancaria.muestraBalance();
        cuentaBancaria.deposito(10);
        cuentaBancaria.deposito(20);
        System.out.println("El balance leído es: " + cuentaBancaria.leeBalance());
        cuentaBancaria.sacar(15);
        cuentaBancaria.sacar(20);

    }

}
