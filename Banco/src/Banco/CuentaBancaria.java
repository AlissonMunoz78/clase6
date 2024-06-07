package Banco;
import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String args[]) {
        // Crear cuentas bancarias
        Cuenta cuenta1 = new Cuenta(50.00);
        Cuenta cuenta2 = new Cuenta(-7.53);

        // Mostrar el saldo inicial de cada cuenta
        System.out.printf("Saldo de cuenta1: $%.2f\n", cuenta1.obtenerSaldo());
        System.out.printf("Saldo de cuenta2: $%.2f\n\n", cuenta2.obtenerSaldo());

        // Crear objeto Scanner para obtener la entrada del usuario
        Scanner entrada = new Scanner(System.in);
        double montoDeposito; // Monto a depositar ingresado por el usuario

        System.out.print("Escriba el monto a depositar para cuenta1: ");
        montoDeposito = entrada.nextDouble();
        System.out.printf("\nSumando %.2f al saldo de cuenta1\n\n", montoDeposito);
        cuenta1.abonar(montoDeposito); // Sumar al saldo de cuenta1

        // Mostrar los saldos
        System.out.printf("Saldo de cuenta1: $%.2f\n", cuenta1.obtenerSaldo());
        System.out.printf("Saldo de cuenta2: $%.2f\n\n", cuenta2.obtenerSaldo());

        System.out.print("Escriba el monto a depositar para cuenta2: ");
        montoDeposito = entrada.nextDouble();
        System.out.printf("\nSumando %.2f al saldo de cuenta2\n\n", montoDeposito);
        cuenta2.abonar(montoDeposito); // Sumar al saldo de cuenta2

        // Mostrar los saldos
        System.out.printf("Saldo de cuenta1: $%.2f\n", cuenta1.obtenerSaldo());
        System.out.printf("Saldo de cuenta2: $%.2f\n", cuenta2.obtenerSaldo());
    }
}
