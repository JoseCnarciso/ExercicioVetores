package org.example.estrudurasdados;

import java.lang.reflect.Array;

public class ArrayList<T> {

    // Nesta classe pode se manipular todos os tipos de dados pq usamos Object
    private T[] elementos;
    private Integer tamanho;

    // Este construtor já identifica o tamanho do Array quando for instanciado respectivamente
    public ArrayList( Integer capacidade ) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public ArrayList( Integer capacidade, Class<T> tipoClasse ) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public Integer getTamanho() {
        return this.tamanho;
    }


    public boolean addElemento( T elemento ) {
        this.addCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    // Adicionando elementos a qualquer indice do vetor
    public boolean addElemento( Integer posicao, T elemento ) {

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        this.addCapacidade();
        // Movendo todos os elementos
        for (Integer i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        // Atribuindo os elementos ao indíce
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    private void addCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] newElemento = (T[]) new Object[this.elementos.length * 2];
            for (Integer i = 0; i < this.elementos.length; i++) {
                newElemento[i] = this.elementos[i];
            }
            this.elementos = newElemento;
        }
    }

    public T obtem( Integer posicao ) {
        return this.busca(posicao);
    }


    // Implementado método de busca,
    // quando passado informado uma posiçõa inválida no vetor informa uma exceção
    public T busca( Integer posicao ) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        return this.elementos[posicao];
    }

    // Neste método de busca o retorno é a posição do indice do elemento
    public Integer busca( T elemento ) {
        for (Integer i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public Integer ultimoIndice( T elemento ) {
        for (Integer i = this.tamanho - 1; i >= 0; i--) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    // Neste método só é impresso os indíces que estão sendo utilizados
    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[ ");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append(" ]");
        return s.toString();
    }

    public boolean contem( T elemento ) {
//        Integer posicao = busca(elemento);
//        if(posicao > -1){
//            return true;
//        }
//        return false;

        return busca(elemento) > -1;
    }

    public void remove( Integer posicao ) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (Integer i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    public void remove( T elemento ) {
        int pos = this.busca(elemento);
        if (pos > -1) {
            this.remove(pos);
        }
    }

    public void clearAll() {
//        //Opção 1
//        this.elementos = (T[]) new Object[this.elementos.length];
//
////        //Opção 2
////        this.tamanho = 0;
////
        //Opção 3
        for (int i = 0; i < this.tamanho; i++){
            this.elementos[i] = null;
        }
        this.tamanho = 0;

    }

}


