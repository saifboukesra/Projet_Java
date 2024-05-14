package com.example.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreerVolController {

    @FXML
    private Label labelCreerVol;
    @FXML
    private TextField textFieldCompagnieAerienne;
    @FXML
    private TextField textFieldAeroportDepart;
    @FXML
    private TextField textFieldAeroportArrivee;
    @FXML
    private TextField textFieldDateDepart;
    @FXML
    private Slider sliderNbSiegesDisponibles;

    @FXML
    private void creerVol(ActionEvent event) {
        String compagnieAerienne = textFieldCompagnieAerienne.getText();
        String aeroportDepart = textFieldAeroportDepart.getText();
        String aeroportArrivee = textFieldAeroportArrivee.getText();
        String dateDepart = textFieldDateDepart.getText();
        int nbSiegesDisponibles = (int) sliderNbSiegesDisponibles.getValue();

        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection connection = databaseConnection.getDatabaseConnection();

        try {
            String sql = "INSERT INTO VOL (compagnie_aerienne, aeroport_depart, aeroport_arrivee, date_depart, nb_sieges_disponibles) VALUES (?, ?, ?, ?, ?)";
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
        }
    }
}
