package br.com.zup.ListasDeExercicios.ListaClasses;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    //Contrutores
    public Fornecedor(){

    }
    public Fornecedor(double valorCredito, double valorDivida) {
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    //Getters e Setters
    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    //Métodos
    public double obterSAldo(){
        double saldo = getValorCredito() - getValorDivida();
        return saldo;
    }
}
