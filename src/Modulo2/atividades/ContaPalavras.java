package Modulo2.atividades;

public class ContaPalavras {
    public static void main(String[] args) {
        String frase = "The quick brown fox jumps over the lazy dog";
        String[] frasesep = frase.split("\\s");
        System.out.print("A frase \"" + frase + ".\" possui " + frase.length() + " caracteres");
        System.out.println(" e " + frasesep.length + " palavras." );



    }
}
