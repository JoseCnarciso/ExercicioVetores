package org.example.exercicioscorrigidos;

import org.example.estrudurasdados.ArrayList;

public class Exercicio03 {
    public static void main( String[] args ) {

        ArrayList<String> arrayList = new ArrayList<String>(5);
        arrayList.addElemento("A");
        arrayList.addElemento("B");
        arrayList.addElemento("C");
        arrayList.addElemento("D");
        arrayList.addElemento("E");

        System.out.println(arrayList);

        arrayList.remove("A");
        System.out.println(arrayList);

        arrayList.remove("E");
        System.out.println(arrayList);

        arrayList.remove("C");
        System.out.println(arrayList);



    }
}
