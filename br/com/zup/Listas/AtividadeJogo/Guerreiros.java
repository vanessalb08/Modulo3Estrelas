package br.com.zup.Listas.AtividadeJogo;

public class Guerreiros extends Heroi {
    private double poderAtaque;

    //Construtores
    public Guerreiros(){

    }
    public Guerreiros(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }

    public Guerreiros(String nome, double vida, double poderAtaque) {
        super(nome, vida);
        this.poderAtaque = poderAtaque;
    }

    //Getters e Setters
    public double getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }
    //Métodos
    public double aplicarDano(){
        return poderAtaque;
    }
}
