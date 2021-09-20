package br.com.zup.Aula3POOMetodos.Exemplo1;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente("Vanessa","08913849314","1343", "4324");
        cc1.mostrarDados();
        System.out.println("________________________________________");
        //depositando
        cc1.depositar(100);
        cc1.mostrarDados();
        System.out.println("________________________________________");
        cc1.depositar(50);
        cc1.mostrarDados();
        System.out.println("________________________________________");
        cc1.sacar(70);
        cc1.mostrarDados();
        System.out.println("________________________________________");
        cc1.solicitaEmprestimo(80);
        cc1.mostrarDados();
    }
}
