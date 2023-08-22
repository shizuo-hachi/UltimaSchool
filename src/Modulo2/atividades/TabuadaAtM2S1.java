package Modulo2.atividades;

public class TabuadaAtM2S1 {
    public static void main(String[] args) {
        //int tabuada = 2;
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + " * " + i + " = " + j * i);
            }
            System.out.println();
        }
    }
}
