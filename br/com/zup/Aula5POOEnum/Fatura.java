package br.com.zup.Aula5POOEnum;

public class Fatura {
    private Consumidor consumidor;
    private double valor;
    private String dataDeVencimento;

    public Fatura() {
    }

    public Fatura(double valor, String dataDeVencimento) {
        this.valor = valor;
        this.dataDeVencimento = dataDeVencimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(String dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Consumidor:"+ consumidor);
        retorno.append("\nValor: R$ "+ valor);
        retorno.append("\nData de vencimento: "+ dataDeVencimento);
        return "Consumidor{}";
    }
}
