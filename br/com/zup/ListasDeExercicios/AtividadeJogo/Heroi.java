package br.com.zup.ListasDeExercicios.AtividadeJogo;

public class Heroi {
    private String nome;
    private double vida;

    public Heroi() {

    }
    public Heroi(String nome, double vida) {
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
    //Criando métodos
    public void trocarNome(String nome){
        setNome(nome);
    }
    public void receberDano(Double dano){
        double novaVida = getVida() - dano;
        setVida(novaVida);
    }
    public double exibirVida(){
        return getVida();
    }
}
