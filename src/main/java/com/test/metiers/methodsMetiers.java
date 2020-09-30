package com.test.metiers;

import com.test.metiers.entites.*;

import java.util.HashMap;
import java.util.Map;

public class methodsMetiers {

    private Map<Integer, Pays> pays = new HashMap<Integer, Pays>();
    private Map<Integer, Voyageur> voyageurs = new HashMap<Integer, Voyageur>();

    public Voyageur addVoyageur(Voyageur v){
        voyageurs.put(v.getIdVoyageur(), v);
        return v;
    }

    public int deleteVoyageur(Integer idVoyageur){
        if(voyageurs.get(idVoyageur==null))
        {
            throw new RuntimeException("Le voyageur n'existe pas");
            return 0;
        }
        else
        {
            voyageurs.remove(idVoyageur);
            return 1;
        }
    }
}
