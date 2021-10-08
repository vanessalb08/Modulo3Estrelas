package br.com.zup.DesafioModulo3;

import java.util.Scanner;

public class Sistema {

    private static Scanner receberDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    public static void menu(){
        System.out.println("==========Registro de Vendas==========");
        System.out.println("[1] - Cadastrar cliente");
        System.out.println("[2] - Cadastrar vendedor");
        System.out.println("[3] - Cadastrar nova venda");
        System.out.println("[4] - Mostrar todas as vendas");
        System.out.println("[5] - Mostrar todos os vendedores");
        System.out.println("[6] - Mostrar todos os clientes");
        System.out.println("[7] - Sair do programa");
    }
    //Cadastrar cliente
    public static Cliente cadastrarCliente() throws Exception{
        String nomeCliente = receberDados("Digite o nome do cliente: ").nextLine();
        String cpfCliente = receberDados("Digite o CPF do cliente: ").nextLine();
        ServicoCliente.verificarCpfRepetidoCliente(cpfCliente);
        String emailCliente = receberDados("Digite o e-mail do cliente: ").nextLine();
        ServicoCliente.verificarEmailValidoCliente(emailCliente);
        String dataNascimento = receberDados("Digite a data de nascimento do cliente: ").nextLine();

        Cliente cliente = ServicoCliente.cadastrarCliente(nomeCliente, cpfCliente, emailCliente, dataNascimento);
        return cliente;
    }
    //Cadastrar Vendedor
    public static Vendedor cadastrarVendedor()throws Exception {
        String nomeVendedor = receberDados("Digite o nome do vendedor responsável: ").nextLine();
        String cpfVendedor = receberDados("Digite o CPF do vendedor responsável: ").nextLine();
        ServicoVendedor.verificarCpfRepetidoVendedor(cpfVendedor);
        String emailVendedor = receberDados("Digite o e-mail do vendedor responsável: ").nextLine();
        ServicoVendedor.verificarEmailValidoVendedor(emailVendedor);
        String ctps = receberDados("Digite a ctps do vendedor resposável: ").nextLine();

        Vendedor vendedor = ServicoVendedor.cadastrarVendedores(nomeVendedor, cpfVendedor, emailVendedor, ctps);
        return vendedor;
    }

    //Cadastrar venda
    public static Venda cadastrarVenda() throws Exception{
        String cpfCliente = receberDados("Digite o CPF do cliente: ").nextLine();
        String cpfVendedor = receberDados("Digite o CPF do vendedor: ").nextLine();
        double valorPago = receberDados("Qual o valor a ser pago: R$ ").nextDouble();
        String dataRegistro = receberDados("Digite a data que a venda foi registrada: ").nextLine();

        Venda novaVenda = ServicoVenda.cadastrarVenda(cpfCliente,cpfVendedor,valorPago,dataRegistro);
        return novaVenda;
    }
    //Exibir Vendas Cadastradas
    public static void exibirVendas(){
        ServicoVenda.exibirVendas();
    }
    //Exibir vendedores cadastrados
    public static void exibirVendedoresCadastrados(){
        ServicoVendedor.exibirVendedoresCadastrados();
    }
    //Exibir clientes cadastrados
    public static void exibirClientesCadastrados(){
        ServicoCliente.exibirClientesCadastrados();
    }
    public static boolean executar () throws Exception{
        boolean continuarMenu = true;

        while (continuarMenu){
            menu();
            int opcaoDoUsuario = receberDados("Digite a opção desejada: ").nextInt();
            //Cadastrar cliente
            if (opcaoDoUsuario == 1){
                Cliente novoCliente = cadastrarCliente();
                System.out.println(novoCliente);
            }//Cadastrar Vendedor
            else if (opcaoDoUsuario == 2){
                Vendedor novoVendedor = cadastrarVendedor();
                System.out.println(novoVendedor);
            }//Cadastrar Venda
            else if (opcaoDoUsuario == 3){
                Venda novaVenda = cadastrarVenda();
                System.out.println(novaVenda);
            }//Exibir todas as vendas
            else if (opcaoDoUsuario == 4){
                exibirVendas();
            }
            //Exibir todos os vendedores
            else if (opcaoDoUsuario == 5){
                exibirVendedoresCadastrados();
            }
            //Exibir todos os clientes
            else if (opcaoDoUsuario == 6){
                exibirClientesCadastrados();
            }
            //Sair do programa
            else if (opcaoDoUsuario == 7){
                continuarMenu = false;
                System.out.println("Obrigada por usar nossos serviços. Até Mais!");
            }
            else{
                System.out.println("Opção inválida! Por favor digite novamente!");
            }
        }

        return continuarMenu;
    }
}