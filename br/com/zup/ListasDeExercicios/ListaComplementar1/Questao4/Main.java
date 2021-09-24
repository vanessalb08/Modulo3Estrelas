package br.com.zup.ListasDeExercicios.ListaComplementar1.Questao4;

public class Main {
    public static void main(String[] args) {
        Pessoa vanessa = new Pessoa("Vanessa",15,87,157);

        vanessa.envelhecer(10);
        System.out.println(vanessa.altura);
        vanessa.emagrecer(5);
        vanessa.engordar(10);
        vanessa.emagrecer(12);

    }
}
