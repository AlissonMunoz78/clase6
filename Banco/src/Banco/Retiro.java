package Banco;

public class Retiro {
    private CuentaBancaria cuenta;
    private double monto;

    public Retiro(CuentaBancaria cuenta, double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }

    public void realizarRetiro() {
        cuenta.retirar(monto);
        System.out.println("Retiro de " + monto + " realizado en la cuenta " + cuenta.getNumeroCuenta());
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        // Crear cuenta bancaria
        CuentaBancaria cuenta = new CuentaBancaria("123456", 1000);

        // Realizar retiro
        Retiro retiro = new Retiro(cuenta, 200);
        retiro.realizarRetiro();
    }
}
