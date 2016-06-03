package Practica5;

/**
 * Created by Yeray on 03/06/2016.
 */
final class Camion extends Vehiculo { //El final es para que no permita herencias posteriores

    private int carga; //Carga en kg

    Camion() {
        carga = 0;
    }

    Camion(Camion c) {
        super(c.getPasajeros(), c.getDeposito(), c.getConsumo());
        this.carga = c.getCarga();
    }

    Camion(int pasajeros, int deposito, float consumo, int carga) {
        super(pasajeros, deposito, consumo);
        this.carga = carga;
    }

    void set(int carga) {
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    boolean compara(Camion c) {
        return super.getPasajeros() == c.getPasajeros() && super.getDeposito() == c.getDeposito() &&
                super.getConsumo() == c.getConsumo() && carga == c.getCarga();
    }

    String visual() {
        return super.visual() + "\nCarga: " + carga;
    }

    @Override
    public int cuantosNuevos() { //Este método hay que implementarlo ya que es abstracto.
        return 1;
    }


}
