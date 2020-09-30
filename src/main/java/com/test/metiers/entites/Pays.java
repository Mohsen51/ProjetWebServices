package com.test.metiers.entites;

import java.io.Serializable;

public class Pays implements Serializable {
    private int idPays;
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

    public int getIdPays() {
        return idPays;
    }

    public void setIdPays(int idPays) {
        this.idPays = idPays;
    }

    public Pays(int idPays, String nomPays, String accesPays) {
        this.idPays = idPays;
        this.nomPays = nomPays;
        this.accesPays = accesPays;
    }
}


