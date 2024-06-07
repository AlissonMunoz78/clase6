package Figuras;

public class FigurasGeometricas {
    int nLados;
    String Nombre;

    public FigurasGeometricas() {
    }

    public FigurasGeometricas(int nLados, String nombre) {
        this.nLados = nLados;
        Nombre = nombre;
    }

    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void mostrar_datos() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("nLados: " + nLados);
    }
}


