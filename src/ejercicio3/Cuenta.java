package ejercicio3;

public class Cuenta {

    protected int numero_cuenta;
    protected double saldo;

    public Cuenta(int cuenta, double inicial) {
        numero_cuenta = cuenta;
        saldo = inicial;
    } // Fin constructor cuenta 

    public void depositar(double cantidad) {
        saldo = saldo + cantidad;
    } // Fin método deposito 

    public double saldo() {
        return saldo;

    }
}
