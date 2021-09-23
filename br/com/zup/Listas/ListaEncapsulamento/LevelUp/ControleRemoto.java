package br.com.zup.Listas.ListaEncapsulamento.LevelUp;

public class ControleRemoto {
    private Televisao tv;

    public ControleRemoto(Televisao tv) {
        this.tv = tv;
    }
    //Getters e Setters

    public Televisao getTv() {
        return tv;
    }
    public void setTv(Televisao tv) {
        this.tv = tv;
    }

    //Aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
    public void aumentaVolume(){
        int aumenta = tv.getVolume() + 1;
        tv.setVolume(aumenta);
    }
    public void diminuiVolume(){
        int diminui = tv.getVolume() - 1;
        tv.setVolume(diminui);
    }
    //Aumentar e diminuir o número do canal em uma unidade;
    public void aumentaCanal(){
        int aumenta = tv.getCanal() + 1;
        tv.setCanal(aumenta);
    }
    public void diminuiCanal(){
        int diminui = tv.getCanal() - 1;
        tv.setCanal(diminui);
    }
    //Trocar para um canal indicado;
    public void novoCanal(int novo){
        tv.setCanal(novo);
    }

    //Mostrar canal e volume
    public void mostraDados(){
        System.out.println("Canal: "+ tv.getCanal());
        System.out.println("Volume: "+ tv.getVolume());
    }
/*
    public String retornaDados(){

        return "Canal: " + tv.getCanal() +
                "\nVolume: " + tv.getVolume();
    }*/

}
