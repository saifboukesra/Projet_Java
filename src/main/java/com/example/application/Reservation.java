package com.example.application;

public class Reservation {
    private int id;
    private Client client;
    private Vol vol;
    private int nbSiegesReserves;
    private String statut;


    public Reservation(int id, Client client, Vol vol, int nbSiegesReserves, String statut) {
        this.id = id;
        this.client = client;
        this.vol = vol;
        this.nbSiegesReserves = nbSiegesReserves;
        this.statut = statut;
    }


    public int getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public Vol getVol() {
        return vol;
    }

    public int getNbSiegesReserves() {
        return nbSiegesReserves;
    }

    public String getStatut() {
        return statut;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }

    public void setNbSiegesReserves(int nbSiegesReserves) {
        this.nbSiegesReserves = nbSiegesReserves;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }


}

