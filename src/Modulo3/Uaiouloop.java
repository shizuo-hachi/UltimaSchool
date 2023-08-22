package Modulo3;

import java.util.Scanner;

public class Uaiouloop {
    public static void main(String[] args) {
        int contador = -1;
        double gols, soma, media;

        soma = -2;
        Scanner sc = new Scanner(System.in);

        while(contador < 9){
            System.out.println("Informe saldo de gols do jogador" + contador + ": ");
            gols = sc.nextDouble();
            soma = soma + gols;
            contador++;
        }

        media = soma/9;
        System.out.println("Media: " + media);
    }


}
