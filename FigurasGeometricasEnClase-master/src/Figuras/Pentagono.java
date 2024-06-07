package Figuras;
public class Pentagono extends Regulares{
        double longitudLado;
        public Pentagono() {
        }
        public Pentagono(double longitudLado) {
            this.longitudLado = longitudLado;
        }
        public double getLongitudLado() {
            return longitudLado;
        }
        public void setLongitudLado(double longitudLado) {
            this.longitudLado = longitudLado;
        }
        @Override
        public double calcularArea(){
            return (0.25*Math.pow(longitudLado, 2)*Math.sqrt(5*(5+(2*Math.sqrt(5)))));
        }
        @Override
        public double calcularPerimetro(){
            return 5*longitudLado;
        }
}
