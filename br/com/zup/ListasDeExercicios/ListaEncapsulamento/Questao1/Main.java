package br.com.zup.ListasDeExercicios.ListaEncapsulamento.Questao1;

import br.com.zup.ListasDeExercicios.ModelagemClasses2.Questao2.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        br.com.zup.ListasDeExercicios.ModelagemClasses2.Questao2.ContaBancaria conta1 = new ContaBancaria(2431,300,"Vanessa Lima");

        conta1.extrato();
        System.out.println("_____________________________________");
        conta1.deposito(3200);
        conta1.extrato();
        System.out.println("_____________________________________");
        conta1.saque(1500);
        conta1.extrato();
    }
}
