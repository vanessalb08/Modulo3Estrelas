package br.com.zup.ListasDeExercicios.ListaComplementar1.Questao2;

public class Quadrado {
    double tamanhoLado;

    public Quadrado(double tamanhoLado){
        this.tamanhoLado = tamanhoLado;
    }
    public void mudarValorLado (double novoTamanho){
        tamanhoLado = novoTamanho;
    }
    public double retornarValor (){
        return tamanhoLado;
    }
    public double areaQuadrado(){
        double area = tamanhoLado * tamanhoLado;
        return area;
    }
}
