package br.com.zup.Listas.AtividadeJogo;

public class Inimigos {
    private String nome;
    private double vida;
    //Construtores
    public Inimigos(){

    }
    public Inimigos(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    //Métodos
    public void trocarNome(String nome){
        this.nome = nome;
    }
    public void receberDano(double dano){

    }
    public double exibirVida(){
        return exibirVida();
    }
}
