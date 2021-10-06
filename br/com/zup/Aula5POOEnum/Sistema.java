package br.com.zup.Aula5POOEnum;

import java.util.Scanner;

public class Sistema {

    //Linha de frente com o usuário

    private static Scanner capturarDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    public static void menu(){
        System.out.println("[1] - Cadastrar Consumidor");
        System.out.println("[2] - Cadastrar fatura");
        System.out.println("[3] - Sair");
    }
}
