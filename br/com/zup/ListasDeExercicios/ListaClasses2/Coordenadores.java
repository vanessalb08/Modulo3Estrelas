package br.com.zup.ListasDeExercicios.ListaClasses2;

import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Universidade {
    private Professores [] professores   = new Professores[3];
    private int indice = 0;

    public Coordenadores() {
    }

    public Coordenadores(Professores[] professores) {
        this.professores = professores;
    }

    public Coordenadores(String nome, String cpf, int numeroRegistro, String orgaoLotacao, double salario, Professores[] professores) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.professores = professores;
    }

    public Professores[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professores[] professores) {
        this.professores = professores;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
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
      if (indice < professores.length){
          if (professores[indice] == null){
              professores[indice] = novoProfessor;
              indice++;
          }
      }
      else{
          System.out.println("Quantidade máxima atingida!");
      }
    }
    public void exibeListaProf(){
        System.out.println("Lista de Professores coordenados:");
        for(Professores referencia : professores){
            System.out.println("Nome: "+ referencia.getNome());
        }
    }
}
