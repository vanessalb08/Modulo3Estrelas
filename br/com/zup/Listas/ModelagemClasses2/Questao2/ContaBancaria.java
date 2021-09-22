package br.com.zup.Listas.ModelagemClasses2.Questao2;

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
