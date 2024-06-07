package Figuras;

public class Triangulo extends Regulares{
    double base;
    double altura;
    double hipotenusa;
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
    }
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    @Override
    public double calcularPerimetro() {
        return base+altura+hipotenusa;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }
}
