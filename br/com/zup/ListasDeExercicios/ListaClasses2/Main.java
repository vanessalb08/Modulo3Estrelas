package br.com.zup.ListasDeExercicios.ListaClasses2;

public class Main {
    public static void main(String[] args) {
        Professores professor1 = new Professores("Andre","92138792749",32,"Zup",5000,"Superior","Java",25,2);
        Professores professor2 = new Professores("Vinicius", "92738127",12,"zuoSP",6000,"Superior","Java2",27,1);
        Coordenadores coordenadores = new Coordenadores();
        FuncionariosAdministrativos funcionariosAdministrativos = new FuncionariosAdministrativos("Everton","234234234",14,"secretaria",2500,"secretário","junior");

        //Testando Professores
        System.out.println("--------Professores--------");
        System.out.println("Nome: "+ professor1.getNome());
        System.out.println("Salário: "+ professor1.getSalario());
        System.out.println("Quantidade de turmas: "+ professor1.getQuantidadeTurmas());
        professor1.adcionaTurma();
        System.out.println("Novo n° de Turmas: "+professor1.getQuantidadeTurmas());
        professor1.aumentoSalario();
        System.out.println("O novo salário é: "+professor1.getSalario());
        //Testando Funcionários administrativos
        System.out.println("--------F. Administartivos--------");
        System.out.println("Nome: "+ funcionariosAdministrativos.getNome());
        System.out.println("Salário: "+funcionariosAdministrativos.getSalario());
        funcionariosAdministrativos.aumentoSalario();
        System.out.println("Novo salário: R$ "+ funcionariosAdministrativos.getSalario());
        //Testando Coordenadores
        System.out.println("Lista professores coordenados: \n"+ coordenadores.getProfessores());
        coordenadores.adicionaProfessor(professor1);
        System.out.println("_______________________________");
        coordenadores.exibeListaProf();
        System.out.println("_______________________________");
        coordenadores.adicionaProfessor(professor2);
        coordenadores.exibeListaProf();
    }
}
