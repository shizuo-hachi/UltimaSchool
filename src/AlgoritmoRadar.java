import java.util.Scanner;

public class AlgoritmoRadar {
    public static void main(String[] args) {
        float velocidadeVeiculo, velocidadeMax;
        Scanner in = new Scanner(System.in);
        //Leia velocidadeVeiculo.
        System.out.print("Velocidade do Veículo: ");
        velocidadeVeiculo = in.nextFloat();
        //Leia velocidadeMaxima.
        System.out.print("Velocidade Máxima: ");
        velocidadeMax= in.nextFloat();

        velocidadeMax = velocidadeMax + (velocidadeMax / 10);

        //Se velocidadeVeiculo > velocidadeMaxima Então
        if(velocidadeVeiculo > velocidadeMax){
            System.out.println("Multado!");
        } else {
            System.out.println("OK!");
        }
    }
}
