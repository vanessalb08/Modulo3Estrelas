package br.com.zup.DesafioModulo3;

public class Cliente extends Pessoa{
    private String dataNascimento;

    public Cliente() {

    }

    public Cliente(String nome, String cpf, String email, String dataNascimento) {
        super(nome, cpf, email);
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        StringBuilder retornaDados = new StringBuilder();
        retornaDados.append("\t"+super.toString());
        retornaDados.append("\n\tData de nascimento: "+ dataNascimento);
        return retornaDados.toString();
    }
}
