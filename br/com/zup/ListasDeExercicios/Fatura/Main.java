package br.com.zup.ListasDeExercicios.Fatura;

public class Main {
    public static void main(String[] args){
        boolean continuarExecutar = true;
        while (continuarExecutar){
            try {
                continuarExecutar = Sistema.executar();
            }catch (Exception erro){
                System.out.println(erro.getMessage());
            }
        }
    }
}
/*1
Entrega Máxima: O sistema permite pesquisar todas as faturas de um consumidor através de seu e-mail.
consumidor pode ser pessoa física ou pessoa jurídica
 */