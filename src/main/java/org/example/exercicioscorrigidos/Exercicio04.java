package org.example.exercicioscorrigidos;

import org.example.estrudurasdados.ArrayList;

public class Exercicio04 {
    public static void main( String[] args ) {
        ArrayList<String> arrayList = new ArrayList<String>(5);
        arrayList.addElemento("A");
        arrayList.addElemento("B");
        arrayList.addElemento("C");
        arrayList.addElemento("D");
        arrayList.addElemento("E");

        System.out.println(arrayList.obtem(0));
        System.out.println(arrayList.obtem(2));
        System.out.println(arrayList.obtem(4));
    }
}
