package org.example.exercicioscorrigidos;

import org.example.estrudurasdados.ArrayList;

public class exercicio01 {
    public static void main( String[] args ) {
        ArrayList<String> arrayList = new ArrayList<>(5);

        arrayList.addElemento("A");
        arrayList.addElemento("B");
        arrayList.addElemento("C");
        arrayList.addElemento("D");

        System.out.println(arrayList.contem("A"));
        System.out.println(arrayList.contem("B"));
        System.out.println(arrayList.contem("E"));

    }

}
