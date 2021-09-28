package br.com.zup.ListasDeExercicios.Imobiliaria;

import java.util.ArrayList;
import java.util.List;


//Imóvel TEM moradores
public class Imovel {
    private String endereco;
    private double valorAluguel;
    private List<Moradores> moradoresImovel = new ArrayList<>();
    private Funcionario funcionario;

    //Contrutores
    public Imovel(String endereco, double valorAluguel, Funcionario funcionario) {
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
        this.funcionario = funcionario;
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

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    //Métodos
    public void adicionarMorador(Moradores novoMorador){
        moradoresImovel.add(novoMorador);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Endereço: "+ endereco);
        retorno.append("\nValor do aluguel: R$ " + valorAluguel);
        retorno.append("\nFuncionário responsável: "+ funcionario);
        retorno.append("\nQuantidade de moradores: "+moradoresImovel.size());
        retorno.append("\nLista de Moradores: " + moradoresImovel);
        return retorno.toString();
    }
}
