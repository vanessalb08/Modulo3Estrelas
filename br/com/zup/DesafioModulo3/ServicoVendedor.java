package br.com.zup.DesafioModulo3;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedor {
    private static List<Vendedor> vendedores = new ArrayList<>();

    //Cadastrar Vendedor e adicioná-lo a lista de vendedores
    public static Vendedor cadastrarVendedores(String nomeVendedor, String cpfVendedor, String emailVendedor, String ctps){
        Vendedor novoVendedor = new Vendedor(nomeVendedor, cpfVendedor,emailVendedor,ctps);
        vendedores.add(novoVendedor);
        return novoVendedor;
    }

    public static Vendedor pesquisarVendedor(String cpf) throws Exception{
        for (Vendedor vendedorReferencia : vendedores){
            if (vendedorReferencia.getCpf().equals(cpf)){
                return vendedorReferencia;
            }
        }
        throw new Exception("Vendedor não encontrado na nossa base. Por favor, digite novamente!");
    }
}
