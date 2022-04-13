package Lab1;

import java.util.ArrayList;
import java.util.Scanner;

public  class main {
        static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
        static Scanner entrada = new Scanner(System.in);

        public static void main(String[] args) {
                //ingresar datos del poligono
                llenarPoligono();
                //Muestra el resultado del calculo
                mostrarResultado();
        }

        public static void llenarPoligono() {
                int seleccion = 0;
                char respuesta;
                do {
                        do {
                                System.out.println("Indique que figura desea calcular: ");
                                System.out.println("1. Triangulo");
                                System.out.println("2. Rectangulo");
                                System.out.println("3. Romboide");
                                System.out.println("Su Selección: ");
                                seleccion = entrada.nextInt();
                        } while (seleccion < 1 || seleccion > 3);

                        switch (seleccion) {
                                case 1:  llenarTriangulo(); //seleccionar triangulo
                                        break;
                                case 2:  llenarRectangulo(); //seleccionar rectangulo
                                        break;
                                case 3:  llenarRomboide();  //seleccionar romboide
                                        break;
                        }

                        System.out.println("");
                        System.out.print("Desea Calcular Otro Poligono (Si/No)?");
                        respuesta = entrada.next().charAt(0);
                        System.out.println("");
                }while (respuesta=='s' || respuesta=='S');

        }

        public static void llenarTriangulo() {
                double base, altura;
                System.out.print("Ingrese la Base de su Triangulo: ");
                base = entrada.nextDouble();
                System.out.println("");
                System.out.print("Ingrese la Altura de su Triangulo: ");
                altura = entrada.nextDouble();
                System.out.println("");

                Triangulo triangulo = new Triangulo(base, altura);
                poligono.add(triangulo);
        }

        public static void llenarRectangulo() {
                double base, altura;
                System.out.print("Ingrese la Base de su Rectangulo");
                base = entrada.nextDouble();
                System.out.println("");
                System.out.print("Ingrese la Altura de su Rectangulo");
                altura = entrada.nextDouble();
                System.out.println("");

                Rectangulo rectangulo = new Rectangulo(base, altura);
                poligono.add(rectangulo);
        }

        public static void llenarRomboide() {
                double base, altura;
                System.out.print("Ingrese la Base de su Rectangulo");
                base = entrada.nextDouble();
                System.out.println("");
                System.out.print("Ingrese la Altura de su Rectangulo");
                altura = entrada.nextDouble();
                System.out.println("");

                Romboide romboide = new Romboide(base, altura);
                poligono.add(romboide);
        }

        public static void mostrarResultado(){
                for (Poligono figura: poligono) {
                        System.out.println(figura.toString());
                        System.out.println("");
                        System.out.println("El área de su poligono es igual a " + figura.area());
                }
        }
}