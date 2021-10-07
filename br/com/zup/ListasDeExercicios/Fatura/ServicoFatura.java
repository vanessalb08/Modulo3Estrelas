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
    public static List<Fatura> pesquisarFaturaConsumidor(String email){
        List<Fatura> faturasConsumidor = new ArrayList<>();
        for (Fatura faturaReferencia : faturas){
            if (faturaReferencia.getConsumidor().getEmail().equals(email)){
                faturasConsumidor.add(faturaReferencia);
            }
        }
        return faturasConsumidor;
    }
}
