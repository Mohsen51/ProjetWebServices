package com.test.metiers;

import com.test.metiers.entites.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class methodsMetiers {

    //Creation des collections de données map stockant tous les pays et voyageurs
    private Map<String, Pays> pays = new HashMap<String, Pays>();
    private Map<Integer, Voyageur> voyageurs = new HashMap<Integer, Voyageur>();

    //Obtenir les infos de tous les voyageurs (GET)
    public List<Pays> getAllPays() {
        return new ArrayList<Pays>(pays.values());
    }

    //Obtenir les infos de tous les pays (GET)
    public List<Voyageur> getAllVoyageurs() {
        return new ArrayList<Voyageur>(voyageurs.values());
    }

    //Obtenir les infos d'un pays particulier (GET)
    public Pays getPays(String nomPays) {
        if (pays.get(nomPays)!=null) {
            return pays.get(nomPays);
        }
        else
            throw new RuntimeException("Le Pays n'existe pas");
    }

    //Obtenir les infos d'un voyageur particulier (GET)
    public Voyageur getVoyageur(Integer idVoyageur) {
        if (voyageurs.get(idVoyageur)!=null) {
            return voyageurs.get(idVoyageur);
        }
        else
            throw new RuntimeException("Le voyageur n'existe pas");
    }

    //Méthode d'ajout de voyageur (On va l'utiliser pour le POST et le PUT)
    public Voyageur addVoyageur(Voyageur v, String nomPays){
        int id = voyageurs.size()+1;
        v.setIdVoyageur(id);
        Pays p = pays.get(nomPays);
        v.setPays(p);
        voyageurs.put(v.getIdVoyageur(), v);
        return v;
    }

    //Ajout d'un pays, utilisé exclusivement à l'initialisation du serveur
    public Pays addPays(Pays p){
        pays.put(p.getNomPays(), p);
        return p;
    }

    //Méthode qui utilise la methode de suppression de Map (utilisée pour PUT et DELETE)
    public int deleteVoyageur(Integer idVoyageur){
        if (voyageurs.get(idVoyageur)==null)
        {
            //Gestion de l'exception voyageur inexistant
            throw new RuntimeException("Le voyageur n'existe pas");
        }
        else
        {
            //methode de suppression d'une occurence dans map
            voyageurs.remove(idVoyageur);
            return 1;
        }
    }

    //Creation des objets pays et leurs règles
    public void creationPays() {
        addPays(new Pays("Allemagne","Test PCR à l'entrée"));
        addPays(new Pays ("France","Pas de restriction entre les regions françaises"));
        addPays(new Pays ("Espagne","Ouvert"));
        addPays(new Pays ("Italie","Ouvert"));
        addPays(new Pays ("Monaco","Ouvert"));
        addPays(new Pays ("Andorre","Ouvert"));
        addPays(new Pays ("Belgique","Ouvert"));
        addPays(new Pays ("Suisse","Test PCR à l'entrée"));
        addPays(new Pays ("RoyaumeUni","Isolement de 14jours à l'entrée"));
        addVoyageur(new Voyageur("Dupont" , "Jean"), "Allemagne");
    }
}
