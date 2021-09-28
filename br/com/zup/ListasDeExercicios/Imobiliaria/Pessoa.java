package br.com.zup.ListasDeExercicios.Imobiliaria;

public class Pessoa {
    private String nome;
    private String cpf;

    //Construtores

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n\tNome:  "+nome);
        retorno.append("\n\tCPF: "+ cpf);
        return retorno.toString();
    }
}
