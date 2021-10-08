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

        Cliente cliente = ServicoCliente.cadastrarCliente(nomeCliente,cpfCliente,emailCliente,dataNascimento);
        System.out.println(cliente);
        return cliente;
    }

    public static Vendedor cadastrarVendedor(){
        String nomeVendedor = receberDados("Digite o nome do vendedor responsável: ").nextLine();
        String cpfVendedor = receberDados("Digite o CPF do vendedor responsável: ").nextLine();
        String emailVendedor = receberDados("Digite o e-mail do vendedor responsável: ").nextLine();
        String ctps = receberDados("Digite a ctps do vendedor resposável: ").nextLine();

        Vendedor vendedor = ServicoVendedor.cadastrarVendedores(nomeVendedor,cpfVendedor,emailVendedor,ctps);
        System.out.println(vendedor);
        return vendedor;
    }
}
