package br.com.zup.DesafioModulo3;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {
    private static List<Venda> vendas = new ArrayList<>();

    public static Venda cadastrarVenda(String cpfCliente, String cpfVendedor, double valorPago, String dataRegistro) throws Exception{
        Cliente cliente = ServicoCliente.pesquisarClientePorCpf(cpfCliente);
        Vendedor vendedor = ServicoVendedor.pesquisarVendedorPorCpf(cpfVendedor);

        Venda novaVenda = new Venda(cliente,vendedor,valorPago,dataRegistro);
        vendas.add(novaVenda);
        return novaVenda;
    }
}
