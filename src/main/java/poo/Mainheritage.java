/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author khali
 */
public class Mainheritage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       User u=new User("teste", 20);
        System.out.println(u.toString());
        Employee em=new Employee(3999, "t2", 40);
        System.out.println(em.getNom());
        
        
    }
    
}
