package br.com.zup.Listas.ListaEncapsulamento.LevelUp;

public class Televisao {
    private ControleRemoto controle;
    private int canalAtual;
    private int volumeAtual;

    public ControleRemoto getControle(){
        return controle;
    }
    public void setControle(ControleRemoto controle){
        this.controle = controle;
    }
    public int getCanalAtual() {
        canalAtual = controle.getCanal();
        return canalAtual;
    }
    public void setControle(int canalAtual){
        this.canalAtual = canalAtual;
    }
    public int getVolumeAtual(){
        volumeAtual = controle.getVolume();
        return volumeAtual;
    }
    public void setVolumeAtual(int volumeAtual){
        this.volumeAtual = volumeAtual;
    }

    public void aumenta(){
        controle.aumentaCanal1();
    }
    public void diminui(){
        controle.diminuiCanal1();
    }
    public void troca(int novo){
        controle.trocaCanal(novo);
    }

    public void mostraDados(){
        System.out.println("Canal: " + canalAtual);
        System.out.println("Volume: " + volumeAtual);
    }
}
