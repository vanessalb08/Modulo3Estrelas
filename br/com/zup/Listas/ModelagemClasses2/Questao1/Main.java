package br.com.zup.Listas.ModelagemClasses2.Questao1;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Uno","Chevrolet","branco",15000,500);
        carro1.mostrarDados();
        System.out.println("___________________________");
        carro1.darDesconto(1000);
        carro1.pintar("vermelho");
        carro1.mostrarDados();


    }
}
