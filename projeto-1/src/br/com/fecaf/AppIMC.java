package br.com.fecaf;

import br.com.fecaf.model.imc;

public class AppIMC {
    public static void main(String[] args) {
        //System.out.println("Hello World!");

        //Instanciar o Objeto IMC

        imc objImc = new imc();

            objImc.peso = 84;
            objImc.altura = 1.85;

            objImc.calcular_imc();
            objImc.status_imc();
    }
}
