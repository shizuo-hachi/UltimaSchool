package Modulo3;

import java.util.Scanner;

public class Cadastro3 {
    public static void main(String[] args) {
        int quantidade;
        String nome, disciplina;
        double media;
        int contador = 0;

        Scanner sc = new Scanner(System.in);

        nome = " ";
        disciplina = " ";
        media = 1.0;

        System.out.println("Digite a quantidade de alunos que deseja cadastrar");
        quantidade =  sc.nextInt();

        do {
            System.out.println("Digite o nome do aluno: ");
            nome = sc.next();
            System.out.println("Digite a disciplina: ");
            disciplina = sc.next();
            System.out.println("Digite a média final da disciplina: ");
            media = sc.nextDouble();
            contador++;
        } while (contador < quantidade);

        System.out.println("Aluno: " + nome + " da disciplina: " + disciplina + " com média= " + media);
    }
}
