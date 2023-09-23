package Modulo3.Geometria;

public class TestaFiguras {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo(5, 2, "verde");
        Quadrado quad = new Quadrado(4, "azul");
        Triangulo tri = new Triangulo(4, 10, "vermelho");
        Circulo circ = new Circulo(6);

        System.out.println(ret);
        System.out.println(quad);
        System.out.println(tri);
        System.out.println(circ);
    }
}
