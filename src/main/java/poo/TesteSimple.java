/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author khali
 */
public class TesteSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleClassconstruction spc=new SimpleClassconstruction();
        spc.setA(12);
        spc.setB(14);
        spc.setC(20);
        spc.setTitre("testing");
        
        System.out.println(spc.toString());
    }
    
}
