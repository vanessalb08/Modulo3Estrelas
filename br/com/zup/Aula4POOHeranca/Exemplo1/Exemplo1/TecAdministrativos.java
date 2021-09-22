package br.com.zup.Aula4POOHeranca.Exemplo1.Exemplo1;

public class TecAdministrativos extends Funcionario{
    private String departamento;

    public TecAdministrativos(String nome, double salario, String ctps, String cpf, String departamento) {
        super(nome, salario, ctps, cpf);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
