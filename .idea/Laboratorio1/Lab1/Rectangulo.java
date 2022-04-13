package Lab1;

public class Rectangulo extends Poligono {
    private double base;
    private double altura;

    public Rectangulo (double base, double altura) {
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
        return "Datos del Rectangulo {" + "Base= " + base + ", Altura= " + altura + '}';
    }

    @Override
    public double area() {
        return (base*altura);
    }
}
