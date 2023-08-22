package Modulo3;

import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        int distancia;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distancia entre as cidades: ");
        distancia = sc.nextInt();

        if (distancia > 500){
            System.out.println("Distancia considerável a ser percorrida");
        }
        else if (distancia < 100) {
            System.out.println("Distância pequena a ser percorrida");
        }  else{
                System.out.println("Distância média a ser percorrida");
            }
   }
}
