package org.example.teste;

import org.example.estrudurasdados.Vetor;

public class Aula07 {
    public static void main( String[] args ) {

        Vetor vetor = new Vetor(10);
        vetor.addElemento("B ");
        vetor.addElemento("C ");
        vetor.addElemento("E ");
        vetor.addElemento("F ");
        vetor.addElemento("G ");

        System.out.println(vetor);

        vetor.addElemento(0,"A");
        System.out.println(vetor);

        vetor.addElemento(3,"D");
        System.out.println(vetor);



    }
}
