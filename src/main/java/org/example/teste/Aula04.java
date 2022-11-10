package org.example.teste;

import org.example.estrudurasdados.Vetor;

public class Aula04 {
    public static void main( String[] args ) {

        Vetor vetor = new Vetor(10);

        vetor.addElemento("Elemento 1");
        vetor.addElemento("Elemento 2");
        vetor.addElemento("Elemento 3");


        System.out.println(vetor.getTamanho());

        System.out.println(vetor.toString());


    }
}
