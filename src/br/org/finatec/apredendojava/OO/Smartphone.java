/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.finatec.apredendojava.OO;

/**
 *
 * @author Aluno1
 */
public class Smartphone {
    /*atributos
    */
    String cor; 
    Integer ram;
    Double tamanhoDisplay;
    String modelo;
    
    public static void main (String[]args){
        Smartphone s9 = new Smartphone();
        s9.cor= "preto";
        s9.ram= 4;
        s9.tamanhoDisplay= 5.8;
        s9.modelo =" Galaxy S9";
        
        Smartphone j6 = new Smartphone();
        j6.cor= "violeta";
        j6.ram= 2;
        j6.tamanhoDisplay= 5.0;
        j6.modelo =" Galaxy J6";
        
        Smartphone[] phones = new Smartphone[10];
        phones[0]=j6;
        phones[1]=s9;
    
        
        
        System.out.println("Smartphone...");
    }
}
