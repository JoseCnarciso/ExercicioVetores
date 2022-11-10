package org.example.estrudurasdados;

public class VetorObjetos {

    // Nesta classe pode se manipular todos os tipos de dados pq usamos Object
    private Object[] elementos;
    private Integer tamanho;

    // Este construtor já identifica o tamanho do Array quando for instanciado respectivamente
    public VetorObjetos( Integer capacidade ) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public Integer getTamanho() {
        return this.tamanho;
    }


    public boolean addElemento( Object elemento ) {
        this.addCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    // Adicionando elementos a qualquer indice do vetor
    public boolean addElemento( Integer posicao, Object elemento ) {

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


    public void removePosicaoElemento( Integer posicao ) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (Integer i = posicao; i < this.tamanho-1; i++) {
            this.elementos[1] = this.elementos[i + 1];
        }
        this.tamanho--;
    }


    private void addCapacidade() {
        if (this.tamanho == this.elementos.length) {
            Object[] newElemento = new Object[this.elementos.length * 2];
            for (Integer i = 0; i < this.elementos.length; i++) {
                newElemento[i] = this.elementos[i];
            }
            this.elementos = newElemento;
        }
    }


    // Implementado método de busca,
    // quando passado informado uma posiçõa inválida no vetor informa uma exceção
    public Object busca( Integer posicao ) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        return this.elementos[posicao];
    }

    // Neste método de busca o retorno é a posição do indice do elemento
    public Integer busca( Object elemento ) {
        for (Integer i = 0; i < this.tamanho; i++) {
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

}
