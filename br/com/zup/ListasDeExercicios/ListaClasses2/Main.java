package br.com.zup.ListasDeExercicios.ListaClasses2;

public class Main {
    public static void main(String[] args) {
        Professores professores = new Professores("Andre","92138792749",32,"Zup",5000,"Superior","Java",25,2);
        Coordenadores coordenadores = new Coordenadores();
        FuncionariosAdministrativos funcionariosAdministrativos = new FuncionariosAdministrativos();

        //Testando Professores
        System.out.println("--------Professores--------");
        System.out.println("Nome: "+ professores.getNome());
        System.out.println("Salário: "+ professores.getSalario());
        System.out.println("Quantidade de turmas: "+ professores.getQuantidadeTurmas());
        professores.adcionaTurma();
        System.out.println("Novo n° de Turmas: "+professores.getQuantidadeTurmas());
        professores.aumentoSalario();
        System.out.println("O novo salário é: "+professores.getSalario());

    }
}
