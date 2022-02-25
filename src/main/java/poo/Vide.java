/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author khali
 */
public class Vide {
    public int x; 
    private String y;
    protected char z;
    // (accés) type nom;
    // il est préferable de garder un accés privé au attribut

    public Vide(int x) {
        this.x = x;
    }

    public Vide() {
    }

    public Vide(int x, String y, char z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    
    
    
    public void calculedouble(int df) // pas de sens à l'appel de x
    {
    
    
    }
    
    public void puissance() // methode sans retour (exécution directe)
    {
        System.out.println(x*x);
        
    
    }
    public int calculedirecte() // fonction qui retourne un entier (besoin de réexploitation)
    {
        this.calculedouble(x); //appel interne (this)
    return x+3;
    
    }
    
    
}
