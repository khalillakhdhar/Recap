/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author khali
 */
public class Demonstration {
    int a;

    public Demonstration(int a) {
        this.a = a;
    }
    
      boolean verifpositif()
    {
    if(a>0)
        return true;
    else return false;
    
    }
  boolean verifpaire()
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
