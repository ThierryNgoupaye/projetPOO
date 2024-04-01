/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;
import java.sql.Connection;


/**
 *
 * @author USER
 */
public abstract class Contacts{
    protected String code;
    protected String nom;
    protected String dateDeNaissance;
    protected String address;
    protected String email;
    protected String telNumber;

    public Contacts(String code, String nom, String dateDeNaissance, String address, String email, String telNumber) {
        this.code = code;
        this.nom = nom;
        this.dateDeNaissance = dateDeNaissance;
        this.address = address;
        this.email = email;
        this.telNumber = telNumber;
    }
    
    public abstract void insertContact(Connection connection);
    
    public String getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }
    
    
}






    
    
    
    


