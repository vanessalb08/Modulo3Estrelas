package br.com.zup.ListasDeExercicios.Fatura;

import java.util.Scanner;

public class Sistema {
    //Receber dados do usuário
    private static Scanner receberDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    //Cadastrar consumidor
    public static Consumidor cadastrarConsumidor(){
        String nome = receberDados("Qual o nome do consumidor? ").nextLine();
        String email = receberDados("Qual o email do consumidor?").nextLine();
        //Retornar o método de cadastrar consumidor da classe ServicoConsumidor com os dados recebidos
        return ServicoConsumidor.cadastrarConsumidor(nome,email);
    }
    //Cadastrar Fatura
    public static Fatura cadastrarFatura()throws Exception{
        String emailConsumidor = receberDados("Qual o e-mail cadastrado do consumidor?").nextLine();
        double valorDaFatura = receberDados("Qual o valor da fatura? R$ ").nextDouble();
        String dataVencimento = receberDados("Qual a data de vencimento? ").nextLine();

        return ServicoFatura.cadastrarFatura(emailConsumidor,valorDaFatura,dataVencimento);
    }
}
