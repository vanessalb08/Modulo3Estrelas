package br.com.zup.Listas.AtividadeJogo;

public class Voadores extends Inimigos{
    private double danoTiro;

    //Construtores
    public Voadores(){

    }
    public Voadores(double danoTiro) {
        this.danoTiro = danoTiro;
    }

    public Voadores(String nome, double vida, double danoTiro) {
        super(nome, vida);
        this.danoTiro = danoTiro;
    }

    //Getters e Setters

    public double getDanoTiro() {
        return danoTiro;
    }

    public void setDanoTiro(double danoTiro) {
        this.danoTiro = danoTiro;
    }

    //Métodos
    public double aplicarDano(){
        return danoTiro;
    }
}
