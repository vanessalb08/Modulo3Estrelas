package br.com.zup.ListasDeExercicios.Fatura;

import java.util.ArrayList;
import java.util.List;

public class ServicoConsumidor {

    //Lista para armazenar todos os consumidores que eu cadastrar
    private static List<Consumidor> consumidores = new ArrayList<>();
    //Criar consumidor
    public static Consumidor cadastrarConsumidor(String nome, String email, TipoPessoa tipoPessoa) throws Exception{
        verificarEmailValido(email);
        verificarEmailRepetido(email);
        Consumidor consumidor = new Consumidor(nome, email,tipoPessoa);
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
    public static List<TipoPessoa> mostrarTipoPessoa (){
        List<TipoPessoa> tipoPessoas = new ArrayList<>();

        for (TipoPessoa tipoPessoaReferencia : TipoPessoa.values()){
            tipoPessoas.add(tipoPessoaReferencia);
        }
        return tipoPessoas;
    }
    public static TipoPessoa validarTipoPessoa(String tipo) throws Exception{
        for (TipoPessoa tipoPessoaReferencia : TipoPessoa.values()){
            String ignorarEspaco = tipo.replaceAll("\\s+","");
            if (ignorarEspaco.equalsIgnoreCase(String.valueOf(tipoPessoaReferencia))){
                return tipoPessoaReferencia;
            }
        }
        throw new Exception("Tipo inválido");
    }
}
