package com.example.application;


import java.util.Date;

public class Vol {
    private int id;
    private String compagnieAerienne;
    private String aeroportDepart;
    private String aeroportArrivee;
    private Date dateDepart;
    private int nbSiegesDisponibles;

    // Constructeur
    public Vol(int id, String compagnieAerienne, String aeroportDepart, String aeroportArrivee,
               Date dateDepart, int nbSiegesDisponibles) {
        this.id = id;
        this.compagnieAerienne = compagnieAerienne;
        this.aeroportDepart = aeroportDepart;
        this.aeroportArrivee = aeroportArrivee;
        this.dateDepart = dateDepart;
        this.nbSiegesDisponibles = nbSiegesDisponibles;
    }


    public int getId() {
        return id;
    }


    public String getCompagnieAerienne() {
        return compagnieAerienne;
    }


    public String getAeroportDepart() {
        return aeroportDepart;
    }

    public String getAeroportArrivee() {
        return aeroportArrivee;
    }


    public Date getDateDepart() {
        return dateDepart;
    }


    public int getNbSiegesDisponibles() {
        return nbSiegesDisponibles;
    }


    public void reserverSieges(int nbSieges) {
        if (nbSieges <= nbSiegesDisponibles) {
            nbSiegesDisponibles -= nbSieges;
            System.out.println(nbSieges + " sièges réservés avec succès.");
        } else {
            System.out.println("Désolé, il n'y a pas suffisamment de sièges disponibles.");
        }
    }


    public void annulerReservationSieges(int nbSieges) {
        nbSiegesDisponibles += nbSieges;
        System.out.println(nbSieges + " sièges annulés avec succès.");
    }
}

