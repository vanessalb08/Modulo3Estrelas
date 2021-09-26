package br.com.zup.ListasDeExercicios.ListaClasses2;

public class Main {
    public static void main(String[] args) {
        Professores professores = new Professores("Andre","92138792749",32,"Zup",5000,"Superior","Java",25,2);
        Coordenadores coordenadores = new Coordenadores();
        FuncionariosAdministrativos funcionariosAdministrativos = new FuncionariosAdministrativos("Everton","234234234",14,"secretaria",2500,"secretário","junior");

        //Testando Professores
        System.out.println("--------Professores--------");
        System.out.println("Nome: "+ professores.getNome());
        System.out.println("Salário: "+ professores.getSalario());
        System.out.println("Quantidade de turmas: "+ professores.getQuantidadeTurmas());
        professores.adcionaTurma();
        System.out.println("Novo n° de Turmas: "+professores.getQuantidadeTurmas());
        professores.aumentoSalario();
        System.out.println("O novo salário é: "+professores.getSalario());
        //Testando Funcionários administrativos
        System.out.println("--------F. Administartivos--------");
        System.out.println("Nome: "+ funcionariosAdministrativos.getNome());
        System.out.println("Salário: "+funcionariosAdministrativos.getSalario());
        funcionariosAdministrativos.aumentoSalario();
        System.out.println("Novo salário: R$ "+ funcionariosAdministrativos.getSalario());

    }
}
