package Modulo3.Geometria;

public class Retangulo extends Figura{
    private double ladoA;
    private double ladoB;

    @Override
    public String toString() {
        return "Retangulo{" +
                "ladoA=" + ladoA +
                ", ladoB=" + ladoB +
                ", area=" + this.area() +  '}';
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public Retangulo(double ladoA, double ladoB, String cor) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.setCor(cor);
    }

    public double area() {
        return ladoA * ladoB;
    }

}
