package br.com.zup.ListaModelagem.LevelUp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> continentes = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        Pais brasil = new Pais("Brasil", 1341,800000);
        Pais argentina = new Pais("Argentina", 341341,293000);
        Pais russia = new Pais("Rússia", 67867834,243400);
        Pais chile = new Pais("Chile", 23423423, 232000);

        boolean sair = false;
        int opcao;

        //Adicionando a lista
        continentes.add(brasil.nome);
        continentes.add(argentina.nome);
        continentes.add(russia.nome);
        continentes.add(chile.nome);

        System.out.println("Seja bem vindo!");

        while (!sair){
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Exibir lista dos países");
            System.out.println("2 - Sair");
            opcao = leitor.nextInt();
            if (opcao == 1){
                System.out.println(continentes);
            }
            else if (opcao == 2){
                sair = true;
                System.out.println("Até mais!");
            }
            else{
                System.out.println("Opção inválida!");
            }
        }




    }
}
