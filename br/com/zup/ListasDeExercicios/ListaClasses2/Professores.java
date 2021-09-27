package br.com.zup.ListasDeExercicios.ListaClasses2;

import java.util.ArrayList;
import java.util.List;

public class Professores extends Universidade {
    private String nivelGraduacao;
    private String disciplionaMinistrada;
    private int quantidadeAlunos;
    private List<Turma> quantidadeTurmas = new ArrayList<>();

    //Construtores
    public Professores() {
    }

    public Professores(String nome, String cpf, int numeroRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
    }

    public Professores(String nivelGraduacao, String disciplionaMinistrada, int quantidadeAlunos) {
        this.nivelGraduacao = nivelGraduacao;
        this.disciplionaMinistrada = disciplionaMinistrada;
        this.quantidadeAlunos = quantidadeAlunos;

    }

    public Professores(String nome, String cpf, int numeroRegistro, String orgaoLotacao, double salario, String nivelGraduacao, String disciplionaMinistrada, int quantidadeAlunos) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplionaMinistrada = disciplionaMinistrada;
        this.quantidadeAlunos = quantidadeAlunos;

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


    //Métodos
    public void adcionaTurma(Turma novaTurma){
       quantidadeTurmas.add(novaTurma);
    }
    public void exibeTurmas(){
        System.out.println("-------------------------------------");
        System.out.println("Lista de Turmas de "+getNome()+": ");
        for (Turma referencia : quantidadeTurmas){
            System.out.println("Quantidade de alunos: "+referencia.getQuantAlunos());
            System.out.println("Código de turma: "+ referencia.getCodigoTurma());
        }
    }

}
