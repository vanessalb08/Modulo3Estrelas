package br.com.zup.ListasDeExercicios.ListaClasses2;

public class Professores extends Universidade {
    private String nivelGraduacao;
    private String disciplionaMinistrada;
    private int quantidadeAlunos;
    private int quantidadeTurmas;

    //Construtores
    public Professores() {
    }

    public Professores(String nome, String cpf, int numeroRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
    }

    public Professores(String nivelGraduacao, String disciplionaMinistrada, int quantidadeAlunos, int quantidadeTurmas) {
        this.nivelGraduacao = nivelGraduacao;
        this.disciplionaMinistrada = disciplionaMinistrada;
        this.quantidadeAlunos = quantidadeAlunos;
        this.quantidadeTurmas = quantidadeTurmas;
    }

    public Professores(String nome, String cpf, int numeroRegistro, String orgaoLotacao, double salario, String nivelGraduacao, String disciplionaMinistrada, int quantidadeAlunos, int quantidadeTurmas) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplionaMinistrada = disciplionaMinistrada;
        this.quantidadeAlunos = quantidadeAlunos;
        this.quantidadeTurmas = quantidadeTurmas;
    }
    //Getters e Setters

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplionaMinistrada() {
        return disciplionaMinistrada;
    }

    public void setDisciplionaMinistrada(String disciplionaMinistrada) {
        this.disciplionaMinistrada = disciplionaMinistrada;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public int getQuantidadeTurmas() {
        return quantidadeTurmas;
    }

    public void setQuantidadeTurmas(int quantidadeTurmas) {
        this.quantidadeTurmas = quantidadeTurmas;
    }
    //Métodos
    public int adcionaTurma(){
        int adicionaTurma = getQuantidadeTurmas() + 1;
        setQuantidadeTurmas(adicionaTurma);
        System.out.println("Turma adicionada!");
        return adicionaTurma;
    }

}
