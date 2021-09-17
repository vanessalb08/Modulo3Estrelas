package br.com.zup.ListaModelagem.LevelUp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> continentes = new ArrayList<>();
        Pais brasil = new Pais("Brasil", 1341,800000);
        Pais argentina = new Pais("Argentina", 341341,293000);
        Pais russia = new Pais("Rússia", 67867834,243400);
        Pais chile = new Pais("Chile", 23423423, 232000);

        //Adicionando a lista

        continentes.add(brasil.nome);
        continentes.add(argentina.nome);
        continentes.add(russia.nome);
        continentes.add(chile.nome);

        System.out.println(continentes);

    }
}
