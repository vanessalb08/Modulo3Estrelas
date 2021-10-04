package br.com.zup.ListasDeExercicios.Imobiliaria2;

import java.util.ArrayList;
import java.util.List;

public class Imovel {
    private Funcionario funcionarioResponsavel;
    private String endereco;
    private double valorAluguel;
    private List<Morador> moradoresImovel = new ArrayList<>();

    //Construtores
    public Imovel() {

    }

    public Imovel(Funcionario funcionarioResponsavel, String endereco, double valorAluguel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
    }

    public Imovel(Funcionario funcionarioResponsavel, String endereco, double valorAluguel, List<Morador> moradoresImovel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
        this.moradoresImovel = moradoresImovel;
    }
    //Getters e Setters

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Funcionario getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(Funcionario funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public List<Morador> getMoradoresImovel() {
        return moradoresImovel;
    }

    //Métodos
    public void cadastrarMoradores(Morador novoMorador){
        moradoresImovel.add(novoMorador);
    }
    public Morador excluirMoradorCPF(String cpfMorador){
        Morador moradorExcluido = null;
        for (Morador refencia: moradoresImovel){
            if (refencia.getCpf().equals(cpfMorador)) {
                moradorExcluido = refencia;
            }
        }
        if (moradorExcluido != null){
            moradoresImovel.remove(moradorExcluido);
        }
        else{
            System.out.println("Não existe morador cadastrado com esse CPF");
        }
        return moradorExcluido;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nFuncionário responsável: "+ funcionarioResponsavel);
        retorno.append("\nEndereço: " + endereco);
        retorno.append("\nValor do aluguel: R$ "+valorAluguel);
        retorno.append("\nMoradores no imóvel: "+ moradoresImovel.size());
        retorno.append("\nMoradores: "+moradoresImovel);
        return retorno.toString();
    }
}
