package br.com.zup.Listas.ListaComplementar1.Questao3;

public class Retangulo {
    double base;
    double altura;

    public Retangulo(){

    }
    public void mudarValorBase(double novoValor){
        base = novoValor;
    }
    public void mudarValorAltura(double novoValor){
        altura = novoValor;
    }
    public double areaRetangulo(){
        double area = altura * base;
        return area;
    }
    public double perimetroRetangulo(){
        double perimetro = 2*(base * altura);
        return perimetro;
    }
    public void menu(){
        System.out.println("Digite qo que deseja:");
        System.out.println("1 - Informar lados");
        System.out.println("2- Trocar dados");
        System.out.println("3 - Mostrar área e perímetro");
        System.out.println("4 - Sair");
    }
}
