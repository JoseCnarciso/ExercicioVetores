package org.example.estrudurasdados.vetor;

public class Vetor {

    private String[] elementos;
    private Integer tamanho;

    // Este construtor já identifica o tamanho do Array quando for instanciado respectivamente
    public Vetor( Integer capacidade ) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public Integer getTamanho() {
        return this.tamanho;
    }

//    public void addElemento( String elemento ) {
//        for (int i = 0; i < this.elementos.length; i++) {
//            if (this.elementos[i] == null) {
//                this.elementos[i] = elemento;
//                break;
//            }
//        }
//    }


//    public void addElemento(String elemento) throws Exception {
//        if (this.tamanho < this.elementos.length) {
//            this.elementos[this.tamanho] = elemento;
//            this.tamanho++;
//        }else {
//            throw new Exception("Vetor já está cheio, não é possivel adicionar mais elementos ");
//        }
//    }


    public boolean addElemento( String elemento ) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    // Implementado método de busca,
    // quando passado informado uma posiçõa inválida no vetor informa uma exceção
    public String busca( Integer posicao ) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    // Neste método de busca o retorno é a posição do indice do elemento
    public Integer busca( String elemento ) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equalsIgnoreCase(elemento)){
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
