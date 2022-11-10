package org.example.exercicioscorrigidos;

import org.example.estrudurasdados.Lista;
import org.example.teste.Contato;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio06 {
    public static void main( String[] args ) {
        // Criação das variaveis
        Scanner scanner = new Scanner(System.in);

        // Criar vetor com 20 contatos
        Lista<Contato> lista = new Lista<Contato>(20);

        // Criar e adicionar X contatos
        criarContatosDinamicamente(5, lista);


        // Criar um menu para o usuário navegar
        int opcao = 1;
        while (opcao != 0) {
            opcao = menu(scanner);

            switch (opcao) {
                case 1: {
                    addContatoFinal(scanner, lista);
                    break;
                }
                case 2: {
                    addContatoPosicao(scanner, lista);
                    break;
                }
                case 3: {
                    obtemContatoPosicao(scanner, lista);
                    break;
                }
                case 4: {
                    obtemContato(scanner, lista);
                    break;
                }
                case 5: {
                    pesquisarUltimoIndice(scanner, lista);
                    break;
                }
                case 6: {
                    pesquisarContatoExiste(scanner, lista);
                    break;
                }
                case 7: {
                    excluirPorPosicao(scanner, lista);
                    break;
                }
                case 8: {
                    excluirContato(scanner, lista);
                    break;
                }
                case 9: {
                    imprimeTamanhoVetor(lista);
                    break;
                }
                case 10: {
                    limparVetor(lista);
                    break;
                }
                case 11: {
                    imprimirVetor(lista);
                    break;
                }
            }
        }
        System.out.println("Usuario digitou 0 programa finalizado");
    }

    private static void imprimirVetor( Lista<Contato> lista ) {
        System.out.println(lista);
    }

    private static void limparVetor( Lista<Contato> lista ) {
        lista.clearAll();
        System.out.println("Todos os contatos do vetor foram excluidos: ");
    }

    private static void imprimeTamanhoVetor(Lista<Contato> lista){

        System.out.println("Tamanho do vetor é de: " + lista.getTamanho());
    }


    static void excluirContato( Scanner scanner, Lista<Contato> lista ) {

        int posicao = lerInformacaoInt("Entre com a posicao a ser removida", scanner);

        try {
            Contato contato = lista.busca(posicao);
            lista.remove(contato);

        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }

    private static void excluirPorPosicao( Scanner scanner, Lista<Contato> lista ) {
        int posicao = lerInformacaoInt("Entre com a posicao a ser removida", scanner);

        try {
            lista.remove(posicao);
            System.out.println("Contato excluido");

        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }

    private static void pesquisarContatoExiste( Scanner scanner, Lista<Contato> lista ) {
        int posicao = lerInformacaoInt("Entre com a posicao a ser pesquisada", scanner);

        try {
            Contato contato = lista.busca(posicao);

            boolean existe = lista.contem(contato);

            if (existe) {
                System.out.println("Contato existente \n" + contato);

            } else {
                System.out.println("Contato não existe");
            }

        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }

    private static void pesquisarUltimoIndice( Scanner scanner, Lista<Contato> lista ) {
        int posicao = lerInformacaoInt("Entre com a posicao a ser pesquisada", scanner);

        try {
            Contato contato = lista.busca(posicao);
            System.out.println("Contato existente \n" + contato);

            System.out.println("Fazendo pesquisa do ultimo indice encontrado: ");
            posicao = lista.ultimoIndice(contato);

            System.out.println("Contato encontrado na posição: " + posicao);


        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }

    private static void obtemContato( Scanner scanner, Lista<Contato> lista ) {
        int posicao = lerInformacaoInt("Entre com a posicao a ser pesquisada", scanner);

        try {
            Contato contato = lista.busca(posicao);
            System.out.println("Contato existente \n" + contato);

            System.out.println("Fazendo pesquisa do contato encon trado: ");
            posicao = lista.busca(contato);

            System.out.println("Contato encontrado na posição: " + posicao);


        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }

    private static void obtemContatoPosicao( Scanner scanner, Lista<Contato> lista ) {
        int posicao = lerInformacaoInt("Entre com a posicao a ser pesquisada", scanner);
        try {
            Contato contato = lista.busca(posicao);

            System.out.println("Contato existente \n" + contato);
        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }

    private static void addContatoFinal( Scanner scanner, Lista<Contato> lista ) {
        System.out.println("Cadastrando contato");
        String nome = lerInformacao("Informe o nome: ", scanner);
        String telefone = lerInformacao("Informe o telefone: ", scanner);
        String email = lerInformacao("Informe o email: ", scanner);

        Contato contato = new Contato(nome, telefone, email);

        lista.addElemento(contato);


        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void addContatoPosicao( Scanner scanner, Lista<Contato> lista ) {

        System.out.println("Cadastrando contato");
        String nome = lerInformacao("Informe o nome: ", scanner);
        String telefone = lerInformacao("Informe o telefone: ", scanner);
        String email = lerInformacao("Informe o email: ", scanner);

        Contato contato = new Contato(nome, telefone, email);
        Integer posicao = lerInformacaoInt("Entre con a posicao a adicionar",scanner);

        try{
        lista.addElemento(contato);
        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
        }catch (Exception e){
            System.out.println("Posicao invalida");
        }
    }

    private static Integer lerInformacaoInt( String msg, Scanner scanner ) {
        boolean entradaValida = false;
        Integer numero = 0;

        while (!entradaValida) {
            try {
                System.out.println(msg);
                String entrada = scanner.nextLine();

                numero = Integer.parseInt(entrada);

                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Entrada invalida gigite novamente");
            }
        }
        return numero;
    }

    private static String lerInformacao( String msg, Scanner scanner ) {
        System.out.println(msg);
        String entrada = scanner.nextLine();
        return entrada;
    }

    private static Integer menu( Scanner scanner ) {

        boolean entradaValida = false;
        int opcao = 0;
        String entrada;

        while (!entradaValida) {

            System.out.println(">>>Digite a opcao desejada<<<");
            System.out.println("1: Adicionar contato no final do vetor");
            System.out.println("2: Adicionar contato em uma posiçao especifica");
            System.out.println("3: Consultar contato de uma posiçao especifica");
            System.out.println("4: Pesquisar contato");
            System.out.println("5: Consulta o ultimo indice do contato");
            System.out.println("6: Verefica se o contato existe");
            System.out.println("7: Remove contato por posiçao");
            System.out.println("8: Exclui contato");
            System.out.println("9: Verifica o tamanho do vetor");
            System.out.println("10: Excluir todos os contatos do vetor ");
            System.out.println("11: Imprimir vertor");
            System.out.println("0: Sair");

            try {
                entrada = scanner.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao >= 0 && opcao <= 11) {
                    entradaValida = true;
                } else {
                    throw new Exception("\"Entrada invalida,  digite novamente\"");
                }

            } catch (Exception e) {
                System.out.println("Entrada invalida,  digite novamente\n\n");
            }
        }

        return opcao;
    }

    protected static void criarContatosDinamicamente( int quantidade, Lista<Contato> lista ) {

        Contato contato;

        for (int i = 1; i <= quantidade; i++) {

            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("1111111" + i);
            contato.setEmail("contato" + i + "@email.com");

            lista.addElemento(contato);
        }
    }

}
