package br.com.zup.Aula4POOHeranca.Exemplo1.Exemplo1;

public class Inspetor extends Funcionario{
    private String areaInspecao;

    public Inspetor(String nome, double salario, String ctps, String cpf, String areaInspecao) {
        super(nome, salario, ctps, cpf);
        this.areaInspecao = areaInspecao;
    }

    public String getAreaInspecao() {
        return areaInspecao;
    }

    public void setAreaInspecao(String areaInspecao) {
        this.areaInspecao = areaInspecao;
    }
}
