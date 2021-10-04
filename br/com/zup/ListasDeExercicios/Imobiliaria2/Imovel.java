package br.com.zup.ListasDeExercicios.Imobiliaria2;

import java.util.ArrayList;
import java.util.List;

public class Imovel {
    private double valorAluguel;
    private String endereco;
    private Funcionario funcionarioResponsavel;
    private List<Morador> moradoresImovel = new ArrayList<>();

    //Construtores
    public Imovel() {

    }

    public Imovel(double valorAluguel, String endereco, Funcionario funcionarioResponsavel) {
        this.valorAluguel = valorAluguel;
        this.endereco = endereco;
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public Imovel(double valorAluguel, String endereco, Funcionario funcionarioResponsavel, List<Morador> moradoresImovel) {
        this.valorAluguel = valorAluguel;
        this.endereco = endereco;
        this.funcionarioResponsavel = funcionarioResponsavel;
        this.moradoresImovel = moradoresImovel;
    }

    //Getters e Setters

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Funcionario getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(Funcionario funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public List<Morador> getMoradoresImovel() {
        return moradoresImovel;
    }

    //Métodos

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Funcionário responsável: "+ funcionarioResponsavel);
        retorno.append("Endereço: " + endereco);
        retorno.append("Valor do aluguel: R$ "+valorAluguel);
        retorno.append("Moradores: "+moradoresImovel);
        return "Imovel{}";
    }
}
