package br.com.zup.ListaModelagem;

public class Pessoa {
    String nome;
    int idade;
    double peso = 0;
    double altura;

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
}
