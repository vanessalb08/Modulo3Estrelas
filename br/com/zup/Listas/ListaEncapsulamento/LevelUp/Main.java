package br.com.zup.Listas.ListaEncapsulamento.LevelUp;

public class Main {
    public static void main(String[] args) {
       // ControleRemoto controle = new ControleRemoto();
        Televisao tv = new Televisao();

        tv.setControle(1);
        tv.mostraDados();

    }
}
