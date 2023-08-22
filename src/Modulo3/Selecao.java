package Modulo3;

import java.util.Scanner;

public class Selecao {
    public static void main(String[] args) {
        int opcao;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a opção de acordo com o seu estado civil.\n 1- Casado \n 2- Solteiro\n 3- Divorciado \n 4- Viúvo \n");

        opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Casado");
                break;
            case 2:
                System.out.println("Solteiro");
                break;
            case 3:
                System.out.println("Divorciado");
                break;
            case 4:
                System.out.println("Viúvo");
                break;
            default:
                System.out.println("Estado civil incorreto");
                break;
        }

    }
}
