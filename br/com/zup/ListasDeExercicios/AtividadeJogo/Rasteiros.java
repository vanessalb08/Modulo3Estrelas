package br.com.zup.ListasDeExercicios.AtividadeJogo;

public class Rasteiros extends Inimigos {
    private double danoEspinhos;

    //Construtores
    public Rasteiros(){

    }
    public Rasteiros(double danoEspinhos) {
        this.danoEspinhos = danoEspinhos;
    }

    public Rasteiros(String nome, double vida, double danoEspinhos) {
        super(nome, vida);
        this.danoEspinhos = danoEspinhos;
    }
    //Getters e Setters

    public double getDanoEspinhos() {
        return danoEspinhos;
    }

    public void setDanoEspinhos(double danoEspinhos) {
        this.danoEspinhos = danoEspinhos;
    }

    //Métodos
    public double aplicarDados(){
        return danoEspinhos;
    }
}
