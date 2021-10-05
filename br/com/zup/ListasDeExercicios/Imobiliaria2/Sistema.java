package br.com.zup.ListasDeExercicios.Imobiliaria2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Sistema {
    private static Scanner capturaDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    public static void menu(){
        System.out.println("Bem vinde a Imobiliária Sua Casa!");
        System.out.println("O que deseja fazer?");
        System.out.println("\t1 - Cadastrar novo imóvel");
        System.out.println("\t2 - Exibir imóveis cadastrados");
        System.out.println("\t3 - Remover morador do imóvel");
        System.out.println("\t4 - Sair do programa");
    }
    //Cadastrar 1 morador
    public static Morador cadastrarMorador(){
        String nomeMorador = capturaDados("Digite o nome do morador: ").nextLine();
        String cpf = capturaDados("Digite o cpf do morador:").nextLine();
        double renda = capturaDados("Digite a renda mensal do morador: R$").nextDouble();

        Morador morador = new Morador(nomeMorador, cpf, renda);
        return morador;
    }

    //Cadastrar Funcionario
    public static Funcionario cadastrarFuncionario(){
        String nomeFuncionario = capturaDados("Digite o nome do funcionário responsável: ").nextLine();
        String cpfFuncionario = capturaDados("Digite o CPF do funcionário responsável: ").nextLine();
        String codigoFuncionario = capturaDados("Digite o código do funcionário: ").nextLine();

        Funcionario novoFuncionario = new Funcionario(nomeFuncionario,cpfFuncionario,codigoFuncionario);
        return novoFuncionario;
    }
    //Cadastrar 1 imóvel
    public static Imovel cadastrarImovel(){
        String endereco = capturaDados("Digite o endereço do imóvel: ").nextLine();
        double valorAluguel = capturaDados("Qual o valor do aluguel? R$").nextDouble();

        Imovel novoImovel = new Imovel(cadastrarFuncionario(),endereco,valorAluguel,cadastrarVariosMoradores());
        return novoImovel;
    }
    public static List cadastrarVariosMoradores(){
        List<Morador> listaMoradores = new ArrayList<>();
        boolean continuar = true;
        while (continuar){
            listaMoradores.add(cadastrarMorador());
            String opcao = capturaDados("Deseja inserir outro morador? Sim/Não").nextLine().toUpperCase();
            if (opcao.equals("SIM")){
                System.out.println("Insira o novo morador: ");
            }
            else if (opcao.equals("NÃO")){
                continuar = false;
            }
            else{
                System.out.println("Opção inválida!");
            }
        }
        return listaMoradores;
    }
}
