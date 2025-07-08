package br.com.fecaf.model;

public class imc {
    //Criação de Atributos

    public int peso;

    public double altura; //double tem mais casas decimais em relação ao float

    public double imc;

    //Criação do Primeiro Metodo

    public void calcular_imc (){
        imc = peso / (altura * altura);
        System.out.println("O imc é:" + imc);
    }

    public void status_imc(){
        if (imc < 18.5){
            System.out.printf("O Status é baixo peso...");
        } else if (imc >= 18.5 && imc < 24){
            System.out.printf("O Status é normal");
        } else if (imc >=25 && imc <= 29.99) {
            System.out.println("O Status é sobrepeso");
        } else{
            System.out.println("O Status é obesidade");
        }
    }

}
