package br.com.zup.Listas.ModelagemClasses2.Questao2;

import br.com.zup.Aula3POOMetodos.Exemplo1.ContaCorrente;

public class ContaBancaria {
    int numeroConta;
    double saldo;
    String nomeCorrentista;

    public ContaBancaria(int numeroConta, double saldo, String nomeCorrentista){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.nomeCorrentista = nomeCorrentista;
    }
    public void extrato(){
        System.out.println("Nome: "+nomeCorrentista);
        System.out.println("Número da conta: "+numeroConta);
        System.out.println("Saldo: R$ "+saldo);
    }
    public void deposito( double valorDepositado){
        saldo += valorDepositado;
    }
    public void saque(double valorSacado){
        saldo -= valorSacado;
    }
}
