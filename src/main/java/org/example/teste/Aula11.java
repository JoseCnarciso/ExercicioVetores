package org.example.teste;

import org.example.estrudurasdados.ArrayList;

public class Aula11 {
    public static void main( String[] args ) {

        ArrayList<String> vetor = new ArrayList<>(1);
        vetor.addElemento("elemento");
        System.out.println(vetor);

        ArrayList<Contato> vetorC = new ArrayList<>(1);
        vetorC.addElemento(new Contato("Contato 2", "999752989", "francisco@hotmail.com"));

        System.out.println(vetorC);
    }
}
