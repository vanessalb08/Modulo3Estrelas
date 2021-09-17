package br.com.zup.Aula2POO;

import org.w3c.dom.ls.LSOutput;

public class Contato {
    String nome;
    String telefone;
    String email;
    int idade;

    //criando método contrutor
    public Contato(String nome, String telefone, String email, int idade){
        this.nome = nome; // preenche as características da classe
        this.telefone = telefone;
        this.email = email;
        this.idade = idade;
    }
}

