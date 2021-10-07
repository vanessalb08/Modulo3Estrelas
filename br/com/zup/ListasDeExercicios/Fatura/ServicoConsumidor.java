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
    //Verificar se existe o consumidor através do email
    public static Consumidor pesquisarConsumidorExistente(String email) throws Exception{
        for (Consumidor consumidorReferencia : consumidores){
            if (consumidorReferencia.getEmail().equals(email)){
                return consumidorReferencia;
            }
        }
        throw new Exception("Não existe cadastro com esse e-mail");
    }

    //Verificar se email é válido
    public static void verificarEmailValido(String email) throws Exception{
        if (!email.contains("@")){
            throw new Exception("Email inválido!");
        }
    }

}
