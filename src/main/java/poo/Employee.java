/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author khali
 */
public class Employee extends User {
    private double salaire;

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    
    
    
    
    public Employee(double salaire, String nom, int age) {
        super(nom, age);
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Employee{" + "salaire=" + salaire + '}'+super.toString();
    }
    
    
    
    
    
}
