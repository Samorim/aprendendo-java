/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.finatec.apredendojava.task;

/**
 *
 * @author Aluno1
 */
public class Calculadora {
    public static void main(String[] args){
        Calculadora cal = new Calculadora();
        cal.somar(10,50);
    
    }
    
         
    public void somar(Integer x,Integer y){
        Integer total = x + y;
        System.out.println(total);
    }
}
