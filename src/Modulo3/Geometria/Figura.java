package Modulo3.Geometria;

public abstract class Figura {
    private String cor;

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public abstract double area();
}
