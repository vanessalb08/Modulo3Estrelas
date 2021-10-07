package br.com.zup.ListasDeExercicios.Fatura;

import java.util.ArrayList;
import java.util.List;

public class ServicoConsumidor {

    //Lista para armazenar todos os consumidores que eu cadastrar
    private static List<Consumidor> consumidores = new ArrayList<>();
    //Criar consumidor
    public static Consumidor cadastrarConsumidor(String nome, String email) throws Exception{
        verificarEmailValido(email);
        verificarEmailRepetido(email);
        Consumidor consumidor = new Consumidor(nome, email);
        consumidores.add(consumidor);
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
    public static void verificarEmailRepetido(String email) throws Exception{
        for (Consumidor consumidorReferencia : consumidores){
            if (consumidorReferencia.getEmail().equals(email)){
                throw new Exception("E-mail já cadastrado!");
            }
        }
    }
}
