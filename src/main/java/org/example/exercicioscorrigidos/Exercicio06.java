package org.example.exercicioscorrigidos;

import org.example.estrudurasdados.ArrayList;
import org.example.teste.Contato;

import java.util.Scanner;

public class Exercicio06 {
    public static void main( String[] args ) {
        // Criação das variaveis
        Scanner scanner = new Scanner(System.in);

        // Criar vetor com 20 contatos
        ArrayList<Contato> arrayList = new ArrayList<Contato>(20);

        // Criar e adicionar X contatos
        criarContatosDinamicamente(5, arrayList);


        // Criar um menu para o usuário navegar
        int opcao = 1;
        while (opcao != 0) {
            opcao = menu(scanner);

            switch (opcao) {
                case 1: {
                    addContatoFinal(scanner, arrayList);
                    break;
                }
                case 2: {
                    addContatoPosicao(scanner, arrayList);
                    break;
                }
                case 3: {
                    obtemContatoPosicao(scanner, arrayList);
                    break;
                }
                case 4: {
                    obtemContato(scanner, arrayList);
                    break;
                }
                case 5: {
                    pesquisarUltimoIndice(scanner, arrayList);
                    break;
                }
                case 6: {
                    pesquisarContatoExiste(scanner, arrayList);
                    break;
                }
                case 7: {
                    excluirPorPosicao(scanner, arrayList);
                    break;
                }
                case 8: {
                    excluirContato(scanner, arrayList);
                    break;
                }
                case 9: {
                    imprimeTamanhoVetor(arrayList);
                    break;
                }
                case 10: {
                    limparVetor(arrayList);
                    break;
                }
                case 11: {
                    imprimirVetor(arrayList);
                    break;
                }
            }
        }
        System.out.println("Usuario digitou 0 programa finalizado");
    }

    private static void imprimirVetor( ArrayList<Contato> arrayList ) {
        System.out.println(arrayList);
    }

    private static void limparVetor( ArrayList<Contato> arrayList ) {
        arrayList.clearAll();
        System.out.println("Todos os contatos do vetor foram excluidos: ");
    }

    private static void imprimeTamanhoVetor( ArrayList<Contato> arrayList ){

        System.out.println("Tamanho do vetor é de: " + arrayList.getTamanho());
    }


    static void excluirContato( Scanner scanner, ArrayList<Contato> arrayList ) {

        int posicao = lerInformacaoInt("Entre com a posicao a ser removida", scanner);

        try {
            Contato contato = arrayList.busca(posicao);
            arrayList.remove(contato);

        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }

    private static void excluirPorPosicao( Scanner scanner, ArrayList<Contato> arrayList ) {
        int posicao = lerInformacaoInt("Entre com a posicao a ser removida", scanner);

        try {
            arrayList.remove(posicao);
            System.out.println("Contato excluido");

        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }

    private static void pesquisarContatoExiste( Scanner scanner, ArrayList<Contato> arrayList ) {
        int posicao = lerInformacaoInt("Entre com a posicao a ser pesquisada", scanner);

        try {
            Contato contato = arrayList.busca(posicao);

            boolean existe = arrayList.contem(contato);

            if (existe) {
                System.out.println("Contato existente \n" + contato);

            } else {
                System.out.println("Contato não existe");
            }

        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }

    private static void pesquisarUltimoIndice( Scanner scanner, ArrayList<Contato> arrayList ) {
        int posicao = lerInformacaoInt("Entre com a posicao a ser pesquisada", scanner);

        try {
            Contato contato = arrayList.busca(posicao);
            System.out.println("Contato existente \n" + contato);

            System.out.println("Fazendo pesquisa do ultimo indice encontrado: ");
            posicao = arrayList.ultimoIndice(contato);

            System.out.println("Contato encontrado na posição: " + posicao);


        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }

    private static void obtemContato( Scanner scanner, ArrayList<Contato> arrayList ) {
        int posicao = lerInformacaoInt("Entre com a posicao a ser pesquisada", scanner);

        try {
            Contato contato = arrayList.busca(posicao);
            System.out.println("Contato existente \n" + contato);

            System.out.println("Fazendo pesquisa do contato encon trado: ");
            posicao = arrayList.busca(contato);

            System.out.println("Contato encontrado na posição: " + posicao);


        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }

    private static void obtemContatoPosicao( Scanner scanner, ArrayList<Contato> arrayList ) {
        int posicao = lerInformacaoInt("Entre com a posicao a ser pesquisada", scanner);
        try {
            Contato contato = arrayList.busca(posicao);

            System.out.println("Contato existente \n" + contato);
        } catch (Exception e) {
            System.out.println("Posicao invalida");
        }
    }

    private static void addContatoFinal( Scanner scanner, ArrayList<Contato> arrayList ) {
        System.out.println("Cadastrando contato");
        String nome = lerInformacao("Informe o nome: ", scanner);
        String telefone = lerInformacao("Informe o telefone: ", scanner);
        String email = lerInformacao("Informe o email: ", scanner);

        Contato contato = new Contato(nome, telefone, email);

        arrayList.addElemento(contato);


        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void addContatoPosicao( Scanner scanner, ArrayList<Contato> arrayList ) {

        System.out.println("Cadastrando contato");
        String nome = lerInformacao("Informe o nome: ", scanner);
        String telefone = lerInformacao("Informe o telefone: ", scanner);
        String email = lerInformacao("Informe o email: ", scanner);

        Contato contato = new Contato(nome, telefone, email);
        Integer posicao = lerInformacaoInt("Entre con a posicao a adicionar",scanner);

        try{
        arrayList.addElemento(contato);
        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
        }catch (Exception e){
            System.out.println("Posicao invalida");
        }
    }

    protected static Integer lerInformacaoInt( String msg, Scanner scanner ) {
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

    protected static String lerInformacao( String msg, Scanner scanner ) {
        System.out.println(msg);
        String entrada = scanner.nextLine();
        return entrada;
    }

    static Integer menu( Scanner scanner ) {

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
            System.out.println("11: Imprimir vetor");
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

    protected static void criarContatosDinamicamente( int quantidade, ArrayList<Contato> arrayList ) {

        Contato contato;

        for (int i = 1; i <= quantidade; i++) {

            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("1111111" + i);
            contato.setEmail("contato" + i + "@email.com");

            arrayList.addElemento(contato);
        }
    }

}
