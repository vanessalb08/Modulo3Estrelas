package br.com.zup.ListasDeExercicios.ListaClasses2;

public class Turma {
    private int quantAlunos;
    private String codigoTurma;

    //Construtores

    public Turma() {
    }

    public Turma(int quantAlunos, String codigoTurma) {
        this.quantAlunos = quantAlunos;
        this.codigoTurma = codigoTurma;
    }
    //Getters e Setters

    public int getQuantAlunos() {
        return quantAlunos;
    }

    public void setQuantAlunos(int quantAlunos) {
        this.quantAlunos = quantAlunos;
    }

    public String getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(String codigoTurma) {
        this.codigoTurma = codigoTurma;
    }
}
