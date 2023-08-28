package Modulo3;

import java.util.Scanner;

public class CalculaIMCClassifc {
    public static void main(String[] args) {
        double peso, altura, imc;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso");
        peso = sc.nextDouble();

        System.out.println("Digite sua altura");
        altura = sc.nextDouble();

        imc = peso/(altura*altura);

        System.out.println("IMC: " + imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso normal");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Excesso de peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade classe 1");
        }else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade classe 2");
        }else if (imc >= 40.0) {
            System.out.println("Obesidade classe 3");
        }
    }
}
