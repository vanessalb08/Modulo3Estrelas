package br.com.zup.Listas.ListaEncapsulamento;
public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String nomeCorrentista;

    public ContaBancaria(int numeroConta, double saldo, String nomeCorrentista){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.nomeCorrentista = nomeCorrentista;
    }

    //Getters e Setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
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