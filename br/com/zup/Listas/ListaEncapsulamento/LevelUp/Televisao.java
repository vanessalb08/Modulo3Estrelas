package br.com.zup.Listas.ListaEncapsulamento.LevelUp;

public class Televisao {
    private int canal = 0;
    private int volume = 0;

    public Televisao(int canalAtual, int volumeAtual) {
        this.canal = canalAtual;
        this.volume = volumeAtual;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

