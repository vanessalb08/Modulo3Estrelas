package br.com.zup.Listas.ListaModelagem;

public class ContaCorrente {
    int numeroConta;
    String nomeCorrentista;
    double saldo = 0;

    public ContaCorrente(int numeroConta, String nomeCorrentista){
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
    }
}
