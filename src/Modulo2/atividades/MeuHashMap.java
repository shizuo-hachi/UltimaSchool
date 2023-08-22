package Modulo2.atividades;

import java.util.HashMap;
public class MeuHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("C", 1);
        map.put("B", 2);
        map.put("A", 3);
        map.put("X", 10);
        System.out.println(map);
        System.out.print("Tamanho do mapa: ");
        System.out.println(map.size());
        System.out.println("Têm a chave A aí? " + map.containsKey("A"));
        System.out.println("Têm sim a chave A é: " + map.get("A"));
        map.put("A", 9);
        System.out.println("Têm sim a chave A é: " + map.get("A"));
        System.out.println("E a chave X tem? " + map.containsKey("X"));
        System.out.println("Tem sim: " +map.get("X"));
        System.out.println(map);
        map.remove("X");
        System.out.println("Tem não... " + map.get("X"));
        System.out.println(map);
    }
}
