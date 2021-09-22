package br.com.zup.Listas.ListaEncapsulamento.Questao2;

//import br.com.zup.Listas.ModelagemClasses2.Questao3.Elevador;

public class Main {
    public static void main(String[] args) {
        Elevador2 elev1 = new Elevador2(10);

        elev1.setAndarAtual(0);
        elev1.setCapacidade(8);
        elev1.setQtdPessoa(0);


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
        elev1.setTotalAndares(15);
        elev1.desce(3);
        elev1.mostraDados();

    }
}