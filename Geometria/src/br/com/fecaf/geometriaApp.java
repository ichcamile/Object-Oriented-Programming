package br.com.fecaf;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangle;

public class geometriaApp {
    public static void main(String[] args) {

        Retangulo retangulo1 = new Retangulo();
        retangulo1.nome = "Cami";
        retangulo1.lado_impar = 4.08;
        retangulo1.lado_par = 4.08;

        System.out.println("========== INFORMAÇÕES DO RETÂNGULO 1 ==========");
        retangulo1.exibirInfo();
        retangulo1.calcularArea();
        retangulo1.calcularPerimetro();
        retangulo1.validarRetangulo();
        System.out.println("=================================================\n");

        Retangulo retangulo2 = new Retangulo();
        retangulo2.nome = "Cam232";
        retangulo2.lado_impar = 4.100;
        retangulo2.lado_par = 9;

        System.out.println("========== INFORMAÇÕES DO RETÂNGULO 2 ==========");
        retangulo2.exibirInfo();
        retangulo2.calcularArea();
        retangulo2.calcularPerimetro();
        retangulo2.validarRetangulo();
        System.out.println("=================================================\n");

        Circulo circulo1 = new Circulo();
        circulo1.nome_circulo = "Circulo1";
        circulo1.raio = 10;

        System.out.println("============= INFORMAÇÕES DO CÍRCULO ============");
        circulo1.exibirInfo();
        circulo1.calculo_diametro();
        circulo1.calcular_area();
        circulo1.calcular_perimetro();
        System.out.println("=================================================\n");

        // Instaciando o objeto triangulo;

        Triangle triangulo1 = new Triangle();

        triangulo1.nome = "Triangle One";
        triangulo1.base = 12;
        triangulo1.cateto1 = 9;
        triangulo1.cateto2 = 15;
        triangulo1.altura = 8;

       boolean validarTriangulo = triangulo1.validarTriangulo();

       if (validarTriangulo){
           triangulo1.exibirInformacoes();
           triangulo1.calcularAreaTriangle();
           triangulo1.calcularPerimetroTriangle();
           triangulo1.validarTriangulo();
           triangulo1.definirTriangleRectangle();
       }





    }
}
