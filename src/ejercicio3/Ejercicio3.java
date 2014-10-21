package ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {

        Cuenta cuenta_1 = new Cuenta(123456, 2505.32);
        double total_cuenta = cuenta_1.saldo;
        System.out.println("Total actual en la cuenta: " + total_cuenta + " €");

    }
}
