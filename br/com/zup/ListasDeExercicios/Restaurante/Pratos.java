package br.com.zup.ListasDeExercicios.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Pratos {
    private String nomePrato;
    private double valorPrato;
    private List<Ingredientes> ingredientes = new ArrayList<>();

    //Contrutores


    public Pratos() {
    }

    public Pratos(String nomePrato, double valorPrato) {
        this.nomePrato = nomePrato;
        this.valorPrato = valorPrato;
    }

    public Pratos(String nomePrato, double valorPrato, List<Ingredientes> ingredientes) {
        this.nomePrato = nomePrato;
        this.valorPrato = valorPrato;
        this.ingredientes = ingredientes;
    }
    //Getters e Setters

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public double getValorPrato() {
        return valorPrato;
    }

    public void setValorPrato(double valorPrato) {
        this.valorPrato = valorPrato;
    }

    public List<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    //Métodos
    public void cadastrarIngredientes(Ingredientes novoIngrediente){
        ingredientes.add(novoIngrediente);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome: "+nomePrato);
        retorno.append("\n\tValor: R$ "+ valorPrato);
        retorno.append("\n\tO prato possui "+ingredientes.size()+" ingredientes:");
        retorno.append("\t\t"+ingredientes);
        return retorno.toString();
    }

}
