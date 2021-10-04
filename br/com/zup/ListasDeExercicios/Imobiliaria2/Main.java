package br.com.zup.ListasDeExercicios.Imobiliaria2;

public class Main {
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario("Andre","0314083","312-b");
        Funcionario func2 = new Funcionario("Vinicius","31431414","123-c");

        Morador morador1 = new Morador("Vanessa","02349423432",1500);
        Morador morador2 = new Morador("Everton","30981314",1000);
        Morador morador3 = new Morador("Alice","08345676",500);
        Morador morador4 = new Morador("Amanda","02349423432",500);

        Imovel imovel1 = new Imovel(func1,"Rua J",1000);
        Imovel imovel2 = new Imovel(func2,"Av H",800);

        Imobiliaria imobiliaria = new Imobiliaria();

        imovel1.cadastrarMoradores(morador1);
        System.out.println("==================================================================");
        imobiliaria.cadastrarImovel(imovel1);
        System.out.println(imobiliaria);
        System.out.println("==================================================================");
        imovel2.cadastrarMoradores(morador2);
        System.out.println("==================================================================");
        imovel1.cadastrarMoradores(morador3);
        System.out.println("==================================================================");
        System.out.println(imobiliaria);
        System.out.println("==================================================================");
        imobiliaria.cadastrarImovel(imovel2);
        imovel1.cadastrarMoradores(morador4);
        System.out.println("==================================================================");
        System.out.println(imobiliaria);
        System.out.println("==================================================================");
        imovel1.excluirMoradorCPF("08345676");
        System.out.println(imobiliaria);


    }
}
