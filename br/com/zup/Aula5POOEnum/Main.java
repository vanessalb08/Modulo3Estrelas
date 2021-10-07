package br.com.zup.Aula5POOEnum;

public class Main {
    public static void main(String[] args) {
        //Tenta cadastrar uma fatura
        try{
            Sistema.executar();
            //Se não conseguir faz o catch que trata a exceção enão deixa o usuário cadastrar

        }catch (Exception erro){
            System.out.println(erro.getMessage());
        }
    }
}
