package br.com.zup.ListasDeExercicios.ListaComplementar1.Questao1;

public class Bola {
    String cor;
    double circunerencia;
    String material;

    public Bola(String cor){
        this.cor = cor;
    }
    public void trocaCor(String novaCor){
        cor = novaCor;
    }
    public void mostraCor(){
        System.out.println(cor);
    }
}
