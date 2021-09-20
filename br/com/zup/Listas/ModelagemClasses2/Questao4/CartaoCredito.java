package br.com.zup.Listas.ModelagemClasses2.Questao4;

import br.com.zup.Listas.ModelagemClasses2.Questao1.Carro;

public class CartaoCredito {
    double limite;
    double saldo;
    String nomeCliente;
    double totalCompras = 0;

    public CartaoCredito(double limite, String nomeCliente){
        this.limite = limite;
        this.nomeCliente = nomeCliente;
    }
    public void aumentaLimite(double aumento){
        limite += aumento;
        saldo += aumento;
    }
    public void diminuiLimite(double reducao){
            limite -= reducao;
            saldo -= reducao;

    }
    public void realizaCompra(double valorCompra){
        if (valorCompra > limite || valorCompra > saldo) {
            System.out.println("Compra negada!");
            System.out.println("______________________________");
        }
        else{
            saldo -= valorCompra;
        }
    }
    public double compras(double valor){
        totalCompras += valor;
        return totalCompras;
    }
    public void imprimeFatura(){
        //System.out.println("Olá, "+nomeCliente);
        System.out.println("----------------------------------");
        System.out.println("Limite total: R$ "+limite);
        System.out.println("Total de compras : -R$ "+totalCompras);
        System.out.println("Saldo disponível: R$ "+saldo);
        System.out.println("----------------------------------");
    }
    public void menu(){
        System.out.println("Por favor, digite a opção desejada:");
        System.out.println("1 - Aumentar Limite");
        System.out.println("2 - Diminuir Limite");
        System.out.println("3 - Realizar compra");
        System.out.println("4 - Mostrar compras feitas");
        System.out.println("5 - Mostrar fatura");
        System.out.println("6 - Sair");
    }
}
