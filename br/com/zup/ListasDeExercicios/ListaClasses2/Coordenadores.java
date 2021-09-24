package br.com.zup.ListasDeExercicios.ListaClasses2;

import java.util.ArrayList;
import java.util.List;

public class Coordenadores {
    private List<Professores> professores = new ArrayList<>();

    public Coordenadores(List<Professores> professores) {
        this.professores = professores;
    }

    public List<Professores> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professores> professores) {
        this.professores = professores;
    }
}
