package br.com.zup.Aula5POOEnum;

import java.util.List;
import java.util.Scanner;

public class Sistema {

    //Linha de frente com o usuário
    //Responsável apenas pela interação do programa com o usuário (entrada e saída de dados)

    private static Scanner capturarDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    public static void menu(){
        System.out.println("[1] - Cadastrar Consumidor");
        System.out.println("[2] - Cadastrar fatura");
        System.out.println("[3] - Consultar faturas do consumidor");
        System.out.println("[4] - Sair");
    }

    //Vai capturar os dados do usuário e jogar nos parâmetros o cadastrar consumidor
    //Mesmo nome porque tem funcionalidades diferentes mas se complementam
    public static Consumidor cadastrarCoonsumidor() throws Exception{
        String nome = capturarDados("Digite o nome do consumidor: ").nextLine();
        String email = capturarDados("Digite o email do consumidor").nextLine();

        return ServicoConsumidor.cadastrarConsumidor(nome,email);
    }
    public static Fatura cadastrarFatura() throws Exception{
        String email = capturarDados("Digite o email do consumidor: ").nextLine();
        double valorFatura = capturarDados("Digite o valor da fatura: R$").nextDouble();
        String dataVencimento = capturarDados("Qual a data de vencimento: ").nextLine();

        return ServicoFatura.cadastrarFatura(email,valorFatura,dataVencimento);
    }

    public static List<Fatura> pesquisarFatura() throws Exception{
        String email = capturarDados("Digite o email do consumidor").nextLine();
        ServicoConsumidor.validarEmail(email);
        //Receber Lista do serviço fatura e retorná-la
        List<Fatura> faturasDoUsuario = ServicoFatura.pesquisarFaturaPeloEmail(email);
        return faturasDoUsuario;
    }

    //Criar menu

    public static boolean executar() throws Exception{
        boolean continuar = true;
        while(continuar){
            menu();
            int opcaoDoUsuario = capturarDados("Digite a opção desejada: ").nextInt();
            //Cadastrar consumidor
            if (opcaoDoUsuario == 1){
                //Cria uma variável consumidor apenas para poder mostrar o consumidor cadastrado
                //só para receber o que o método cria e mostrar ao usuário, mas não cria um novo
                //Poderia chamar direto no sout, mas não é recomendado para deixar o código limpo
                Consumidor consumidor = cadastrarCoonsumidor();
                System.out.println(consumidor);
            }
            //Cadastrar Fatura
            else if (opcaoDoUsuario == 2){
                Fatura fatura = cadastrarFatura();
                System.out.println(fatura);
            }
            //Consultar faturas de um consumidor
            else if (opcaoDoUsuario == 3){
                List<Fatura> faturas = pesquisarFatura();
                System.out.println(faturas);
            }
            else if (opcaoDoUsuario == 4){
                continuar =  false;
                System.out.println("Obrigada e volte sempre!");
            }
            else{
                System.out.println("Opção inválida");
            }
        }
        //Sempre vai retornar verdade até que o usuário decida que quer sair e digite opção 4
        return continuar;
    }
}
