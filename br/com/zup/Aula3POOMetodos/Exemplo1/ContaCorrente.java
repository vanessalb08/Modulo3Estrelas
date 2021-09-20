package br.com.zup.Aula3POOMetodos.Exemplo1;

public class ContaCorrente {
    String nomeTitular;
    String cpf;
    String agencia;
    String numeroConta;
    double emprestimo = 900;
    double saldo = 0;

    /*public ContaCorrente(){

    }*/
    public ContaCorrente(String nomeTitular, String cpf, String agencia, String numeroConta){
        this.nomeTitular = nomeTitular;
        this.cpf = cpf;
        this.agencia = agencia;
        this.numeroConta = numeroConta;

    }

    public void mostrarDados(){
        System.out.println("Titular: "+nomeTitular);
        System.out.println("CPF: " + cpf);
        System.out.println("Agência: "+ agencia);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Valor liberado para empréstimo:" + emprestimo);
        System.out.println("Saldo: R$ "+saldo);
    }

    public void depositar(double valorDeposito){
        //precisa receber um parâmetro (ingrediante a ser processado no liquidificador)
        saldo += valorDeposito;
    }
    public void sacar(double valorSacado){
        saldo -= valorSacado;
    }
    public void solicitaEmprestimo(double valor){
        if (valor > emprestimo){
            System.out.println("Negado! Limite maior que o pré aprovado");
        }
        else{
            System.out.println("Empréstimo aprovado!");
            emprestimoAprovado(valor);
        }
    }
    public void emprestimoAprovado(double valor){
        emprestimo -= valor;
        depositar(valor);
    }
    public double caculaImposto(){
        double resultado = 0.1 * saldo;
        return resultado;
    }
    public void debitaImposto(){
        saldo -= caculaImposto();
    }
}
