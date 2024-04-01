/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author USER
 */
public class Enseignant extends Contacts{
    private String statut;

    public Enseignant (String code, String nom, String dateDeNaissance, String address, String email, String telNumber,String statut) {
        super(code, nom, dateDeNaissance, address, email, telNumber);
        this.statut = statut;
    }
    
    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
    @Override
    public void insertContact(Connection connection){
  
        try {
            String sql = "INSERT INTO enseignant VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, this.code);
            statement.setString(2, this.nom);
            statement.setString(3, this.dateDeNaissance);
            statement.setString(4, this.address);
            statement.setString(5, this.email);
            statement.setString(6, this.telNumber);
            statement.setString(7, this.statut);

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