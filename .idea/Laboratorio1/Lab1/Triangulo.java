package Lab1;

public class Triangulo extends Poligono {
    private double base;
    private double altura;

    public Triangulo (double base, double altura) {
        super(2);
        this.base = base;
        this.altura = altura;
    }

    public double getLado1() {
        return base;
    }

    public double getLado2() {
        return altura;
    }

    @Override
    public String toString() {
        return "Datos del Triangulo {" + "Base= " + base + ", Altura= " + altura + '}';
    }

    @Override
    public double area() {
        return (base*altura)/2;
    }
}