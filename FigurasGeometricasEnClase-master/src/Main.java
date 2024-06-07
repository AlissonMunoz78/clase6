import Figuras.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.println("                     Menu                     ");
            System.out.println("----------------------------------------------");
            System.out.println("1. Seleccion de Figura Geometrica");
            System.out.println("2. Salir");
            System.out.println("Ingrese opcion: ");
            opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("1. Figuras 2D");
                    System.out.println("2. Figuras 3D");
                    System.out.print("Ingrese opcion: ");
                    opcion = scanner.nextInt();
                    if (opcion == 1) {
                        System.out.println("1. Regulares");
                        System.out.println("2. Irregulares ");
                        System.out.print("Ingrese opcion: ");
                        opcion = scanner.nextInt();
                        if (opcion == 1) {
                            System.out.println("1. Cuadrado");
                            System.out.println("2. Triangulo");
                            System.out.println("3. Circulos");
                            System.out.println("4. Pentagono");
                            System.out.println("5. Hexagono");
                            System.out.println("6. Heptagono");
                            System.out.println("7. Octagono");


                            System.out.print("Ingrese opcion: ");
                            opcion = scanner.nextInt();
                            switch (opcion) {
                                case 1:
                                    System.out.print("Ingrese el primer lado del cuadrado: ");
                                    double lado1 = scanner.nextDouble();
                                    System.out.print("Ingrese el segundo lado del cuadrado: ");
                                    double lado2 = scanner.nextDouble();
                                    Cuadrilatero cuadrado = new Cuadrilatero(lado1,lado2);
                                    System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
                                    System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());
                                    break;
                                case 2:
                                    System.out.print("Ingrese la base del triángulo: ");
                                    double base = scanner.nextDouble();
                                    System.out.print("Ingrese la altura del triángulo: ");
                                    double altura = scanner.nextDouble();
                                    Triangulo triangulo1 = new Triangulo(base,altura);
                                    System.out.println("Área del triángulo: " + triangulo1.calcularArea());
                                    System.out.println("Perímetro del triángulo: " + triangulo1.calcularPerimetro());
                                    break;
                                case 3:
                                    System.out.print("Ingrese el radio del círculo: ");
                                    double radio = scanner.nextDouble();
                                    Circulos circulo1 = new Circulos();
                                    circulo1.setRadio(radio);
                                    System.out.println("Área del círculo: " + circulo1.calcularArea_Circulo());
                                    System.out.println("Perímetro del círculo: " + circulo1.calcularPerimetro_Circulo());
                                    break;
                                case 4:
                                    System.out.print("Ingrese la longitud del Pentagono: ");
                                    double lado = scanner.nextDouble();
                                    Pentagono pentagono1 = new Pentagono();
                                    pentagono1.setLongitudLado(lado);
                                    System.out.println("Área del Pentagono: " + pentagono1.calcularArea());
                                    System.out.println("Perímetro del Pentagono: " + pentagono1.calcularPerimetro());
                                    break;
                                case 5:
                                    System.out.print("Ingrese la longitud del Hexagono: ");
                                    double lado6 = scanner.nextDouble();
                                    Hexagono hexagono1 = new Hexagono();
                                    hexagono1.setLongitudLado(lado6);
                                    System.out.println("Área del Hexagono: " + hexagono1.calcularArea());
                                    System.out.println("Perímetro del Hexagono: " + hexagono1.calcularPerimetro());
                                    break;
                                case 6:
                                    System.out.print("Ingrese la longitud del Heptagono: ");
                                    double lado7 = scanner.nextDouble();
                                    Heptagono heptagono1 = new Heptagono();
                                    heptagono1.setLongitudLado(lado7);
                                    System.out.println("Área del Heptagono: " + heptagono1.calcularArea());
                                    System.out.println("Perímetro del Heptagono: " + heptagono1.calcularPerimetro());
                                    break;
                                case 7:
                                    System.out.print("Ingrese la longitud del Octagono: ");
                                    double lado8 = scanner.nextDouble();
                                    Octagono octagono1 = new Octagono();
                                    octagono1.setLongitudLado(lado8);
                                    System.out.println("Área del Octagono: " + octagono1.calcularArea());
                                    System.out.println("Perímetro del Octagono: " + octagono1.calcularPerimetro());
                                    break;
                            }
                        } else if (opcion == 2) {
                            System.out.println("1. Triángulo escaleno");
                            System.out.println("2. Trapecio");
                            System.out.println("3. Paralelogramo");
                            System.out.println("4. Deltoide");
                            System.out.print("Ingrese opcion: ");
                            opcion = scanner.nextInt();
                            Figuras_irregulares figurasIrregulares = new Figuras_irregulares();
                            switch (opcion) {
                                case 1:
                                    System.out.print("Ingrese el primer lado del triángulo: ");
                                    double lado1 = scanner.nextDouble();
                                    System.out.print("Ingrese el segundo lado del triángulo: ");
                                    double lado2 = scanner.nextDouble();
                                    System.out.print("Ingrese el tercer lado del triángulo: ");
                                    double lado3 = scanner.nextDouble();
                                    System.out.println("Área del triángulo escaleno: " + figurasIrregulares.calcularArea(lado1, lado2, lado3));
                                    System.out.println("Perímetro del triángulo escaleno: " + figurasIrregulares.calcularPerimetro(lado1, lado2, lado3));
                                    break;
                                case 2:
                                    System.out.print("Ingrese la base mayor del trapecio: ");
                                    double base1 = scanner.nextDouble();
                                    System.out.print("Ingrese la base menor del trapecio: ");
                                    double base2 = scanner.nextDouble();
                                    System.out.print("Ingrese la altura del trapecio: ");
                                    double alturaTrapecio = scanner.nextDouble();
                                    System.out.print("Ingrese el primer lado del trapecio: ");
                                    double ladoTrapecio1 = scanner.nextDouble();
                                    System.out.println("Área del trapecio: " + figurasIrregulares.areaTrapecio(base1, base2, alturaTrapecio));
                                    System.out.println("Perímetro del trapecio: " + figurasIrregulares.perimetroTrapecio(ladoTrapecio1, base2, base1));
                                    break;
                                case 3:
                                    System.out.print("Ingrese la base del paralelogramo: ");
                                    double baseParalelogramo = scanner.nextDouble();
                                    System.out.print("Ingrese la altura del paralelogramo: ");
                                    double alturaParalelogramo = scanner.nextDouble();
                                    System.out.print("Ingrese el primer lado del paralelogramo: ");
                                    double ladoParalelogramo1 = scanner.nextDouble();
                                    System.out.println("Área del paralelogramo: " + figurasIrregulares.calcularArea(baseParalelogramo, alturaParalelogramo));
                                    System.out.println("Perímetro del paralelogramo: " + figurasIrregulares.perimetroParalelogramo(baseParalelogramo, ladoParalelogramo1));
                                    break;
                                case 4:
                                    System.out.print("Ingrese la primera diagonal del deltoide: ");
                                    double diagonal1 = scanner.nextDouble();
                                    System.out.print("Ingrese la segunda diagonal del deltoide: ");
                                    double diagonal2 = scanner.nextDouble();
                                    System.out.print("Ingrese el primer lado del deltoide: ");
                                    double ladoDeltoide1 = scanner.nextDouble();
                                    System.out.print("Ingrese el segundo lado del deltoide: ");
                                    double ladoDeltoide2 = scanner.nextDouble();
                                    System.out.println("Área del deltoide: " + figurasIrregulares.areaDeltoide(diagonal1, diagonal2));
                                    System.out.println("Perímetro del deltoide : " + figurasIrregulares.perimetroDeltoide(ladoDeltoide1, ladoDeltoide2));
                                    break;
                            }
                        }
                    } else if (opcion == 2) {
                        Figuras3D figuras3D = new Figuras3D();
                        figuras3D.Menu();
                        figuras3D.mostrar_datos();
                    }
                    break;
                case 2:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 2);
    }
}