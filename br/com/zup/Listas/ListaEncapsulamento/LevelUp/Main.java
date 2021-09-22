package br.com.zup.Listas.ListaEncapsulamento.LevelUp;

public class Main {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();
        //Televisao tv = new Televisao();

        controle.setCanal(1);
        controle.setVolume(10);
        controle.mostraDados();

        //Aumentando volume 4x
        controle.aumentaVolume();
        controle.aumentaVolume();
        controle.aumentaVolume();
        controle.aumentaVolume();
        controle.mostraDados();
        //Mudando de canal 1 em 1 por 3x
        controle.aumentaCanal1();
        controle.aumentaCanal1();
        controle.diminuiCanal1();
        controle.aumentaCanal1();
        controle.mostraDados();
        //Mudando canal específico
        controle.trocaCanal(5);
        controle.diminuiVolume();
        controle.diminuiVolume();
        controle.diminuiVolume();
        controle.diminuiVolume();
        controle.mostraDados();

    }
}
