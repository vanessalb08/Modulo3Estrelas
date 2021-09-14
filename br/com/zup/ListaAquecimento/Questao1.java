package br.com.zup.ListaAquecimento;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String, Double> listaProdutos = new HashMap<String, Double>();

        String nomeProduto;
        String excluirProduto;
        int opcao;
        double precoProduto;
        boolean executarPrograma = true;


        while (executarPrograma == true) {
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Exibir produtos");
            System.out.println("3 - Excluir produtos");
            System.out.println("4 - Sair");

            opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o nome do produto:");
                nomeProduto = leitor.nextLine();
                System.out.println("Digite o preço do produto:");
                precoProduto = leitor.nextDouble();

                if (listaProdutos.size() > 0) {
                    for (String verificaNome : listaProdutos.keySet()) {
                        if (verificaNome.equals(nomeProduto)) {
                            System.out.println("Produto já cadastrado, digite um novo produto.");
                        } else {
                            listaProdutos.put(nomeProduto, precoProduto);
                            System.out.println("Produto Cadastrado!");
                        }
                    }

                } else {
                    listaProdutos.put(nomeProduto, precoProduto);
                    System.out.println("Produto Cadastrado!");
                }

            } else if (opcao == 2) {
                System.out.println(listaProdutos);
            } else if (opcao == 3) {
                System.out.println("Digite o nome do produto que deseja excluir");
                excluirProduto = leitor.nextLine();
                listaProdutos.remove(excluirProduto);
                System.out.println("Produto excluído com sucesso!");
            } else if (opcao == 4) {
                executarPrograma = false;
                System.out.println("Até mais!");
            } else {
                System.out.println("Digite uma opção válida!");
            }
        }

    }
}
