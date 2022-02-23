/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.recap;

/**
 *
 * @author khali
 */
public class Repetition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int k;
        // TODO code application logic here
        //String chaine ="hello world";
        System.out.println("incrementation");
        for (int i=1; i<6; i++) { // for (initialisation ; condition; pas)
            
                System.out.println(i);
            }
        System.out.println("décrementation");
      for (int j=6; j>1; j--) { //declaration interne)
System.out.println(j);
}  
        System.out.println("pas= 2");
        for (k=1; k<6; k+=2) { // declaration externe
System.out.println(k);
}
        
        
        
      
    }
    
}
