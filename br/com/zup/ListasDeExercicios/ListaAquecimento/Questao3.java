package br.com.zup.ListasDeExercicios.ListaAquecimento;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String, String> cardapio = new HashMap<String, String>();

        String nomePrato;
        String ingredientes;
        String excluir;
        int opcao;

        System.out.println("Digite a opção desejada:");
        System.out.println("1 - Adicionar novo prato");
        System.out.println("2 - Exibir cardápio");
        System.out.println("3 - Excluir prato");
        System.out.println("4 - Sair");
        opcao = leitor.nextInt();
        leitor.nextLine();

        while (opcao != 4) {
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do prato");
                    nomePrato = leitor.nextLine();
                    System.out.println("Digite os ingredientes do prato (Separados por , )");
                    ingredientes = leitor.nextLine();
                    if(cardapio.size()>0){
                        for (String verifica : cardapio.keySet()){
                            if (verifica.equals(nomePrato)){
                                System.out.println("Prato já cadastrado");
                            }
                            else{
                                cardapio.put(nomePrato, " Ingredientes: " + ingredientes);
                                System.out.println("Prato adicionado ao cardápio");
                            }
                        }
                    }
                    else{
                        cardapio.put(nomePrato, " Ingredientes: " + ingredientes);
                        System.out.println("Prato adicionado ao cardápio");
                    }
                    break;

                case 2:
                    System.out.println(cardapio);
                    break;
                case 3:
                    System.out.println("Digite o nome do prato que deseja excluir;");
                    excluir = leitor.nextLine();
                    cardapio.remove(excluir);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Adicionar novo prato");
            System.out.println("2 - Exibir cardápio");
            System.out.println("3 - Excluir prato");
            System.out.println("4 - Sair");
            opcao = leitor.nextInt();
            leitor.nextLine();
        }
    }
}
