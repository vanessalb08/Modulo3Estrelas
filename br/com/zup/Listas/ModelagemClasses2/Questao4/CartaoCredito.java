package br.com.zup.Listas.ModelagemClasses2.Questao4;

import br.com.zup.Listas.ModelagemClasses2.Questao1.Carro;

public class CartaoCredito {
    double limite;
    double saldo;
    String nomeCliente;

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
    public void imprimeFatura(){
        System.out.println("Olá, "+nomeCliente);
        System.out.println("Limite total: R$ "+limite);
        System.out.println("Saldo disponível: R$ "+saldo);
    }
}
