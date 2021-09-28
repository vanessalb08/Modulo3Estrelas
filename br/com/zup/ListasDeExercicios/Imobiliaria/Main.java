package br.com.zup.ListasDeExercicios.Imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Vanessa","42524524","8888888888");

        Imovel imovel = new Imovel("Itabaiana",900,funcionario);

        Moradores morador1 = new Moradores("Andre","2341341",5000);
        Moradores morador2 = new Moradores("Mari","5263245635",3000);

        System.out.println(imovel);
        imovel.adicionarMorador(morador1);
        System.out.println("--------------------------");
        System.out.println(imovel);
    }
}
