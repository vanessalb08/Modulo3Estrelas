package br.com.zup.ListasDeExercicios.ListaClasses;

public class Colaborador extends Pessoa{
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    //Construtores
    public Colaborador(){

    }
    public Colaborador(int codigoSetor, double salarioBase, double imposto) {
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Colaborador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    //Getters e Setters

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    //Métodos
    public double calcularSalario(){
        double salarioLiquido = getSalarioBase() - getImposto();
        return salarioLiquido;
    }
}
