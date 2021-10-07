package br.com.zup.Aula5POOEnum;

import java.util.ArrayList;
import java.util.List;

public class ServicoConsumidor {

    //Responsável por tudo que será feito com os objetos da classe consumidor

    private static List<Consumidor> consumidores = new ArrayList<>();

    //Validar o email (se tem @)
    //para verificar basta colocar a exceção caso a condição ocorra. Se a condição não ocorrer ele continua o programa normalmente
    public static void validarEmail(String email) throws Exception{
        if (!email.contains("@")){
            throw new Exception("E-mail inválido!");
        }
    }
    //verificar se o email existe
    public static void verificarEmailExiste (String email) throws Exception{
        for (Consumidor consumidorReferencia : consumidores){
            if (consumidorReferencia.getEmail().equals(email)){
                throw new Exception("Já existe um e-mail cadastrado!");
            }
        }
    }
    //Cadastrar consumidor na lista. O retorno é para poder usar o metodo depois (reaproveitamento)
    //Vai pegar os dados do sistema, colocar nos parâmetros e adicionar esse consumidor na lista
    public static Consumidor cadastrarConsumidor(String nome, String email) throws Exception{
        validarEmail(email);
        verificarEmailExiste(email);
        Consumidor consumidor = new Consumidor(nome, email);
        consumidores.add(consumidor);
        return consumidor;
    }

    //Percorrer a lista de consumidores e verficar se o consumidor existe através do email
    //Avisa que pode gerar uma exceção. Nesse caso a exceção vai ser se não encontrar o email cadastrado
    public static Consumidor pesquisarConsumidorPorEmail(String email) throws Exception{
        for (Consumidor  consumidorReferencia:consumidores){
            if (consumidorReferencia.getEmail().equals(email)){
                return consumidorReferencia;
            }
        }
        //Cria a exceção que vai dar
        throw new Exception("Consumidor não cadastrado no Sistema");
    }


}
