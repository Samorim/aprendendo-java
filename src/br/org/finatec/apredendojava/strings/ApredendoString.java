/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.finatec.apredendojava.strings;
public class ApredendoString {
    public static void main(String[] args) {
           String str = "  Precisamos de um plano de ataque ! Eu tenho um plano. Ataque.  ";

        System.out.println(str.length());
        System.out.println(str.contains("no de at"));
        System.out.println("indexOf ataque : " + str.indexOf("ataque"));
        System.out.println("indexOf plano : " + str.indexOf("plano", 20));
        System.out.println("replace plano estratégia : " + str.replace("plano", "estratégia"));

        System.out.println("trim : " + str.trim());

        System.out.println("toLowerCase : " + str.toLowerCase());
        System.out.println("toUpperCase : " + str.toUpperCase());

        System.out.println("startsWith Precisamos : " + str.trim().startsWith("Precisamos"));
        System.out.println("endsWith Ataque. : " + str.trim().endsWith("Ataque."));

        System.out.println("charAt 5 : " + str.charAt(10));

        System.out.println("substring 5 : " + str.substring(5));
        System.out.println("substring 5 20: " + str.substring(5, 20));

        System.out.println("isEmpty : " + str.isEmpty());
        System.out.println("concat : " + str.concat("Capitão America - Homem de Ferro"));

        String[] split = str.split("nnnnn");
        for (String s : split) {
            System.out.println(s);
        }

        int b = str.length();

        System.out.println(b);
                  
              }

    }  



