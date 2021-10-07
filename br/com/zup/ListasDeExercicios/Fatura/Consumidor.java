package br.com.zup.ListasDeExercicios.Fatura;

public class Consumidor {
    private String nomeConsumidor;
    private String email;
    private TipoPessoa tipoPessoa;

    public Consumidor() {
    }

    public Consumidor(String nomeConsumidor, String email, TipoPessoa tipoPessoa) {
        this.nomeConsumidor = nomeConsumidor;
        this.email = email;
        this.tipoPessoa = tipoPessoa;
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

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    @Override
    public String toString() {
        StringBuilder exibirDados = new StringBuilder();
        exibirDados.append("\nNome: "+ nomeConsumidor);
        exibirDados.append("\nE-mail: "+email);
        return exibirDados.toString();
    }
}
