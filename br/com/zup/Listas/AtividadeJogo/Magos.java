package br.com.zup.Listas.AtividadeJogo;

public class Magos extends Heroi{
    private double poderMagico;

    //Construtores
    public Magos (){

    }
    public Magos(double poderMagico) {
        this.poderMagico = poderMagico;
    }

    public Magos(String nome, double vida, double poderMagico) {
        super(nome, vida);
        this.poderMagico = poderMagico;
    }

    //Getters e Setters

    public double getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(double poderMagico) {
        this.poderMagico = poderMagico;
    }
    //Métodos
    private double aplicarMagia(){
        return poderMagico;
    }
}
