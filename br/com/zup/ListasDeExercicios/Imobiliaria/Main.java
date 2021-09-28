package br.com.zup.ListasDeExercicios.Imobiliaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Imobiliaria imobiliaria = new Imobiliaria();
        int opcao;
        boolean menu = true;

        while (menu){
            System.out.println("Escolha a opção: ");
            System.out.println("1 - Cadastrar imóvel");
            System.out.println("2 - Exibir imóveis cadastrados");
           // System.out.println("3 - Cadastrar morador");
            System.out.println("3 - Sair");

            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite o endereço do imóvel");
                    String endereco = leitor.nextLine();
                    System.out.println("Digite o valor do aluguel");
                    double valorAluguel = leitor.nextDouble();
                    leitor.nextLine();
                    System.out.println("Digite o funcionário responsável");
                    String nomeFuncionario = leitor.nextLine();
                    System.out.println("Digite o cpf do funcionário:");
                    String cpf = leitor.nextLine();
                    System.out.println("Digite a CTPS do funcionario");
                    String ctps = leitor.nextLine();

                    //Instanciando os objetos
                    Funcionario funcionario = new Funcionario(nomeFuncionario,cpf,ctps);
                    Imovel imovel = new Imovel(endereco,valorAluguel,funcionario);
                    //Cadastrando imóvel na imobiliária
                    imobiliaria.adicionarImovel(imovel);

                    System.out.println("Digite a quantidade de moradores:");
                    int qtdMoradores = leitor.nextInt();
                    leitor.nextLine();
                    if (qtdMoradores == 0){
                        break;
                    }
                    else if(qtdMoradores > 0){
                        for (int i = 0; i < qtdMoradores ; i++){
                            System.out.println("Digite o nome do morador: ");
                            String nomeMorador = leitor.nextLine();
                            System.out.println("Digite o CPF do morador: ");
                            String cpfMorador = leitor.nextLine();
                            System.out.println("Digite a renda do morador:");
                            double renda = leitor.nextDouble();
                            leitor.nextLine();

                            Moradores moradores = new Moradores(nomeMorador,cpfMorador,renda);
                            imovel.adicionarMorador(moradores);
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println(imobiliaria);
                    break;
                case 3:
                    System.out.println("Até Mais!");
                    menu = false;
                    break;
            }
        }
    }
}
