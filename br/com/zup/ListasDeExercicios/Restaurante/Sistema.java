package br.com.zup.ListasDeExercicios.Restaurante;

import java.util.Scanner;

public class Sistema {
    //Menu
    public static void menu(){
        System.out.println("Bem vindo ao Los pollos hermanos");
        System.out.println("Segue opções: ");
        System.out.println("1 - Cadastrar novo prato");
        System.out.println("2 - Mostrar cardápio");
        System.out.println("3 - Sair do programa");
    }
    //Automatizando entrada de dados
    private static Scanner capturaDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    //Cadastrar Pratos
    public static Pratos cadastrarPratos(){
        String nomePrato = capturaDados("Digite o nome do prato: ").nextLine();
        double valorPrato =  capturaDados("Digite o valor do prato: R$ ").nextDouble();

        Pratos prato = new Pratos(nomePrato, valorPrato);
        return prato;
    }
    public static Ingredientes cadastrarIngredientes(){
        String nomeIngrediente = capturaDados("Digite o nome do ingrediente: ").nextLine();
        double qtdIngrediente = capturaDados("Digite a quantidade necessária do ingrediente: ").nextDouble();

        Ingredientes ingrediente = new Ingredientes(nomeIngrediente,qtdIngrediente);
        return ingrediente;
    }
    public static void executar(){
        Cardapio cardapio = new Cardapio();
        boolean menu = true;

        while(menu){
            menu();
            int opcao = capturaDados("Digite a opção desejada: ").nextInt();

            if (opcao == 1){
                Pratos prato = cadastrarPratos();
                int qtdIngredientes = capturaDados("Digite a quantidade de ingredientes: ").nextInt();

                for (int i = 0; i<  qtdIngredientes; i++){
                    Ingredientes ingrediente = cadastrarIngredientes();
                    prato.cadastrarIngredientes(ingrediente);
                }
                cardapio.adicionaPratos(prato);
            }
        }
    }
}
