package br.com.zup.Listas.ModelagemClasses2.Questao3;

public class Elevador {
    int andarAtual = 0;
    int totalAndares;
    int capacidade = 8;
    int qtdPessoa = 0;

    public Elevador(int totalAndares){
        this.totalAndares = totalAndares;
        //this.capacidade = capacidade;
    }
    public void mostraDados(){
        System.out.println("Total de andares: "+totalAndares);
        System.out.println("Capacidade: "+ capacidade);
        System.out.println("Andar atual: "+andarAtual);
        System.out.println("Pessoas no elevador: "+qtdPessoa);
    }

    public void entra(int pessoas){
        int totalDeViajantes = pessoas + qtdPessoa;

        if (totalDeViajantes > capacidade){
            System.out.println("O elevador não comporta tal quantidade. ");
            System.out.println("Quantidade de pessoas que excedeu: " +(totalDeViajantes-capacidade));
        }else{
            qtdPessoa = totalDeViajantes;
        }
    }
    public void sai(int pessoas){

        int totalDeViajantes = qtdPessoa - pessoas;

        if (totalDeViajantes < 0){
            System.out.println("Você não pode tirar uma quantidade maior de pessoas do que a quantidade de pessoas presentes ");
        }else{
            qtdPessoa = totalDeViajantes;
        }
    }

    public void sobe(int novoAndar){
        if (andarAtual == totalAndares){
            System.out.println("Não há pra onde subir");
        }
        else if ((andarAtual + novoAndar) > totalAndares){
            System.out.println("Andar não existe!");
        }
        else{
            andarAtual += novoAndar;
        }
    }
    public void desce (int novoAndar){
        int total = andarAtual - novoAndar;
        if (andarAtual == 0 | (andarAtual - total) < 0){
            System.out.println("Já estamos no térreo");
        }
        else{
            andarAtual = total;
        }
    }
}
