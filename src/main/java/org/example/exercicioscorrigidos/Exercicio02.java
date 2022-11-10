package org.example.exercicioscorrigidos;

import org.example.estrudurasdados.ArrayList;

public class Exercicio02 {
    public static void main( String[] args ) {
        java.util.ArrayList<String> arrayList = new java.util.ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("A");

        System.out.println(arrayList.lastIndexOf("A"));

        ArrayList<String> lista = new ArrayList<>(5);
        lista.addElemento("A");
        lista.addElemento("B");
        lista.addElemento("A");
        System.out.println(lista.ultimoIndice("A"));

    }
}
