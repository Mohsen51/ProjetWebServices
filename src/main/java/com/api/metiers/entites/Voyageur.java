package com.api.metiers.entites;

import java.io.Serializable;

public class Voyageur implements Serializable {
    private int idVoyageur;
    private String nomVoyageur;
    private String prenomVoyageur;
    private Pays pays;

    public Voyageur() {
    }

    public Voyageur(String nomVoyageur, String prenomVoyageur) {
        this.nomVoyageur = nomVoyageur;
        this.prenomVoyageur = prenomVoyageur;
    }

    public Voyageur(int idVoyageur, String nomVoyageur, String prenomVoyageur, Pays pays) {
        this.idVoyageur = idVoyageur;
        this.nomVoyageur = nomVoyageur;
        this.prenomVoyageur = prenomVoyageur;
        this.pays = pays;
    }

    public String getNomVoyageur() {
        return nomVoyageur;
    }

    public void setNomVoyageur(String nomVoyageur) {
        this.nomVoyageur = nomVoyageur;
    }

    public int getIdVoyageur() {
        return idVoyageur;
    }

    public void setIdVoyageur(int idVoyageur) {
        this.idVoyageur = idVoyageur;
    }

    public String getPrenomVoyageur() {
        return prenomVoyageur;
    }

    public void setPrenomVoyageur(String prenomVoyageur) {
        this.prenomVoyageur = prenomVoyageur;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }
}
