package Modulo3;

import java.util.Scanner;

public class CalculaIMC {
    public static void main(String[] args) {
        double peso, altura, imc;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso");
        peso = sc.nextDouble();

        System.out.println("Digite sua altura");
        altura = sc.nextDouble();

        imc = peso/(altura*altura);

        System.out.println("IMC: " + imc);

    }
}
