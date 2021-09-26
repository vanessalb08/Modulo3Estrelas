package br.com.zup.ListasDeExercicios.ListaClasses2;

public class Universidade {
    private String nome;
    private String cpf;
    private int numeroRegistro;
    private String orgaoLotacao;
    private double salario;

    //Construtores
    public Universidade() {
    }

    public Universidade(String nome, String cpf, int numeroRegistro, String orgaoLotacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroRegistro = numeroRegistro;
        this.orgaoLotacao = orgaoLotacao;
        this.salario = salario;
    }
    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Métodos
    public double aumentoSalario(){
        double salarioAumentado = getSalario() * 1.1;
        setSalario(salarioAumentado);
        System.out.println("Salário aumentado em 10%");
        return salarioAumentado;
    }
}
