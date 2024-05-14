package com.example.application;

import java.util.Date;

public class Critere {
    private Date dateDepart;
    private String aeroportDepart;
    private String aeroportArrivee;


    public Critere(Date dateDepart, String aeroportDepart, String aeroportArrivee) {
        this.dateDepart = dateDepart;
        this.aeroportDepart = aeroportDepart;
        this.aeroportArrivee = aeroportArrivee;
    }


    public Date getDateDepart() {
        return dateDepart;
    }

    public String getAeroportDepart() {
        return aeroportDepart;
    }

    public String getAeroportArrivee() {
        return aeroportArrivee;
    }
}
