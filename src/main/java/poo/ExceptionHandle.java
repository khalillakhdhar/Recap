/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author khali
 */
public class ExceptionHandle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String chaine="12a";
     //   Integer.parseInt(chaine); risque d'erreur lors de l'exécution
     try
     {
     Integer.parseInt(chaine); //bloc en doute
     
     }
     catch(Exception ex)
      {
             System.out.println("la valeur doit être numérique");
             
             }
     
    }
    
}
