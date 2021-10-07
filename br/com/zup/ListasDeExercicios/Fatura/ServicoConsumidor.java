package br.com.zup.ListasDeExercicios.Fatura;

import java.util.ArrayList;
import java.util.List;

public class ServicoConsumidor {

    //Lista para armazenar todos os consumidores que eu cadastrar
    private static List<Consumidor> consumidores = new ArrayList<>();
    //Criar consumidor
    public static Consumidor cadastrarConsumidor(String nome, String email){
        //Criando um novo consumidor recebendo os parâmetros que serão inseridos na classe sistema
        Consumidor consumidor = new Consumidor(nome, email);
        //Adicionando o consumidor criado a minha lista de consumidores cadastrados
        consumidores.add(consumidor);
        //retornando consumidor para cadastrar no sistema
        return consumidor;
    }
}
