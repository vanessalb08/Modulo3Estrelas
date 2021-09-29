package br.com.zup.ListasDeExercicios.Restaurante;

public class Ingredientes {
    private String nomeIngrediente;
    private double qtdIngredientes;

    //Construtores
    public Ingredientes() {
    }

    public Ingredientes(String nomeIngrediente, double qtdIngredientes) {
        this.nomeIngrediente = nomeIngrediente;
        this.qtdIngredientes = qtdIngredientes;
    }

    //Getters e Setters

    public String getNomeIngrediente() {
        return nomeIngrediente;
    }

    public void setNomeIngrediente(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }

    public double getQtdIngredientes() {
        return qtdIngredientes;
    }

    public void setQtdIngredientes(double qtdIngredientes) {
        this.qtdIngredientes = qtdIngredientes;
    }
    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Nome: " + nomeIngrediente);
        retorno.append("\n Quantidade: "+qtdIngredientes+"g");
        return retorno.toString();
    }
}

