package Banco;

public class Usuario {
    private String nombreUsuario;
    private String contraseña;

    public Usuario(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public boolean verificarCredenciales(String nombreUsuario, String contraseña) {
        return this.nombreUsuario.equals(nombreUsuario) && this.contraseña.equals(contraseña);
    }

    public void cambiarContraseña(String nuevaContraseña) {
        this.contraseña = nuevaContraseña;
    }

    // Métodos getter y setter para nombreUsuario y contraseña
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        // Crear un usuario
        Usuario usuario1 = new Usuario("usuario1", "contraseña123");

        // Verificar credenciales
        String nombreUsuario = "usuario1";
        String contraseña = "contraseña123";
        if (usuario1.verificarCredenciales(nombreUsuario, contraseña)) {
            System.out.println("Inicio de sesión exitoso.");
        } else {
            System.out.println("Credenciales incorrectas.");
        }
    }
}
