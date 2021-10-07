package br.com.zup.Aula5POOEnum;

import java.util.ArrayList;
import java.util.List;

public class ServicoFatura {

    //Responsável por tudo que será feito com os objetos da classe fatura

    private static List<Fatura> faturas = new ArrayList<>();

    //Pede email porque é por ele que vai verificar se já esixte consumidor cadastrado
    public static Fatura cadastrarFatura(String email, double valor, String dataVencimento) throws Exception{
        //Para saber se tem um consumidor com esse mail cadastrado precisa percorrer a lista de consumidores
        Consumidor consumidor = ServicoConsumidor.pesquisarConsumidorPorEmail(email);
        //Precisa avisar que pode estrourar uma exceção
        Fatura fatura = new Fatura(consumidor,valor,dataVencimento);
        faturas.add(fatura);
        return fatura;
    }

    //Pesquisar a lista de faturas de um consumidor e adicionar a uma lista de faturas
    public static List<Fatura> pesquisarFaturaPeloEmail (String email){
        List<Fatura> faturasDoUsuario = new ArrayList<>();
        for (Fatura faturaReferencia : faturas){
            //Se o email desse consumidor dessa fatura for igual ao pesquisado
            if (faturaReferencia.getConsumidor().getEmail().equals(email)){
                faturasDoUsuario.add(faturaReferencia);
            }
        }
        return faturasDoUsuario;
    }
}
