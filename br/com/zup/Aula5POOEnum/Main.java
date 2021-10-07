package br.com.zup.Aula5POOEnum;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;

        //Faz com que continue o sistema mesmo se estourar uma exceção, porque ele só só vai sair quando receber false,
        //e só vai ser false quando o EXECUTAR RETORNAR FALSE
        //e o executar SÓ VAI RETORNAR false se o USUÁRIO ESCOLHER OPÇÃO 4
        while (continuar){
            //Tenta cadastrar uma fatura
            try{
                continuar = Sistema.executar();
                //Se não conseguir faz o catch que trata a exceção enão deixa o usuário cadastrar

            }catch (Exception erro){
                System.out.println(erro.getMessage());
            }
        }

    }
}
