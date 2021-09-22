package br.com.zup.Listas.ListaEncapsulamento.Questao3;

public class Main {
    public static void main(String[] args) {
        Pessoa people = new Pessoa();

        people.setNome("Vanessa");
        people.setDataNascimento(1991);
        people.setAltura(1.57);

        people.imprimeDados();

    }
}
