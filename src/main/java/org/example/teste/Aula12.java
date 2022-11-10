package org.example.teste;

import java.util.ArrayList;

public class Aula12 {
    public static void main( String[] args ) {

        ArrayList<String>arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("C");
        System.out.println(arrayList);
        arrayList.add(1,"B");

        System.out.println(arrayList);

        boolean existe =  arrayList.contains("B");
        if (existe ){
            System.out.println("Elemento existe");
        }else {
            System.out.println("Elemento nao existe no array");
        }


        int posicao = arrayList.indexOf("D");
        if (posicao > -1){
            System.out.println("Elemento existe:" + posicao);
        }else {
            System.out.println("Elemento nao existe no array: " + posicao);
        }

        System.out.println(arrayList.get(1));

        arrayList.remove("A");

        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList);

        System.out.println(arrayList.size());


    }
}
