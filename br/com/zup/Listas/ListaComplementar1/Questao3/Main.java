package br.com.zup.Listas.ListaComplementar1.Questao3;

import java.util.Scanner;
import java.util.concurrent.locks.ReadWriteLock;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Retangulo retangulo1 = new Retangulo();

        boolean sair = false;
        int opcao;

        while (!sair){
            retangulo1.menu();
            opcao = leitor.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Informe a altura: ");
                    double altura = leitor.nextDouble();
                    retangulo1.altura = altura;
                    System.out.println("Informe a base: ");
                    double base = leitor.nextDouble();
                    retangulo1.base = base;
                    break;
                case 2:
                    System.out.println("Informe nova altura: ");
                    double novaAltura = leitor.nextDouble();
                    retangulo1.mudarValorAltura(novaAltura);
                    System.out.println("Informe nova base: ");
                    double novaBase = leitor.nextDouble();
                    retangulo1.mudarValorBase(novaBase);
                    break;
                case 3:
                    System.out.println("A área do retângulo é: "+retangulo1.areaRetangulo());
                    System.out.println("O perímetro do retângulo é:  "+retangulo1.perimetroRetangulo());
                    break;
                case 4:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }



    }
}
