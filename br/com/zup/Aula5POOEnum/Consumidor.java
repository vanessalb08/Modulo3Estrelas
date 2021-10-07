package br.com.zup.Aula5POOEnum;
//Função APENAS de ser molde para os objetos dessa classe
public class Consumidor {
    private String nomeConsumidor;
    private String email;

    public Consumidor() {
    }

    public Consumidor(String nomeConsumidor, String email) {
        this.nomeConsumidor = nomeConsumidor;
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
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome: "+ nomeConsumidor);
        retorno.append("\nE-mail: "+ email);
        return "Consumidor{}";
    }
}
