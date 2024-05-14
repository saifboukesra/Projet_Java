package com.example.application;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public Connection databaseConnection;

    public Connection getDatabaseConnection() {
        String databaseName="systeme_reservation_vol";
        String databaseUser="root";
        String databasePassword="71445508";
        String url="jdbc:mysql://localhost:3306/"+databaseName;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseConnection=DriverManager.getConnection(url,databaseUser,databasePassword);
            System.out.println("Connexion à la base de données établie avec succès.");

        } catch (Exception e){
            e.printStackTrace();
        }

        return databaseConnection;
    }
}
