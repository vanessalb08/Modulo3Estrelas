package br.com.zup.ListasDeExercicios.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Pratos> pratos = new ArrayList<>();

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
        retorno.append("--------Cardápio--------");
        retorno.append("\nQuantidade de pratos: "+pratos.size());
        retorno.append("\n\t"+getPratos());
        retorno.append("------------------------");
        return retorno.toString();
    }
}
