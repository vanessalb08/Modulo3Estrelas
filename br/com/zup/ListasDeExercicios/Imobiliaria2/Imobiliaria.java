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
    public void adicionarImovel(Imovel novoImovel){
        imoveis.add(novoImovel);
    }

    //Ecluir morador pelo imovel
    public Imovel selecionarImovel(String endereco){
        Imovel imovelSelecionado = null;
        for (Imovel referencia : imoveis){
            if (referencia.getEndereco().equals(endereco)){
                imovelSelecionado = referencia;
            }
        }
        return imovelSelecionado;
    }
    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("------------------Imóveis-----------------");
        retorno.append("\nExistem "+ imoveis.size()+" imóveis cadastrados");
        retorno.append("\n"+imoveis);
        return retorno.toString();
    }
}
