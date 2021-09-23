package br.com.zup.Listas.ListaEncapsulamento.LevelUp;

public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao(1,10);
        ControleRemoto controle = new ControleRemoto(tv);

        controle.mostraDados();
        controle.aumentaVolume();
        controle.aumentaVolume();
        controle.aumentaVolume();
        controle.mostraDados();
        controle.diminuiVolume();
        controle.mostraDados();
        controle.aumentaCanal();
        controle.aumentaCanal();
        controle.aumentaVolume();
        controle.mostraDados();
        controle.diminuiCanal();
        controle.diminuiVolume();
        controle.diminuiVolume();
        controle.mostraDados();
        controle.novoCanal(8);
        controle.mostraDados();


    }
}
