package br.com.zup.ListasDeExercicios.Imobiliaria;

import java.util.Scanner;

public class  Sistema {

    public static void menu(){
        System.out.println("Escolha a opção: ");
        System.out.println("1 - Cadastrar imóvel");
        System.out.println("2 - Exibir imóveis cadastrados");
        // System.out.println("3 - Cadastrar morador");
        System.out.println("3 - Sair");
    }

    private static Scanner capturaDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    public static Moradores cadastrarMoradores(){
        String nomeMorador = capturaDados("Digite o nome do morador:").nextLine();
        String cpfMorador = capturaDados("Digite o CPF do morador: ").nextLine();
        double rendaMorador = capturaDados("Digite a renda do morador: ").nextDouble();

        Moradores moradores = new Moradores(nomeMorador,cpfMorador,rendaMorador);

        return moradores;
    }
    public static Funcionario cadastrarFuncionario(){
        String nomeFuncionario = capturaDados("Digite o nome do funcionário:").nextLine();
        String cpf = capturaDados("Digite o CPF do funcionário: ").nextLine();
        String ctps = capturaDados("Digite a CTPS do funcionário: ").nextLine();

        Funcionario funcionario = new Funcionario(nomeFuncionario,cpf,ctps);
        return funcionario;
    }
    public static Imovel cadastrarImovel(){
        String endereco = capturaDados("Digite o endereço do imóvel: ").nextLine();
        double valorAluguel = capturaDados("Digite o valor do aluguel: R$").nextDouble();

        Imovel imovel = new Imovel(endereco,valorAluguel);

        return imovel;
    }
    public static void executar(){
        Imobiliaria imobiliaria = new Imobiliaria();
        boolean menu = true;
        while (menu){
            menu();
            int opcao = capturaDados("Digite a opção desejada: ").nextInt();
            if (opcao ==1){
                Imovel imovel = cadastrarImovel();
                Funcionario funcionario = cadastrarFuncionario();
                int qtdMoradores = capturaDados("Digite a quantidade de moradores: ").nextInt();
                for (int i = 0; i < qtdMoradores; i ++){
                    Moradores moradores = cadastrarMoradores();
                    imovel.adicionarMorador(moradores);
                }
                imobiliaria.adicionarImovel(imovel);
            }
            if (opcao ==2){
                System.out.println(imobiliaria);
            }
            if (opcao ==3){
                System.out.println("Até mais");
                menu = false;
            }
        }
    }
}
