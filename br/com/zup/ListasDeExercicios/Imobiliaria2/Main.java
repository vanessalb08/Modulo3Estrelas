package br.com.zup.ListasDeExercicios.Imobiliaria2;

public class Main {
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario("Andre","0314083","312-b");
        Morador morador1 = new Morador("Vanessa","02349423432",1500);
        Imovel imovel1 = new Imovel(func1,"Rua J",1000);

        imovel1.cadastrarMoradores(morador1);
        System.out.println(imovel1);
    }
}
