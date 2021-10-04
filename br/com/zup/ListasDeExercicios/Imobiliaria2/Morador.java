package br.com.zup.ListasDeExercicios.Imobiliaria2;

public class Morador extends Pessoa {
    private double rendaMensal;

    //Construtores
    public Morador() {

    }

    public Morador(String nome, String cpf, double rendaMensal) {
        super(nome, cpf);
        this.rendaMensal = rendaMensal;
    }
    //Getters e Setters

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append(super.toString());
        retorno.append("Renda mensal: R$ "+rendaMensal);
        retorno.append("--------------------------");
        return retorno.toString();
    }
}
