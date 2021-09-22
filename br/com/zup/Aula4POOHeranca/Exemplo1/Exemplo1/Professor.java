package br.com.zup.Aula4POOHeranca.Exemplo1.Exemplo1;

public class Professor extends Funcionario{
    private String disciplina;

    public Professor(String nome, double salario, String ctps, String cpf, String disciplina) {
        super(nome, salario, ctps, cpf);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
