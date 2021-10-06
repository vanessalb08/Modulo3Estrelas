package br.com.zup.ListasDeExercicios.Imobiliaria2;

public class Morador extends Pessoa {
    private double rendaMensal;
    private String emailMorador;

    //Construtores
    public Morador() {

    }

    public Morador(String nome, String cpf, double rendaMensal,String emailMorador) {
        super(nome, cpf);
        this.rendaMensal = rendaMensal;
        this.emailMorador = emailMorador;
    }
    //Getters e Setters

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public String getEmailMorador() {
        return emailMorador;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n"+super.toString());
        retorno.append("\nRenda mensal: R$ "+rendaMensal);
        retorno.append("\nEmail: "+ emailMorador);
        retorno.append("\n--------------------------");
        return retorno.toString();
    }
}
