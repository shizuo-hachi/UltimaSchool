package Modulo3.Geometria;

public class Circulo extends Figura{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

public double area(){
        return Math.PI * (raio * raio);
}

public double getDiametro(){
    return raio * 2;
}

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio + " area=" + area() + " diametro=" + getDiametro() +
                '}';
    }
}
