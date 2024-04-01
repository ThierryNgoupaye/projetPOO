/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Repertoire{
    public ArrayList<Contacts> repertoire = new ArrayList<>();

    public Repertoire() {
    }

    public ArrayList<Contacts> getRepertoire() {
        return repertoire;
    }
    
    public void ajouterContact(Contacts contact){
        repertoire.add(contact);
        }
    public void supprimerContact(Contacts contact){
        repertoire.remove(contact);
    }
    public void modifierContact(Contacts contact){
        
    }
    public boolean rechercherContact(Contacts contact){
        return repertoire.contains(contact);
    }
 }
