package br.com.zup.Listas.ModelagemClasses2.Questao3;

public class Main {
    public static void main(String[] args) {
        Elevador elev1 = new Elevador(10);
        elev1.mostraDados();
        System.out.println("----------------------------");
        elev1.sai(2);
        System.out.println("----------------------------");
        elev1.entra(3);
        elev1.mostraDados();
        System.out.println("----------------------------");
        elev1.sobe(2);
        elev1.mostraDados();
        System.out.println("----------------------------");
        elev1.entra(5);
        elev1.mostraDados();
        System.out.println("----------------------------");
        elev1.sai(3);
        elev1.mostraDados();
        System.out.println("----------------------------");
        elev1.sobe(5);
        elev1.mostraDados();
        System.out.println("----------------------------");
        elev1.desce(3);
        elev1.mostraDados();

    }
}
