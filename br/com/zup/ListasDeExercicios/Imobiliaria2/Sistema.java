package br.com.zup.ListasDeExercicios.Imobiliaria2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Sistema {

    private static Scanner capturaDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("Bem vinde a Imobiliária Sua Casa!");
        System.out.println("O que deseja fazer?");
        System.out.println("\t1 - Cadastrar novo imóvel");
        System.out.println("\t2 - Exibir imóveis cadastrados");
        System.out.println("\t3 - Remover morador do imóvel");
        System.out.println("\t4 - Sair do programa");
    }

    //Verificar CPF
    private static boolean validarCpfExistente(Imobiliaria imobiliaria, Morador morador){
        // Percorrer minha lista de imóveis
        String pegarCpf = morador.getCpf();
        for (Imovel imovelIndice : imobiliaria.getImoveis()) {
            // Percorrer todas as listas dos moradores
            for (Morador indiceMorador : imovelIndice.getMoradoresImovel()) {
                if (indiceMorador.getCpf().equals(pegarCpf)) {
                    return true;
                }
            }
        }
        return false;
    }

    //Validar email repedito
    public static boolean validarEmailExistente(Imobiliaria imobiliaria, Morador morador) {
        String pegarEmail = morador.getEmailMorador();
        for (Imovel indiceImovel : imobiliaria.getImoveis()){
            for (Morador indiceMorador : indiceImovel.getMoradoresImovel()){
                if (indiceMorador.getEmailMorador().equals(pegarEmail)){
                    return true;
                }
            }
        }
        return false;
    }
    //Validar email sem @
    public static boolean validarEmailCompleto(Imobiliaria imobiliaria, Morador morador) {
        String pegarEmail = morador.getEmailMorador();
        if (pegarEmail.contains("@")){
            return true;
        }
        return false;
    }

    //Cadastrar 1 morador
    public static Morador cadastrarMorador() {

        String nomeMorador = capturaDados("Digite o nome do morador: ").nextLine();
        String cpfMorador = capturaDados("Digite o cpf do morador:").nextLine();
        double renda = capturaDados("Digite a renda mensal do morador: R$").nextDouble();
        String emailMorador = capturaDados("Digite o email do morador: ").nextLine();

        Morador morador = new Morador(nomeMorador,cpfMorador,renda,emailMorador);

        return morador;
    }
    //Remover morador pelo cpf
    public static String removerMoradorCpf(Imobiliaria imobiliaria){
        String cpf = capturaDados("Digite o CPF do morador a ser removido: ").nextLine();

        for (Imovel percorrerImoveis : imobiliaria.getImoveis()) {
            // Percorrer todas as listas dos moradores
            for (Morador percorrerMoradores : percorrerImoveis.getMoradoresImovel()) {
                if (percorrerMoradores.getCpf().equals(cpf)) {
                    percorrerImoveis.getMoradoresImovel().remove(percorrerMoradores);
                    return "Morador removido com sucesso";
                }
            }
        }
        return "Morador não cadastrado no sistema";
    }
    //Cadastrar vários moradores
    public static void cadastrarVariosMoradores(Imobiliaria imobiliaria, Imovel novoImovel){

        int qtdMoradores = capturaDados("Digite a quantidade de moradores: ").nextInt();
        int contadorDeMoradores = 0;

        while (contadorDeMoradores < qtdMoradores){
            Morador morador = cadastrarMorador();
            boolean cpfExistente = validarCpfExistente(imobiliaria, morador);
            boolean emailRepetido = validarEmailExistente(imobiliaria,morador);
            boolean emailCorreto = validarEmailCompleto(imobiliaria,morador);
          //  boolean condicao = true;

            if (!emailCorreto | cpfExistente | emailRepetido){

                if (!emailCorreto){
                    System.out.println("Email inválido!");
                }
                if (cpfExistente) {
                    System.out.println("CPF já cadastrado no sistema");
                }
                if (emailRepetido){
                    System.out.println("Email já cadastrado!");
                }
            }

            else{
                novoImovel.cadastrarMoradores(morador);
                contadorDeMoradores ++;
            }
        }
    }

    //Cadastrar Funcionario
    public static Funcionario cadastrarFuncionario() {
        String nomeFuncionario = capturaDados("Digite o nome do funcionário responsável: ").nextLine();
        String cpfFuncionario = capturaDados("Digite o CPF do funcionário responsável: ").nextLine();
        String codigoFuncionario = capturaDados("Digite o código do funcionário: ").nextLine();

        Funcionario novoFuncionario = new Funcionario(nomeFuncionario, cpfFuncionario, codigoFuncionario);
        return novoFuncionario;
    }

    //Cadastrar 1 imóvel
    public static Imovel cadastrarImovel() {
        String endereco = capturaDados("Digite o endereço do imóvel: ").nextLine();
        double valorAluguel = capturaDados("Qual o valor do aluguel? R$").nextDouble();

        Imovel novoImovel = new Imovel(cadastrarFuncionario(), endereco, valorAluguel);
        return novoImovel;
    }

    public static void executar() {
        Imobiliaria novaImobiliaria = new Imobiliaria();
        boolean menu = true;

        while (menu) {
            menu();
            int opcao = capturaDados("Digite a opção desejada: ").nextInt();

            if (opcao == 1) {
                boolean continuar = true;
                while (continuar) {
                    Imovel imovel = cadastrarImovel();
                    novaImobiliaria.adicionarImovel(imovel);
                    cadastrarVariosMoradores(novaImobiliaria,imovel);
                    String inserirMais = capturaDados("Deseja inserir outro imóvel? Sim/Não").nextLine().toUpperCase();
                    if (inserirMais.equals("SIM")) {
                        System.out.println("Insira o novo imóvel: ");
                    } else if (inserirMais.equals("NÃO") | inserirMais.equals("NAO")) {
                        continuar = false;
                    } else {
                        System.out.println("Opção inválida!");
                    }
                }

            }
            if (opcao == 2) {
                System.out.println(novaImobiliaria);
            }
            if (opcao == 3){
                String removerMorador = removerMoradorCpf(novaImobiliaria);
                System.out.println(removerMorador);
            }
            if (opcao == 4) {
                menu = false;
                System.out.println("Volte sempre!");
            }
        }
    }
/*
        System.out.println("\t1 - Cadastrar novo imóvel");
        System.out.println("\t2 - Exibir imóveis cadastrados");
        System.out.println("\t3 - Remover morador do imóvel");
        System.out.println("\t4 - Sair do programa");
 */
}
