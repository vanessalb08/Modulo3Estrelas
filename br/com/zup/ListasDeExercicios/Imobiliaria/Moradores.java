package br.com.zup.ListasDeExercicios.Imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Moradores extends Pessoa{
    private double renda;
    //private List<Pessoa> moradores =  new ArrayList<>();

    //Construtores
    public Moradores() {
    }

    public Moradores(double renda) {
        this.renda = renda;
    }

    public Moradores(String nome, String cpf, double renda) {
        super(nome, cpf);
        this.renda = renda;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append(super.toString());
        retorno.append("\n\tRenda: R$ "+renda);
        return retorno.toString();
    }
}
