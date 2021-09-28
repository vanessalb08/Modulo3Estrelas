package br.com.zup.ListasDeExercicios.Imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
    private List<Imovel> imoveis = new ArrayList<>();

    public void adicionarImovel(Imovel novoImovel){
        imoveis.add(novoImovel);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("----Imóveis----");
        retorno.append("\nQuantidade de imóveis: "+imoveis.size());
        retorno.append("\n"+imoveis);
        return retorno.toString();
    }
}
