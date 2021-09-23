package br.com.zup.Listas.AtividadeJogo;

public class Main {
    public static void main(String[] args) {
        Guerreiros guerreiro = new Guerreiros("Kratos", 100, 60);
        Voadores voador = new Voadores("Zatana", 100, 40);

        System.out.println("Vida de "+guerreiro.getNome()+" é: "+guerreiro.getVida());
        System.out.println("Vida restante de "+voador.getNome()+" é: "+voador.getVida());
        guerreiro.receberDano(voador.aplicarDano());
        System.out.println(guerreiro.getNome()+" recebe "+voador.getDanoTiro()+" de dano");
        System.out.println("Vida do "+guerreiro.getNome()+": "+guerreiro.getVida());
        voador.receberDano(guerreiro.aplicarDano());
        System.out.println(voador.getNome()+" recebe "+guerreiro.getPoderAtaque()+" de dano");
        System.out.println("Vida restante de "+voador.getNome()+": "+voador.getVida());
        guerreiro.trocarNome("Coringa");
        voador.trocarNome("Ermat");
        System.out.println("_________________________________");
        System.out.println("Guerreiro trocado para "+guerreiro.getNome());
        System.out.println("Voador trocado para "+voador.getNome());
        System.out.println("_________________________________");
        System.out.println("Vida de "+guerreiro.getNome()+" é: "+guerreiro.getVida());
        System.out.println("Vida de "+voador.getNome()+" é: "+voador.getVida());
        guerreiro.receberDano(voador.aplicarDano());
        System.out.println(guerreiro.getNome()+" recebe "+voador.getDanoTiro()+" de dano");
        System.out.println("Vida do "+guerreiro.getNome()+": "+guerreiro.getVida());
        voador.receberDano(guerreiro.aplicarDano());
        System.out.println(voador.getNome()+" recebe "+guerreiro.getPoderAtaque()+" de dano");
        System.out.println("Vida restante de "+voador.getNome()+": "+voador.getVida());
    }
}
