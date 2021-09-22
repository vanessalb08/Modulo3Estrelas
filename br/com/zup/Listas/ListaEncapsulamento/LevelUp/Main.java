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
        System.out.println("Novo volume: "+ controle.getVolume());
        controle.aumentaVolume();
        System.out.println("Novo volume: "+ controle.getVolume());
        controle.aumentaVolume();
        System.out.println("Novo volume: "+ controle.getVolume());
        controle.aumentaVolume();
        controle.mostraDados();
        //Mudando de canal 1 em 1 por 3x
        controle.aumentaCanal1();
        System.out.println("Novo canal: "+ controle.getCanal());
        controle.aumentaCanal1();
        System.out.println("Novo canal: "+ controle.getCanal());
        controle.diminuiCanal1();
        System.out.println("Novo canal: "+ controle.getCanal());
        controle.aumentaCanal1();
        System.out.println("Novo canal: "+ controle.getCanal());
        controle.mostraDados();
        //Mudando canal específico
        controle.trocaCanal(5);
        System.out.println("Novo canal: "+ controle.getCanal());
        controle.diminuiVolume();
        System.out.println("Novo volume: "+ controle.getVolume());
        controle.diminuiVolume();
        System.out.println("Novo volume: "+ controle.getVolume());
        controle.diminuiVolume();
        System.out.println("Novo volume: "+ controle.getVolume());
        controle.diminuiVolume();
        System.out.println("Novo volume: "+ controle.getVolume());
        controle.mostraDados();

    }
}
