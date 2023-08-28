package Modulo3;

import java.util.Scanner;

//Versão PROVISÓRIA da classe de cadastro de alunos
public class Cadastro1 {
    public static void main(String[] args) {
        int quantidade;
        String nome, disciplina;
        double media;
        int contador;

        Scanner sc = new Scanner(System.in);

        nome = " ";
        disciplina = " ";
        media = 1.0;

        System.out.println("Digite a quantidade de alunos que deseja cadastrar");
        quantidade =  sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome do aluno: ");
            nome = sc.next();
            System.out.println("Digite a disciplina: ");
            disciplina = sc.next();
            System.out.println("Digite a média final da disciplina: ");
            media = sc.nextDouble();
            System.out.println("Aluno: " + nome + " da disciplina: " + disciplina + " com média= " + media);

        }


    }
}
