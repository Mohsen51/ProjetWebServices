package com.api.metiers.entites;

import java.io.Serializable;

public class Pays implements Serializable {
    private String nomPays;
    private String accesPays;

    public String getNomPays() {
        return nomPays;
    }

    public String getAccesPays() {
        return accesPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public void setAccesPays(String accesPays) {
        this.accesPays = accesPays;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nomPays='" + nomPays + '\'' +
                ", accesPays='" + accesPays + '\'' +
                '}';
    }

    public Pays(String nomPays, String accesPays) {
        this.nomPays = nomPays;
        this.accesPays = accesPays;
    }
}


