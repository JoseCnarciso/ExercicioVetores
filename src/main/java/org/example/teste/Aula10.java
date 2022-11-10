package org.example.teste;
import org.example.estrudurasdados.VetorObjetos;

public class Aula10 {

    public static void main( String[] args ) {
        VetorObjetos vetor = new VetorObjetos(3);
        Contato c1 = new Contato("Contato 1", "998295441","josecdia@hotmail.com");
        Contato c2 = new Contato("Contato 2", "999752989","francisco@hotmail.com");
        Contato c3 = new Contato("Contato 3", "999932292","fone@hotmail.com");



        System.out.println("Tamanho = " + vetor.getTamanho());
        System.out.println(vetor);

    }





}
