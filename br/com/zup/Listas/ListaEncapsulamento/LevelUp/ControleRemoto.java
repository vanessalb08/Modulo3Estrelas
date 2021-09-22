package br.com.zup.Listas.ListaEncapsulamento.LevelUp;

/** O controle de volume permite:
 -  Aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
 - Aumentar e diminuir o número do canal em uma unidade;
 - Trocar para um canal indicado;
* */
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


}
