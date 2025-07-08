package br.com.fecaf.model;

public class Circulo {
    public String nome_circulo;
    public double raio, diametro, area, perimetro;

    public void exibirInfo(){
        System.out.println("O nome do circulo é: " + nome_circulo);
        System.out.println("O raio do objeto é: " + raio);
    }

    public void calculo_diametro(){
        diametro = 2 * raio;
        System.out.println("O raio do objeto é: " + diametro);
    }

    public void calcular_area(){
        area = Math.PI * Math.pow(raio, 2);
        System.out.println("O valor da área do objeto é: " + area);
    }

    public void calcular_perimetro(){
        perimetro =  2 * Math.PI * raio;
        System.out.println("O valor do perimetro do objeto é: " + perimetro);
    }

}
