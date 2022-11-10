package org.example.exercicioscorrigidos;


import org.example.estrudurasdados.ArrayList;

public class Exercicio05 {
    public static void main( String[] args ) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>(5);
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println(list);
        list.clear();

        System.out.println(list);

        ArrayList<String> arrayList = new ArrayList<String>(5);
        arrayList.addElemento("A");
        arrayList.addElemento("B");
        arrayList.addElemento("C");
        arrayList.addElemento("D");
        arrayList.addElemento("E");

        System.out.println(arrayList);
        arrayList.clearAll();

        System.out.println(arrayList);


    }
}
