import java.util.TreeSet;

public class MinhaTreeSet {
    public static void main(String[] args) {

        TreeSet<Integer> meuSet = new TreeSet<>();
        int min = 1, max = 100;

        for (int i = 0; i < 100; i++) {
           meuSet.add( (int) Math.floor(Math.random() * (max - min) + 1 + min));
        }
        System.out.println(meuSet);

        System.out.println("Quantidade de Elementos: " + meuSet.size());
        System.out.println(meuSet.contains(5));
        System.out.println(meuSet);

    }
}
