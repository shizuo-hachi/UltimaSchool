package Modulo2.atividades;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLista {
    public static void main(String[] args) {
        ArrayList<String> inventario = new ArrayList<>();

        inventario.add("Poção de Cura");
        inventario.add("Chave do Tesouro");
        inventario.add("Adaga Envenenada");
        inventario.add("Pergaminho");
        inventario.add("Amuleto de Proteção");
        inventario.add("Pergaminho");

        System.out.println(inventario);
        System.out.println(inventario.get(5));
        inventario.set(5, "Tocha");
        System.out.println(inventario);
        System.out.println(inventario.contains("Adaga Envenenada"));
        System.out.println(inventario.contains("Espada Vorpal"));
        Collections.sort(inventario);
        System.out.println(inventario);
        inventario.clear();
        System.out.println(inventario);
    }
}
