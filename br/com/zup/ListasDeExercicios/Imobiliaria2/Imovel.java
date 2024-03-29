package br.com.zup.ListasDeExercicios.Imobiliaria2;

import java.util.ArrayList;
import java.util.List;

public class Imovel {
    private Funcionario funcionarioResponsavel;
    private String endereco;
    private double valorAluguel;
    private List<Morador> moradoresImovel = new ArrayList<>();

    //Construtores
    public Imovel() {

    }

    public Imovel(Funcionario funcionarioResponsavel, String endereco, double valorAluguel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
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
    public void cadastrarMoradores(Morador novoMorador){
        moradoresImovel.add(novoMorador);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nFuncionário responsável: "+ funcionarioResponsavel);
        retorno.append("\nEndereço: " + endereco);
        retorno.append("\nValor do aluguel: R$ "+valorAluguel);
        retorno.append("\nMoradores no imóvel: "+ moradoresImovel.size());
        retorno.append("\nMoradores: "+moradoresImovel);
        return retorno.toString();
    }
}
