package br.com.zup.ListasDeExercicios.ListaEncapsulamento.Questao3;

public class Pessoa {
    //Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de nascimento e altura
    private String nome;
    private int dataNascimento;
    private double altura;
    private int idade;

    //Crie os métodos públicos necessários para sets e gets
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(int dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    /* Crie um método para calcular a idade da pessoa. */
    public int anosCompletos(int idade){
        this.idade = idade;
        idade = 2021 - dataNascimento;
        return idade;
    }
    //Método para imprimir todos dados de uma pessoa
    public void imprimeDados(){
        System.out.println("Nome: "+ nome);
        System.out.println("Ano de nascimento: "+ dataNascimento);
        System.out.println("Altura: "+ altura);
        System.out.println("Idade: "+ anosCompletos(idade));
    }

}
