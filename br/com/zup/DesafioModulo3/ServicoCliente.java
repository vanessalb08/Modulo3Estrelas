package br.com.zup.DesafioModulo3;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {
    private static List<Cliente> clientes = new ArrayList<>();

    //Cadastrar cliente e adicioná-lo a lista de clientes
    public static Cliente cadastrarCliente(String nomeCliente, String cpfCliente, String emailCliente, String dataNascimento){
        Cliente novoCliente = new Cliente(nomeCliente,cpfCliente,emailCliente,dataNascimento);
        clientes.add(novoCliente);
        return novoCliente;
    }
    //Pesquisar cliente pelo CPF
    public static Cliente pesquisarCliente(String cpfCliente) throws Exception{
        for (Cliente clienteReferencia : clientes){
            if (clienteReferencia.getCpf().equals(cpfCliente)){
                return clienteReferencia;
            }
        }
        throw new Exception("Cliente não cadastrado!");
    }
}
