package br.com.zup.Listas.ModelagemClasses2.Questao4;

public class Main {
    public static void main(String[] args) {
        CartaoCredito nubank = new CartaoCredito(1600,"Vanessa");

        nubank.saldo = nubank.limite;

        nubank.imprimeFatura();
        System.out.println("______________________________");
        nubank.diminuiLimite(1000);
        nubank.imprimeFatura();
        System.out.println("______________________________");
        nubank.realizaCompra(600);
        nubank.imprimeFatura();
        System.out.println("______________________________");
        nubank.realizaCompra(1100);
        nubank.imprimeFatura();
        System.out.println("______________________________");
        nubank.aumentaLimite(1000);
        nubank.imprimeFatura();
        System.out.println("______________________________");
        nubank.realizaCompra(1000);
        nubank.imprimeFatura();
        System.out.println("______________________________");
    }
}
