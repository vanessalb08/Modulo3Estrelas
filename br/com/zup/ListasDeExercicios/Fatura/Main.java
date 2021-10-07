package br.com.zup.ListasDeExercicios.Fatura;

public class Main {
    public static void main(String[] args) throws Exception{
        Sistema.cadastrarConsumidor();
        Sistema.cadastrarFatura();
    }
}
/*
Entrega média: O sistema não permite cadastrar consumidores com e-mail inválido (sem @) e não permite cadastrar consumidores com e-mail repetido.


Entrega Máxima: O sistema permite pesquisar todas as faturas de um consumidor através de seu e-mail.
consumidor pode ser pessoa física ou pessoa jurídica
 */