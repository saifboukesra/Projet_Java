package com.example.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javafx.scene.control.DatePicker;

public class CreerClientController {

    @FXML
    private TextField textFieldNom;
    @FXML
    private TextField textFieldEmail;
    @FXML
    private TextField textFieldTelephone;

    @FXML
    private void ajouterClient(ActionEvent event) {
        String nom = textFieldNom.getText();
        String email = textFieldEmail.getText();
        String telephone = textFieldTelephone.getText();

        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection connection = databaseConnection.getDatabaseConnection();

        try {
            String sql = "INSERT INTO CLIENT (nom, email, telephone) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nom);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, telephone);

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Nouveau client ajouté avec succès.");
            } else {
                System.out.println("Échec de l'ajout du nouveau client.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }






    @FXML
    private TextField textFieldCompagnieAerienne;

    @FXML
    private TextField textFieldAeroportDepart;

    @FXML
    private DatePicker datePickerAeroportArrivee;

    @FXML
    private DatePicker datePickerDateDepart;

    @FXML
    private Slider sliderNbSiegesDisponibles;

    @FXML
    private void creerVol(ActionEvent event) {
        String compagnieAerienne = textFieldCompagnieAerienne.getText();
        String aeroportDepart = textFieldAeroportDepart.getText();
        String aeroportArrivee = datePickerAeroportArrivee.getValue().toString(); // Obtenir la valeur directement
        String dateDepart = datePickerDateDepart.getValue().toString(); // Obtenir la valeur directement

        int nbSiegesDisponibles = (int) sliderNbSiegesDisponibles.getValue();

        if (compagnieAerienne.isEmpty() || aeroportDepart.isEmpty() || aeroportArrivee.isEmpty() || dateDepart.isEmpty()) {
            System.out.println("Veuillez remplir tous les champs obligatoires.");
            return;
        }

        DatabaseConnection databaseConnection = new DatabaseConnection();
        try (Connection connection = databaseConnection.getDatabaseConnection()) {
            String sql = "INSERT INTO VOL (compagnieAerienne, aeroportDepart, aeroportArrivee, dateDepart, nbSiegesDisponibles) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, compagnieAerienne);
            preparedStatement.setString(2, aeroportDepart);
            preparedStatement.setString(3, aeroportArrivee);
            preparedStatement.setString(4, dateDepart);
            preparedStatement.setInt(5, nbSiegesDisponibles);

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Nouveau vol ajouté avec succès.");
            } else {
                System.out.println("Échec de l'ajout du nouveau vol.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erreur lors de l'ajout du nouveau vol : " + e.getMessage());
        }
    }
}



