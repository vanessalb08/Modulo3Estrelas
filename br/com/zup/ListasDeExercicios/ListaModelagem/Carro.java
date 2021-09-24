package br.com.zup.ListasDeExercicios.ListaModelagem;

public class Carro {
    int portas;
    String modelo;
    String marca;
    double potencia = 2.0;

    public Carro(int portas, String modelo, String marca){
        this.portas = portas;
        this.modelo = modelo;
        this.marca = marca;
    }
}
