package Modulo2.atividades;

public class Main {
    public static void main(String[] args) {
        int resposta =  Integer.parseInt(args[0]);
        if (resposta == 10) {
            System.out.println("A resposta foi exatamente 10");
        } else if (resposta > 10) {
            System.out.println("A resposta foi maior do que 10.");
        } else {
            System.out.println("A resposta foi menor do que 10");
        }


    }
}