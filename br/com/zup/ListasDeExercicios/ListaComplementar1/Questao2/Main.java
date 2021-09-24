package br.com.zup.ListasDeExercicios.ListaComplementar1.Questao2;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado1 = new Quadrado(10);

        System.out.println(quadrado1.retornarValor());
        System.out.println(quadrado1.areaQuadrado());
        quadrado1.mudarValorLado(5);
        System.out.println(quadrado1.retornarValor());
        System.out.println(quadrado1.areaQuadrado());
    }
}
