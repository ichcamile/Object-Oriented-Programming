package br.com.fecaf.model;

import java.util.Arrays;

public class Triangle {
    public double base, cateto1, cateto2, altura, area, perimetro;

    public String nome;

    public void exibirInformacoes(){
        System.out.println("O nome do objeto é: " + nome);
        System.out.println("A base é: " + base);
        System.out.println("o cateto1 é: " + cateto1);
        System.out.println("o cateto2 é: " + cateto2);
        System.out.println("A altura é: " + altura);
    }


    public Boolean validarTriangulo(){
        if (cateto1 + cateto2 >= base && cateto2 + base >= cateto1 && cateto1 + base >= cateto2){
            System.out.println("É um triangulo");
            return true;
        } else{
            System.out.println("não é um triangulo");
            return false;
        }
    }

    public void calcularAreaTriangle(){
        area = (base * altura) / 2;
        System.out.println("A área do objeto é " + area);
    }

    public void calcularPerimetroTriangle(){
        perimetro = base + cateto1 + cateto2;

        System.out.println("O perimetro do Triangulo é " + perimetro);
    }

    public void definirTriangle(){
        if (base == cateto1 && base == cateto2 && cateto2 == cateto1){
            System.out.println("Esse Triangulo é um Equilátero");
        } else if (base == cateto1 || base == cateto2 || cateto1 == cateto2){
            System.out.println("Esse Triangulo é um Isóceles");
        } else{
            System.out.println("Esse Triangulo é um Escalêno");
        }
    }

    public void definirTriangleRectangle(){
        double [] ladosTriangle = {base , cateto1 , cateto2};

        Arrays.sort(ladosTriangle);

        double catet1 = ladosTriangle[0];
        double catet2 = ladosTriangle[1];
        double hipotenusa = ladosTriangle[2];

        if (Math.pow(catet1, 2) + Math.pow(catet2, 2) == Math.pow(hipotenusa, 2)) {
            System.out.println("É um triângulo retângulo");
        } else {
            System.out.println("Não é um triângulo retângulo");
        }




    }






}
