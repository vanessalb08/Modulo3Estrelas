package br.com.zup.DesafioModulo3;

import br.com.zup.ListasDeExercicios.Fatura.Consumidor;

import java.util.Scanner;

public class Sistema {

    private static Scanner receberDados( String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    public static Cliente cadastrarCliente(){
        String nomeCliente = receberDados("Digite o nome do cliente: ").nextLine();
        String cpfCliente = receberDados("Digite o CPF do cliente: ").nextLine();
        String emailCliente = receberDados("Digite o e-mail do cliente: ").nextLine();
        String dataNascimento = receberDados("Digite a data de nascimento do cliente: ").nextLine();

        return ServicoCliente.cadastrarCliente(nomeCliente,cpfCliente,emailCliente,dataNascimento);
    }
}
