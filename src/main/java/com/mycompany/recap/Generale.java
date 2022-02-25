/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.recap;

/**
 *
 * @author khali
 */
public class Generale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = (int) 1.8; //entier naturel (int) => casting class= Integer
        final double pi=3.14; // constante (final)
        long xy=199999999; //initialisation directe
        float t=(float) (22.5/5);
        double t2= 22/4.5;
        int h;
        //pi=4.2; interdit pour les constante
        //double 2t; int x y=33; nom de variable interdit
        //
        float y; // faible précision 4 ch aprés la virgule class= Float
        double z; // forte précision 6+  class= Double
        y=x;
        //double xz=z; demande d'initialisation
      //  char c="h"; interdit => String ""
      char c='h'; //correcte
      
      String mot="bonjour";
      
      String chiffre="123";
      int convert=Integer.parseInt(chiffre); //conversion de chaine
      double convd=Double.parseDouble(chiffre); //Type.parseType(chaine);
      
      String valeur=String.valueOf(t2); // convertir tout les types en chaine

      System.out.println(valeur);
     h=3*5;
        
    }
    
}
