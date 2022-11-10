package org.example.teste;

import org.example.estrudurasdados.Vetor;

public class Aula08 {
    public static void main( String[] args ) {

        Vetor vetor = new Vetor(3);
        vetor.addElemento("Elemento 1");
        vetor.addElemento("Elemento 2");
        vetor.addElemento("Elemento 3");
        vetor.addElemento("Elemento 4");
        vetor.addElemento("Elemento 5");

        System.out.println(vetor);


    }
}
