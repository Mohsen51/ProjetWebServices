package com.test.resources;

import com.test.metiers.*;
import com.test.metiers.entites.Pays;
import com.test.metiers.entites.Voyageur;

import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

//Singleton est utilisé pour n'appeler qu'une seule fois la méthode de création des pays seulement au lancement du serveur
@Singleton
@Path("/")
public class Resource {

    private methodsMetiers metier;

    public Resource() {
        metier = new methodsMetiers();
        metier.creationPays();
    }

    @GET
    @Path("pays")
    //Produce sert à indiquer dans quel format de données va être retourner l'info (ici JSON)
    @Produces({MediaType.APPLICATION_JSON})
    public List<Pays> getAllPays() {
        return metier.getAllPays();
    }

    @GET
    @Path("voyageurs")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Voyageur> getAllVoyageurs() {
        return metier.getAllVoyageurs();
    }

    @GET
    @Path("pays/{idPays}")
    @Produces({MediaType.APPLICATION_JSON})
    public Pays getPays(@PathParam("idPays") String nomPays) {
        return metier.getPays(nomPays);
    }

    @GET
    @Path("voyageurs/{idUser}")
    @Produces({MediaType.APPLICATION_JSON})
    public Voyageur getPays(@PathParam("idUser") Integer idVoyageur) {
        return metier.getVoyageur(idVoyageur);
    }


    @POST
    @Path("voyageur/{idPays}")
    //Consumes permet d'indiquer dans quel format de données va être recu l'info (ici JSON)
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Voyageur createVoyageur(Voyageur v, @PathParam("idPays") String nomPays) {
        return metier.addVoyageur(v, nomPays);
    }

    //Supprime un utilisateur
    @DELETE
    @Path("voyageurs/{idVoyageur}")
    @Produces({MediaType.APPLICATION_JSON})
    public int deleteVoyageur(@PathParam("idVoyageur") Integer idVoyageur) {
        return metier.deleteVoyageur(idVoyageur);
    }

    //Update le pays de destination d'un voyageur
    @PUT
    @Path("voyageurs/{idUser}")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Voyageur changeVoyageur(Pays p, @PathParam("idUser") Integer idVoyageur) {
        Voyageur v = metier.getVoyageur(idVoyageur);
        metier.deleteVoyageur(idVoyageur);
        return metier.addVoyageur(v, p.getNomPays());
    }
}
