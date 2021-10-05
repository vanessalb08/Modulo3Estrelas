package br.com.zup.ListasDeExercicios.Imobiliaria2;

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
        String cpfFuncioanario = capturaDados("Digite o CPF do funcionário responsável: ").nextLine();
        String codigoFuncionario = capturaDados("Digite o código do funcionário: ").nextLine();

        Funcionario novoFuncionario = new Funcionario(nomeFuncionario,cpfFuncioanario,codigoFuncionario);
        return novoFuncionario;
    }
}
