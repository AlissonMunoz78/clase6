package Banco;
public class Transferencia {
    private CuentaBancaria cuentaOrigen;
    private CuentaBancaria cuentaDestino;
    private double monto;

    public Transferencia(CuentaBancaria cuentaOrigen, CuentaBancaria cuentaDestino, double monto) {
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.monto = monto;
    }

    public void realizarTransferencia() {
        if (monto <= cuentaOrigen.getSaldo()) {
            cuentaOrigen.retirar(monto);
            cuentaDestino.depositar(monto);
            System.out.println("Transferencia de " + monto + " realizada de la cuenta "
                    + cuentaOrigen.getNumeroCuenta() + " a la cuenta " + cuentaDestino.getNumeroCuenta());
        } else {
            System.out.println("Saldo insuficiente para realizar la transferencia.");
        }
    }


    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("123456", 1000);
        CuentaBancaria cuenta2 = new CuentaBancaria("654321", 500);

        Transferencia transferencia = new Transferencia(cuenta1, cuenta2, 200);
        transferencia.realizarTransferencia();
    }
}
