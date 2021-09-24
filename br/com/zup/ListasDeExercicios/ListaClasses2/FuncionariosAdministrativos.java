package br.com.zup.ListasDeExercicios.ListaClasses2;

public class FuncionariosAdministrativos extends Universidade{
    private String funcaoAdministrativa;
    private String senioridade;

    public FuncionariosAdministrativos() {
    }

    public FuncionariosAdministrativos(String funcaoAdministrativa, String senioridade) {
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
    }

    public FuncionariosAdministrativos(String nome, String cpf, int numeroRegistro, String orgaoLotacao, double salario, String funcaoAdministrativa, String senioridade) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
    }

    //Getters e Setters

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }
}
