package br.com.zup.ListasDeExercicios.ListaClasses2;

import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Universidade {
    private List<Professores> professores = new ArrayList<>();

    public Coordenadores() {
    }

    public Coordenadores(List<Professores> professores) {
        this.professores = professores;
    }

    public Coordenadores(String nome, String cpf, int numeroRegistro, String orgaoLotacao, double salario, List<Professores> professores) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.professores = professores;
    }

    public List<Professores> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professores> professores) {
        this.professores = professores;
    }

    //Métodos
    @Override
    public double aumentoSalario(){
        double salarioAumentado = getSalario() * 1.05;
        setSalario(salarioAumentado);
        System.out.println("Salário aumentado em 5%");
        return salarioAumentado;
    }
    public void adicionaProfessor(Professores novoProfessor){
       professores.add(novoProfessor);
    }
    public void exibeListaProf(){
        for(Professores referencia : professores){
            System.out.println("Nome: "+ referencia.getNome());
        }
    }
}
