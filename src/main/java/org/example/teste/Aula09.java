package org.example.teste;

import org.example.estrudurasdados.Vetor;

public class Aula09 {
    public static void main( String[] args ) {

        Vetor vetor = new Vetor(3);
        vetor.addElemento("B");
        vetor.addElemento("G");
        vetor.addElemento("D");
        vetor.addElemento("E");
        vetor.addElemento("F");

        System.out.println("\n" + vetor);

        vetor.removePosicaoElemento(1);

        System.out.println("\n" + vetor);
        System.out.println("--------------------");

        System.out.println("Remover o elemento E");
        System.out.println("\n" + vetor);

        int pos = vetor.busca("E");
        if (pos > -1){
            vetor.removePosicaoElemento(pos);
        } else {
            System.out.println("Elemento nao existe no vetor");
        }

        System.out.println("\n" + vetor);
        System.out.println("--------------------------");


        System.out.println("Remover o elemento A");

        int pos1 = vetor.busca("A");
        if (pos1 > -1){
            vetor.removePosicaoElemento(pos1);
        } else {
            System.out.println("Elemento nao existe no vetor");
        }

        System.out.println("\n" + vetor);
    }
}
