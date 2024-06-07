import Banco.*;

public class Main {
    public static void main(String[] args) {
        // Crear usuarios
        Usuario usuario1 = new Usuario("usuario1", "contraseña123");
        Usuario usuario2 = new Usuario("usuario2", "clave456");

        // Crear cuentas bancarias
        CuentaBancaria cuenta1 = new CuentaBancaria("123456", 1000);
        CuentaBancaria cuenta2 = new CuentaBancaria("654321", 500);

        // Realizar autenticación
        if (autenticarUsuario(usuario1)) {
            // Realizar depósito
            Deposito deposito = new Deposito(cuenta1, 200);
            deposito.realizarDeposito();

            // Realizar retiro
            Retiro retiro = new Retiro(cuenta1, 100);
            retiro.realizarRetiro();

            // Realizar transferencia
            Transferencia transferencia = new Transferencia(cuenta1, cuenta2, 300);
            transferencia.realizarTransferencia();
        }

        // Cambiar contraseña del usuario1
        usuario1.cambiarContraseña("nuevaContraseña");

        // Verificar credenciales con nueva contraseña
        if (autenticarUsuario(usuario1)) {
            System.out.println("Inicio de sesión exitoso con la nueva contraseña.");
        } else {
            System.out.println("Inicio de sesión fallido con la nueva contraseña.");
        }
    }

    public static boolean autenticarUsuario(Usuario usuario) {
        // Simular autenticación (ingresar con clave)
        // En un sistema real, aquí se solicitaría la contraseña al usuario y se verificaría con la contraseña almacenada
        String nombreUsuario = "usuario1"; // Nombre de usuario quemado para ejemplo
        String contraseña = "contraseña123"; // Contraseña quemada para ejemplo
        return usuario.verificarCredenciales(nombreUsuario, contraseña);
    }
}
