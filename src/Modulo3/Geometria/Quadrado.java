package Modulo3.Geometria;

public class Quadrado extends Retangulo{

    public Quadrado(double ladoA, String cor) {
        super(ladoA, ladoA, cor);
    }

    public String toString() {
        return "Quadrado{" +
                "ladoA=" + super.getLadoA() +
                ", area=" + this.area() +  '}';
    }
}
