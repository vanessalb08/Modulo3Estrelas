package br.com.zup.Listas.ListaEncapsulamento.LevelUp;

public class ControleRemoto {
    private int volume;
    private int canal;

    //Getters e Setters
    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public int getCanal(){
        return canal;
    }
    public void setCanal(int canal){
        this.canal = canal;
    }
    //Aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
    public void aumentaVolume(){
        volume +=1;
    }
    public void diminuiVolume(){
        volume -= 1;
    }
    //Aumentar e diminuir o número do canal em uma unidade;
    public void aumentaCanal1(){
        canal += 1;
    }
    public void diminuiCanal1(){
        canal -= 1;
    }
    //Trocar para um canal indicado;
    public void trocaCanal(int novoCanal){
        canal = novoCanal;
    }
    public void mostraDados(){
        System.out.println("Canal: "+ canal);
        System.out.println("Volume: "+ volume);
    }

}
