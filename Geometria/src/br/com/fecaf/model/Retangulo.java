package br.com.fecaf.model;

public class Retangulo {
    public double lado_impar, lado_par, area, perimetro;
    public String nome;

    public void exibirInfo(){
        System.out.println("O nome é: " + nome);
        System.out.println("Os lados impar são: " + lado_impar);
        System.out.println("Os lados pares são: " + lado_par);
    }

    public void calcularArea() {
        area = (lado_impar * lado_impar);
        System.out.println("A área do retângulo é " + nome + " É: " + area);

    }

    public void calcularPerimetro(){
        perimetro = (lado_impar * 2) + (lado_par * 2);
        System.out.println("O perimetro do retângulo é: " + nome + " É: " + perimetro);
    }

    public void validarRetangulo(){
        if (lado_impar == lado_par) {
            System.out.println("É um quadrado");
        } else System.out.println("É um retangulo");
    }
}
