package br.com.zup.ListasDeExercicios.Imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Imobiliaria imoveis = new Imobiliaria();

        Funcionario funcionario = new Funcionario("Vanessa","42524524","8888888888");

        Imovel imovel = new Imovel("Itabaiana",900,funcionario);
        Imovel imovel2 = new Imovel("Rua J",1000,funcionario);

        Moradores morador1Imovel1 = new Moradores("Andre","2341341",5000);
        Moradores morador2Imovel1 = new Moradores("Mari","5263245635",3000);

        Moradores morador1Imovel2  = new Moradores("Marcio","314134",24523);
        Moradores morador2Imovel2 = new Moradores("Vanessa","21321321",31412);

        imovel.adicionarMorador(morador1Imovel1);
        imovel.adicionarMorador(morador2Imovel1);
        imoveis.adicionarImovel(imovel);
        System.out.println(imoveis);
        imovel2.adicionarMorador(morador1Imovel2);
        imovel2.adicionarMorador(morador2Imovel2);
        imoveis.adicionarImovel(imovel2);
        System.out.println(imoveis);
    }
}
