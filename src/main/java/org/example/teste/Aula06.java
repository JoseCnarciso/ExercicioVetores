package org.example.teste;

import org.example.estrudurasdados.Vetor;

public class Aula06 {
    public static void main( String[] args ) {
        Vetor vetor = new Vetor(10);

        vetor.addElemento("Elementos 1 ");
        vetor.addElemento("Elementos 2 ");
        vetor.addElemento("Elementos 3 ");
        vetor.addElemento("Elementos 4 ");

        System.out.println(vetor.busca("Elementos 4 "));

    }
}
