package br.com.zup.ListasDeExercicios.Fatura;

import java.util.List;
import java.util.Scanner;

public class Sistema {
    //Receber dados do usuário
    private static Scanner receberDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    public static void menu(){
        System.out.println("========Menu de opções=======");
        System.out.println("[1] - Cadastrar Consumidor");
        System.out.println("[2] - Cadastrar fatura");
        System.out.println("[3] - Pesquisar faturas do consumidor");
        System.out.println("[4] - Sair do programa");
    }

    //Cadastrar consumidor
    public static Consumidor cadastrarConsumidor() throws Exception{
        String nome = receberDados("Qual o nome do consumidor? ").nextLine();
        String email = receberDados("Qual o email do consumidor?").nextLine();
        ServicoConsumidor.mostrarTipoPessoa();
        String tipo = receberDados("Qual o tipo da pessoa?").nextLine();
        TipoPessoa tipoPessoa = ServicoConsumidor.validarTipoPessoa(tipo);

        ServicoConsumidor.verificarEmailValido(email);

        //Retornar o método de cadastrar consumidor da classe ServicoConsumidor com os dados recebidos
        return ServicoConsumidor.cadastrarConsumidor(nome,email,tipoPessoa);
    }
    //Cadastrar Fatura
    public static Fatura cadastrarFatura()throws Exception{
        String emailConsumidor = receberDados("Qual o e-mail cadastrado do consumidor?").nextLine();
        double valorDaFatura = receberDados("Qual o valor da fatura? R$ ").nextDouble();
        String dataVencimento = receberDados("Qual a data de vencimento? ").nextLine();

        return ServicoFatura.cadastrarFatura(emailConsumidor,valorDaFatura,dataVencimento);
    }
    //Pesquisar fatura por consumidor
    public static List<Fatura> pesquisarFaturaConsumidor() throws Exception{
        String email = receberDados("Qual o email do consumidor que deseja pesquisa?").nextLine();
        ServicoConsumidor.verificarEmailValido(email);
        List<Fatura> faturasConsumidor = ServicoFatura.pesquisarFaturaConsumidor(email);
        return faturasConsumidor;
    }

    public static boolean executar() throws Exception{
        boolean continuarMenu = true;
        while (continuarMenu){
            menu();
            int opção = receberDados("Digite a opção desejada: ").nextInt();

            if (opção == 1){
                Consumidor consumidor = cadastrarConsumidor();
                System.out.println(consumidor);
            }
            else if (opção == 2){
                Fatura fatura = cadastrarFatura();
                System.out.println(fatura);
            }
            else if (opção == 3){
                List<Fatura> listaFaturas = pesquisarFaturaConsumidor();
                System.out.println("Quantidade de faturas:" + listaFaturas.size());
                System.out.println(listaFaturas);
            }
            else if( opção == 4){
                continuarMenu = false;
                System.out.println("Volte sempre!");
            }
            else{
                System.out.println("Digite uma opção válida!");
            }
        }
        return continuarMenu;
    }
}
