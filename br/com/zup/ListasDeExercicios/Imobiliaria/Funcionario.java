package br.com.zup.ListasDeExercicios.Imobiliaria;

public class Funcionario extends Pessoa{
    private String ctps;

    //Contrutores

    public Funcionario() {
    }

    public Funcionario(String ctps) {
        this.ctps = ctps;
    }

    public Funcionario(String nome, String cpf, String ctps) {
        super(nome, cpf);
        this.ctps = ctps;
    }

    @Override
    public String toString() {
       StringBuilder dadosFuncionario = new StringBuilder();
       dadosFuncionario.append(super.toString());
       dadosFuncionario.append("\n\tCTPS: "+ctps);
       return dadosFuncionario.toString();
    }
}
