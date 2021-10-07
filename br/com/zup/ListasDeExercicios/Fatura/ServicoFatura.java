package br.com.zup.ListasDeExercicios.Fatura;

import java.util.ArrayList;
import java.util.List;

public class ServicoFatura {
    private static List<Fatura> faturas = new ArrayList<>();

    //Criar Fatura
    public static Fatura cadastrarFatura (String email , double valor, String dataVencimento) throws Exception{
        Consumidor consumidor = ServicoConsumidor.pesquisarConsumidorExistente(email);
        Fatura fatura = new Fatura(consumidor,valor,dataVencimento);
        faturas.add(fatura);

        return fatura;
    }
    //PesquisarFatura
}
