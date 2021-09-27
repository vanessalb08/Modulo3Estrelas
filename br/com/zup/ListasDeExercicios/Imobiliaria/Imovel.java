package br.com.zup.ListasDeExercicios.Imobiliaria;

public class Imovel {
    private String endereco;
    private double valorAluguel;
    private Moradores moradores;

    //Contrutores


    public Imovel() {
    }

    public Imovel(String endereco, double valorAluguel, Moradores moradores) {
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
        this.moradores = moradores;
    }
    //Getters e Setters

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public Moradores getMoradores() {
        return moradores;
    }

    public void setMoradores(Moradores moradores) {
        this.moradores = moradores;
    }
}
