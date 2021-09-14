package br.com.zup.ListaAquecimento;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String,Double> listaCandidatos = new HashMap<String,Double>();

        String numeroMatricula;
        String excluir;
        int opcao;
        double notaCandidato;
        boolean encerrar = true;

        while (encerrar == true){

            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Adicionar candidato");
            System.out.println("2 - Exibir lista de Candidatos");
            System.out.println("3 - Excluir candidato");
            System.out.println("4 - Sair");
            opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1){

                System.out.println("Digite o número de matrícula do candidato:");
                numeroMatricula = leitor.nextLine();
                System.out.println("Digite a nota do candidato:");
                notaCandidato = leitor.nextDouble();

                if (listaCandidatos.size() > 0){
                    for (String validacao : listaCandidatos.keySet()){
                        if (validacao.equals(numeroMatricula)){
                            System.out.println("Matrícula já cadastrada");
                        }
                        else{
                            listaCandidatos.put(numeroMatricula,notaCandidato);
                            System.out.println("Candidato cadastrado!");
                        }
                    }
                }
                else{
                    listaCandidatos.put(numeroMatricula,notaCandidato);
                    System.out.println("Candidato cadastrado!");
                }

            }
            else if(opcao == 2){
                System.out.println(listaCandidatos);
            }
            else if(opcao == 3){
                System.out.println("Digite a matricula do Candidato que deseja excluir:");
                System.out.println(listaCandidatos);
                excluir = leitor.nextLine();

                listaCandidatos.remove(excluir);
                System.out.println("Candidato "+excluir+ " excluído!");
            }
            else if (opcao == 4){
                encerrar = false;
                System.out.println("Até mais!");
            }
        }
    }
}
