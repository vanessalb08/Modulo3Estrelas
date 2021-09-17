package br.com.zup.ListaModelagem;

public class Main {
    public static void main(String[] args) {
        Bola objBola = new Bola();
        Pessoa objPessoa = new Pessoa("Vanessa", 30, 1.57);
        ContaCorrente objConta = new ContaCorrente(1231,"Vanessa Lima");
        Carro objCarro = new Carro(4,"Esportivo","Renault");

        //Objeto bola
        objBola.circunferencia = 2.1;
        objBola.cor = "azul";
        objBola.marca = "Nike";
        objBola.velocidade = 3.5;

        System.out.println("Bola");
        System.out.println(objBola.circunferencia);
        System.out.println(objBola.cor);
        System.out.println(objBola.marca);
        System.out.println(objBola.velocidade);

        //Objeto pessoa

        objPessoa.peso = 87;

        System.out.println("\nPessoa");
        System.out.println(objPessoa.nome);
        System.out.println(objPessoa.idade);
        System.out.println(objPessoa.altura);
        System.out.println(objPessoa.peso);

        //Conta corrente
        System.out.println("\nConta Corrente");
        System.out.println(objConta.numeroConta);
        System.out.println(objConta.nomeCorrentista);
        System.out.println(objConta.saldo);

        //Carro
        System.out.println("\nCarro");
        System.out.println(objCarro.portas);
        System.out.println(objCarro.modelo);
        System.out.println(objCarro.marca);
        System.out.println(objCarro.potencia);

    }
}
