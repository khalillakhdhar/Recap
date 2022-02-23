/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author khali
 */
public class User {
   private String nom;
  private  int age=18; // valeur initialisé par defaut

    public User(String nom, int age) {
        this.nom = nom;
        if(age>=18) // condition
        this.age = age;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" + "nom=" + nom + ", age=" + age + '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    
    
}
