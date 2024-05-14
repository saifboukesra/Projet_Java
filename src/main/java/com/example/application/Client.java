package com.example.application;

public class Client {
    private int id;
    private String nom;
    private String email;
    private String telephone;


    public Client(int id, String nom, String email, String telephone) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }


    public String getNom() {
        return nom;
    }


    public String getEmail() {
        return email;
    }


    public String getTelephone() {
        return telephone;
    }

}
