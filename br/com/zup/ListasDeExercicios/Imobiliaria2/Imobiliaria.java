package br.com.zup.ListasDeExercicios.Imobiliaria2;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
    private List<Imovel> imoveis = new ArrayList<>();

    //Construtores
    public Imobiliaria() {
    }

    public Imobiliaria(List<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    //Getters e Setters

    public List<Imovel> getImoveis() {
        return imoveis;
    }
    //Cadastrar Imóvel
    public void cadastrarImovel(Imovel novoImovel){
        imoveis.add(novoImovel);
    }
}
