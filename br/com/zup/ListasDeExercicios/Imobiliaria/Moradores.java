package br.com.zup.ListasDeExercicios.Imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Moradores extends Pessoa{
    private List<Pessoa> moradores =  new ArrayList<>();

    //Construtores

    public Moradores() {
    }

    public Moradores(String nome, String cpf) {
        super(nome, cpf);
    }

    public Moradores(List<Pessoa> pessoas) {
        this.moradores = pessoas;
    }

    public Moradores(String nome, String cpf, List<Pessoa> pessoas) {
        super(nome, cpf);
        this.moradores = pessoas;
    }

    public List<Pessoa> getMoradores() {
        return moradores;
    }

    public void setMoradores(List<Pessoa> moradores) {
        this.moradores = moradores;
    }
    public void adicionarMorador(Pessoa novoMorador){
        moradores.add(novoMorador);
    }
}
