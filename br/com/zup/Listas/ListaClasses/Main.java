package br.com.zup.Listas.ListaClasses;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Fornecedor fornecedor = new Fornecedor("Vanessa", "Rua","99999999",200,150);
        Colaborador colaborador = new Colaborador("Colab", "Avenida","9999821", 3, 1500,80);

        //Teste fornecedor
        System.out.println("----------------------------------------");
        System.out.println("Nome: "+fornecedor.getNome() +"\nEndereço: "+fornecedor.getEndereco()+"\nTelefone: "+fornecedor.getTelefone());
        System.out.println("Crédito: R$"+fornecedor.getValorCredito());
        System.out.println("Dívida: R$"+fornecedor.getValorDivida());
        System.out.println("Saldo: R$ " + fornecedor.obterSAldo());
        //Teste colaborador
        System.out.println("----------------------------------------");
        System.out.println("Nome: "+colaborador.getNome());
        System.out.println("Endereço: "+ colaborador.getEndereco());
        System.out.println("Telefone: "+ colaborador.getTelefone());
        System.out.println("Salário Bruto: "+ colaborador.getSalarioBase());
        System.out.println("Imposto: "+ colaborador.getImposto());
        System.out.println("Salário Líquido: R$ "+colaborador.calcularSalario());
    }
}
