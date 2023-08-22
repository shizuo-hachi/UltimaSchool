package Modulo2.atividades;

public class TestaString {
    public static void main(String[] args) {
        String nomeProfessor = new String("André Quadros");
        String nomeAluno = "André Quadros"; //aqui é outra referência na memória, portanto outro objeto.
        //nomeAluno = nomeProfessor; //aqui a referência se torna a mesma

        if(nomeProfessor == nomeAluno){
            System.out.println("Os nomes são iguais. (==)");
        }

        if(nomeProfessor.equals( nomeAluno)){
            System.out.println("Os nomes são iguais. (.equals())");
        }

        nomeAluno = "andré";
        if(nomeProfessor.equalsIgnoreCase( nomeAluno)){
            System.out.println("Os nomes são iguais. (.equalsIgnoreCase())");
        }
        nomeAluno = "Elis Regina";

        System.out.println(nomeProfessor.compareTo("P é maior que A?" + nomeAluno));
        System.out.println(nomeAluno.compareTo("A é maior que P?" + nomeProfessor));

        String nome = "Ultimo da Silva";
        String nomeAlterado = nome.replace('o', 'a');
        System.out.println(nomeAlterado);

        nome = "André Quadros";
        String substring1 = nome.substring(5);

        System.out.println(substring1);



    }
}
