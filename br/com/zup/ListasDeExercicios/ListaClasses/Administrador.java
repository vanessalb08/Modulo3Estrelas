package br.com.zup.ListasDeExercicios.ListaClasses;

public class Administrador extends Colaborador{
    private double ajudaDECusto;

    //Construtores
    public Administrador(){

    }

    public Administrador(double ajudaDECusto) {
        this.ajudaDECusto = ajudaDECusto;
    }

    public Administrador(int codigoSetor, double salarioBase, double imposto, double ajudaDECusto) {
        super(codigoSetor, salarioBase, imposto);
        this.ajudaDECusto = ajudaDECusto;
    }

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDECusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDECusto = ajudaDECusto;
    }

    //Getetrs e Setters

    public double getAjudaDECusto() {
        return ajudaDECusto;
    }

    public void setAjudaDECusto(double ajudaDECusto) {
        this.ajudaDECusto = ajudaDECusto;
    }
    //Métodos
    @Override
    public double calcularSalario(){
        double novoSalario = getSalarioBase()-getImposto()+getAjudaDECusto();
        return novoSalario;
    }
}
