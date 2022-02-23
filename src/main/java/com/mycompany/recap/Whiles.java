/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.recap;

/**
 *
 * @author khali
 */
public class Whiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=7;
        while(i>0)
        {
            System.out.println("i= "+i);
            i--;
        
        }
       int x=1;
       int a;
        while (x<=10) {
        if (x == 7) {
        System.out.println("Division par zéro!");
        continue; // ignorer le calcule et continuer
        }
        a = 1/(x-7);
        System.out.println(a);
        x++;
        }
        
    }
    
}
