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
}
