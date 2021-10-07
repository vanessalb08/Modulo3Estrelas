package br.com.zup.ListasDeExercicios.Fatura;

public class Fatura {
    Consumidor consumidor;
    double valorASerPago;
    String dataVencimento;

    public Fatura() {

    }

    public Fatura(Consumidor consumidor, double valorASerPago, String dataVencimento) {
        this.consumidor = consumidor;
        this.valorASerPago = valorASerPago;
        this.dataVencimento = dataVencimento;
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    public double getValorASerPago() {
        return valorASerPago;
    }

    public void setValorASerPago(double valorASerPago) {
        this.valorASerPago = valorASerPago;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        StringBuilder exibirDados = new StringBuilder();
        exibirDados.append("\nConsumidor: "+consumidor);
        exibirDados.append("\nValor da Fatura: R$" + valorASerPago);
        exibirDados.append("\nData de vencimento: " + dataVencimento);
        return exibirDados.toString();
    }
}
