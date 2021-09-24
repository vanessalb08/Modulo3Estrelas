package br.com.zup.ListasDeExercicios.AtividadeJogo;

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
       setNome(nome);
    }
    public void receberDano(double dano){
        double novaVida = getVida() - dano;
        setVida(novaVida);
    }
    public double exibirVida(){
        return getVida();
    }
}
