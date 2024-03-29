package br.com.zup.DesafioModulo3;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String email;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder retornaDados = new StringBuilder();
        retornaDados.append("\nNome: "+ nome);
        retornaDados.append("\nCPF: "+ cpf);
        retornaDados.append("\nE-mail: "+email);
        return retornaDados.toString();
    }
}
