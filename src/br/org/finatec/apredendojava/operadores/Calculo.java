/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.finatec.apredendojava.operadores;

public class Calculo {
    public static void main(String[] args) {
        int x = 11;
        int y = 2;
        int total = x % y;

        double a = 1.89;
        double b = 2.66;
        double resultado = a + b;

        System.out.println("Total : " + total);
        System.out.println("Resultado : " + resultado);
        
        resultado  = x + y;
        System.out.println("Resultado : " + resultado);
        
    }

    void teste() {
        double a = 1.89;
        double b = 2.66;
        double resultado = a + b;
    }

}
