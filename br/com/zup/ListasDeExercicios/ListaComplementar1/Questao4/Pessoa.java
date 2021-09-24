package br.com.zup.ListasDeExercicios.ListaComplementar1.Questao4;

public class Pessoa {
    String nome;
    int idade;
    double peso;
    double altura;

    public Pessoa(String nome, int idade, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    public void envelhecer(int novaIdade){
        if (novaIdade > idade){
            if (idade < 21){
                int diferenca = novaIdade - idade;
                altura += diferenca * 0.5;
            }
            idade += novaIdade;
        }
        else{
            System.out.println("Nova idade menor que a atual");
        }
    }
    public void engordar(double qtdQuilos){
        peso += qtdQuilos;
    }
    public void emagrecer(double qtdQuilos){
        peso -= qtdQuilos;
    }
    public void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade :" + idade);
        System.out.println("Peso: "+ peso);
        System.out.println("Altura" + altura);
        System.out.println("------------------------------");
    }
}
