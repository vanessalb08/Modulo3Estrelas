package br.com.zup.ListasDeExercicios.Fatura;

public class Consumidor {
    private String nomeConsumidor;
    private String email;

    public Consumidor() {
    }

    public Consumidor(String nome, String email) {
        this.nomeConsumidor = nome;
        this.email = email;
    }

    public String getNomeConsumidor() {
        return nomeConsumidor;
    }

    public void setNomeConsumidor(String nomeConsumidor) {
        this.nomeConsumidor = nomeConsumidor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder exibirDados = new StringBuilder();
        exibirDados.append("\nNome: "+ nomeConsumidor);
        exibirDados.append("\nE-mail: "+email);
        return exibirDados.toString();
    }
}
