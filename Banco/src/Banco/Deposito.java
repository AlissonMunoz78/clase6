package Banco;

public class Deposito {
    private CuentaBancaria cuenta;
    private double monto;

    public Deposito(CuentaBancaria cuenta, double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }

    public void realizarDeposito() {
        cuenta.depositar(monto);
        System.out.println("Depósito de " + monto + " realizado en la cuenta " + cuenta.getNumeroCuenta());
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        // Crear cuenta bancaria
        CuentaBancaria cuenta = new CuentaBancaria("123456", 1000);

        // Realizar depósito
        Deposito deposito = new Deposito(cuenta, 200);
        deposito.realizarDeposito();
    }
}
