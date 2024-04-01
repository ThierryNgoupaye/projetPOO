/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;

/**
 *
 * @author USER
 */
public class Etudiant extends Contacts{
    private String cycle;
    private int niveau;

    public Etudiant( String code, String nom, String dateDeNaissance, String address, String email, String telNumber,String cycle, int niveau) {
        super(code, nom, dateDeNaissance, address, email, telNumber);
        this.cycle = cycle;
        this.niveau = niveau;
    }
    

    public String getCycle() {
        return cycle;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
    
    @Override
    public void insertContact(Connection connection){
        try {
            String sql = "INSERT INTO etudiant  VALUES (?, ?, ?, ?, ?, ?, ?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, this.code);
            statement.setString(2, this.nom);
            statement.setString(3, this.dateDeNaissance);
            statement.setString(4, this.address);
            statement.setString(5, this.email);
            statement.setString(6, this.telNumber);
            statement.setString(7, this.cycle);
             statement.setInt(8, this.niveau);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Les données de l'enseignant ont été insérées avec succès!");
            }
           
        } catch (SQLException e) {
            //System.out.println("Erreur lors de l'insertion des données de l'enseignant dans la base de données: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage() + "Erreur lors de l'insertion des données de l'enseignant dans la base de données: ");
        }try {
            connection.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"erreur lors de la fermeture de la connecion a la BD");
        }
    }
}
    
    
    
