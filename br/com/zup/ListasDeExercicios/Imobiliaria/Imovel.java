package br.com.zup.ListasDeExercicios.Imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Imovel {
    private String endereco;
    private double valorAluguel;
    private List<Moradores> moradoresImovel = new ArrayList<>();

    //Contrutores


    public Imovel() {
    }

    public Imovel(String endereco, double valorAluguel, List<Moradores> moradoresImovel) {
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
        this.moradoresImovel = moradoresImovel;
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

    public List<Moradores> getMoradoresImovel() {
        return moradoresImovel;
    }

    public void setMoradoresImovel(List<Moradores> moradoresImovel) {
        this.moradoresImovel = moradoresImovel;
    }

    //Métodos
    public void adicionaMoradorImovel(Moradores novoMorador){
        moradoresImovel.add(novoMorador);
    }
}
