/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author USER
 */
public class Agent extends Contacts{
    
    private double salaire;
    private String statut;
    private int indeDeSalaire;
    private String occupation;
    private int categorie;
    
    public Agent(String code, String nom, String dateDeNaissance, String address, String email, String telNumber,double salaire, String statut,int Categorie, int indeDeSalaire, String occupation ) {
        super(code, nom, dateDeNaissance, address, email, telNumber);
        this.salaire = salaire;
        this.statut = statut;
        this.indeDeSalaire = indeDeSalaire;
        this.occupation = occupation;
        this.categorie = categorie;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    public void setCategorie(int categorie){
        this.categorie = categorie;
    }
    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public int getIndeDeSalaire() {
        return indeDeSalaire;
    }

    public void setIndeDeSalaire(int indeDeSalaire) {
        this.indeDeSalaire = indeDeSalaire;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public int getCategorie(){
        return this.categorie;
    }
    
   
    @Override
    public void insertContact(Connection connection){
            try (connection) {
                // Préparez la requête SQL pour l'insertion
                String sql = "INSERT INTO agent VALUES (?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, code);
                statement.setString(2,nom );
                statement.setString(3,  dateDeNaissance);
                statement.setString(4, address);
                statement.setString(5, email);
                statement.setString(6, telNumber);
                statement.setDouble(7, salaire);
                statement.setString(8, statut);
                statement.setInt(9, categorie);
                statement.setInt(10, indeDeSalaire);
                statement.setString(11, occupation);
                
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


