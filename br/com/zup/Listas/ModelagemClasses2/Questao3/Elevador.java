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
        if ((qtdPessoa + pessoas) <= capacidade){
            qtdPessoa += pessoas;
        }
        else{
            System.out.println("Capacidade excedida!");
        }
    }
    public void sai(int pessoas){
        if (qtdPessoa > 0){
            qtdPessoa -= pessoas;
        }
        else{
            System.out.println("Não há ninguém para sair!");
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
        if (andarAtual == 0){
            System.out.println("Já estamos no térreo");
        }
        else{
            andarAtual -= novoAndar;
        }
    }
}
