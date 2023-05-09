import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ExameDirecaoAtM2S1 {
    public static void main(String[] args) {
        boolean faltaEliminatoria = false;
        int tentativaBaliza = 0;
        int faltaGrave = 0;
        int faltaMedia = 0;
        int faltaLeve = 0;
        int anoDeNascimento = 0;
        int idade = 0;

        Calendar calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);

        Scanner in = new Scanner(System.in);

        System.out.println("Qual o ano do nascimento?");
        anoDeNascimento = in.nextInt();
        idade = year - anoDeNascimento;

        if(idade < 18){
            System.out.println("Você não pode dirigir!");
        } else {
            System.out.print("Baliza: ");
            tentativaBaliza = in.nextInt();
            System.out.println("Faltas graves: ");
            faltaGrave = in.nextInt();

            System.out.println("Faltas medias: ");
            faltaMedia = in.nextInt();
            System.out.println("Faltas leves: ");
            faltaLeve = in.nextInt();

            faltaGrave = faltaGrave * 3;
            faltaMedia = faltaMedia * 2;

            if (tentativaBaliza > 3) {
                faltaEliminatoria = true;
            } else if ((faltaGrave + faltaMedia + faltaLeve) > 3) {
                faltaEliminatoria = true;
            }

            if (faltaEliminatoria) {
                System.out.println("Reprovado!");
            } else {
                System.out.println("Aprovado!");
            }
        }
    }
}
