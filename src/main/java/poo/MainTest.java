/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author khali
 */
public class MainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vide v=new Vide(6);
        Vide v2=new Vide(0, "xx", 'c');
        //System.out.println(v.calculedirecte());
        v.calculedirecte(); // fonction avec return a besoin d'expression
        v.puissance(); //void qui exécute un algo (appel externe via instance)
    }
    
}
