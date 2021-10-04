package br.com.zup.ListasDeExercicios.Imobiliaria2;

public class Funcionario extends Pessoa{
    private String codigoFuncionario;

    //Construtor

    public Funcionario() {

    }

    public Funcionario(String nome, String cpf, String codigoFuncionario) {
        super(nome, cpf);
        this.codigoFuncionario = codigoFuncionario;
    }

    //Getters e Setters

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }
    //Métodos

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append(super.toString());
        retorno.append("Código do funcionário: "+ codigoFuncionario);
        return retorno.toString();
    }
}
