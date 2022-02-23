/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.recap;

/**
 *
 * @author khali
 */
public class Conditionelle {

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=10; //instruction simple
        
        {
        int y=20;
        y*=2;
        System.out.println("y="+y);  
        } //bloc {}
        if(x>0) // si () condition =vrai => traitement
            System.out.println(x+" est positif"); // instruction seul => pas besoin de bloc {}
        if(x>3) // si () condition =vrai => traitement
        {
          System.out.println(x+" est positif"); 
          x=x-3;
        } // bloc d'instructions => on a  besoin de bloc {}
        else 
        {
        // bloc ou instruction du traitement inverse (x<3)
        }
        int jour=3;
        switch (jour) {
            case 1:
                System.out.println("lundi");
                break; // terminer la boucle et en sortir
            case 2:
                System.out.println("mardi"); 
             break;
            case 3:
                System.err.println("mercredi");
               break;
             

        }
        
        
        
        
    }
    
}
