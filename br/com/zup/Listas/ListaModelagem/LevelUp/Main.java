package br.com.zup.Listas.ListaModelagem.LevelUp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pais> continentes = new ArrayList<>(); //Lista de países
        Scanner leitor = new Scanner(System.in);

        //Criação de objetos países
        Pais brasil = new Pais("Brasil", 8516000.0,211000000);
        Pais argentina = new Pais("Argentina", 341341.0,278000000);
        Pais russia = new Pais("Rússia", 67867834.0,243400);
        Pais chile = new Pais("Chile", 23423423.0, 232000);

        boolean menu = true;
        int opcao;

        //Adicionando a lista
        continentes.add(brasil);
        continentes.add(argentina);
        continentes.add(russia);
        continentes.add(chile);

        System.out.println("Seja bem vindo!");

        while (menu){
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Exibir lista dos países");
            System.out.println("2 - Sair");
            opcao = leitor.nextInt();
            if (opcao == 1){
                //percorre a lista e imprime  cada uma das características
                for(Pais referencia : continentes){
                    System.out.println("O nome do país é " + referencia.nome);
                    System.out.println("A extensão territorial de "+referencia.nome+" é "+referencia.extensaoTerritorial);
                    System.out.println("A população de "+ referencia.nome + " é "+ referencia.tamanhoPopulacao);
                    System.out.println("------------------------------------------");
                }
            }
            else if (opcao == 2){
                menu = false;
                System.out.println("Até mais!");
            }
            else{
                System.out.println("Opção inválida!");
            }
        }

    }
}
