package br.com.zup.Listas.ModelagemClasses2.Questao4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CartaoCredito cartao1 = new CartaoCredito(1600,"Vanessa");
        Scanner leitor = new Scanner(System.in);
        List<Double> totalCompras = new ArrayList<>();
        boolean menu = true;
        int opcao;

        cartao1.saldo = cartao1.limite;
        System.out.println("Bem vindx " + cartao1.nomeCliente);
        while (menu){
            System.out.println("Por favor, digita a opção desejada:");
            System.out.println("1 - Aumentar Limite");
            System.out.println("2 - Diminuir Limite");
            System.out.println("3 - Realizar compra");
            System.out.println("4 - Mostrar compras feitas");
            System.out.println("5 - Mostrar fatura");
            System.out.println("6 - Sair");
            opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1){
                System.out.println("Qual o valor do aumento? ");
                double aumento = leitor.nextDouble();
                cartao1.aumentaLimite(aumento);
                System.out.println("--------------------------------------------------------------------");
                System.out.println("Limite aumentado em R$ "+ aumento + ". Novo limite é R$ "+cartao1.limite);
                System.out.println("--------------------------------------------------------------------");
            }
            else if(opcao == 2){
                System.out.println("Qual o valor da redução? ");
                double reducao = leitor.nextDouble();
                cartao1.diminuiLimite(reducao);
                System.out.println("--------------------------------------------------------------------");
                System.out.println("Limite reduzido em R$ "+ reducao + ". Novo limite é R$ "+cartao1.limite);
                System.out.println("--------------------------------------------------------------------");
            }
            else if (opcao == 3){
                System.out.println("Qual o valor da compra?");
                double compra = leitor.nextDouble();
                cartao1.realizaCompra(compra);
                System.out.println("--------------------------------------------------------------------");
                System.out.printf("Compra de R$ %.2f realizada. Saldo restante R$ %.2f\n",compra,cartao1.saldo);
                System.out.println("--------------------------------------------------------------------");
                //Adicionando a compra na lista
                totalCompras.add(compra);
                //Somando compra ao total de compras feitas
                cartao1.compras(compra);
            }
            //
            else if (opcao == 4){
                if (totalCompras.size()==0){
                    System.out.println("Nenhuma compra foi realizada");
                }
                else{
                    System.out.println("Compras realizadas:" + totalCompras);
                }

            }
            else if (opcao == 5){
                cartao1.imprimeFatura();
            }
            else if (opcao == 6){
                menu = false;
                System.out.println("Até mais!");
            }
            else{
                System.out.println("Opção inválida!");
            }

        }

    }
}
