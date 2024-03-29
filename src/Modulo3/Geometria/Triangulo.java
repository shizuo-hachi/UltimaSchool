package Modulo3.Geometria;

public class Triangulo extends Figura{
    private double base;
    private double altura;

    public double area(){
        return (base*altura)/2;
    }

    public Triangulo(double base, double altura, String cor) {
        this.base = base;
        this.altura = altura;
        this.setCor(cor);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura + " area=" + area() +
                '}';
    }
}
