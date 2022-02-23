/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author khali
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=-4;
        System.out.println(verifpositif(a));
        System.out.println(verifpaire(a));
        Demonstration d=new Demonstration(a);
            //approche orienté objet
        System.out.println(d.verifpaire());
        System.out.println(d.verifpositif());
        
    }
    
    //approche classique inspiré de la p. procedurale
   static boolean verifpositif(int a)
    {
    if(a>0)
        return true;
    else return false;
    
    }
 static boolean verifpaire(int a)
    {
    // solution 2
        return a % 2==0;
    /*
         if(a%2==0)
        return true;
    else return false;
        
        */
    }
}
