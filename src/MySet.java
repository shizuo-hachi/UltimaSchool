import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class MySet {
    public static void main(String[] args) {
        Set<String> grupo1, grupo2;
        grupo1 = new HashSet<String>();
        grupo2 = new TreeSet<String>();

        String nome1 = "ana";
        String nome2 = "maria";
        String nome3 = "rodrigo";
        String nome4 = "joão";
        String nome5 = "beatriz";
        String nome6 = "ana";
        String nome7 = "Ana";

        grupo1.add(nome1);
        grupo1.add(nome2);
        grupo1.add(nome3);
        grupo1.add(nome4);
        grupo1.add(nome5);
        grupo1.add(nome6);
        grupo1.add(nome7);

        grupo2.add(nome1);
        grupo2.add(nome2);
        grupo2.add(nome3);
        grupo2.add(nome4);
        grupo2.add(nome5);
        grupo2.add(nome6);
        grupo2.add(nome7);

        String [] grupo3 = new String []{nome1, nome2, nome3, nome4, nome5, nome6, nome7};

        System.out.println("Grupo 1 com HashSet:");
        for (String nome: grupo1) {
            System.out.println(nome+", ");
        }

        System.out.println("\nGrupo 2 com TreeSet: ");
        for (String nome :
                grupo2) {
            System.out.println(nome+", ");
        }

        System.out.println("\nGrupo3 de array: ");
        for (int i = 0; i < grupo3.length; i++) {
            System.out.println(grupo3[i]);
        }
    }
}
