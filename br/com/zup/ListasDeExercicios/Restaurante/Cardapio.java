package br.com.zup.ListasDeExercicios.Restaurante;

import java.util.List;

public class Cardapio {
    private List<Pratos> pratos;

    //Contrutores

    public Cardapio() {

    }
    //Getters e Setters

    public List<Pratos> getPratos() {
        return pratos;
    }

    //Métodos
    public void adicionaPratos(Pratos novoPrato){
        pratos.add(novoPrato);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("----Cardápio----");
        retorno.append("\nQuantidade de pratos: "+pratos.size());
        retorno.append("\n\t"+getPratos());
        return retorno.toString();
    }
}
