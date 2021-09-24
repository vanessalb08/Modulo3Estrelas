package br.com.zup.ListasDeExercicios.ModelagemClasses2.Questao1;

public class Carro {
    String nome;
    String fabricante;
    String cor;
    double valor;
    double peso;

    public Carro(String nome, String fabricante,String cor, double valor, double peso){
        this.nome = nome;
        this.fabricante = fabricante;
        this.cor = cor;
        this.valor = valor;
        this.peso = peso;
    }

    //Mostrar dados
    public void mostrarDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Fabricante: "+fabricante);
        System.out.println("Cor: "+cor);
        System.out.println("Valor: R$ "+valor);
        System.out.println("Peso: " +peso+" kg");
    }

    //Desconto
    public void darDesconto(double desconto){
        valor -= desconto;
    }

    //Mudar cor do carro
    public void pintar(String novaCor){
        cor = novaCor;
    }
}
