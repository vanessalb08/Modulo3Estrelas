package br.com.zup.ListasDeExercicios.Imobiliaria2;

import java.util.Scanner;

public class Sistema {
    private static Scanner capturaDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
}
