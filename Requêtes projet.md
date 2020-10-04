# Requêtes projet

## GET lois tous les pays :

**Type** : Get

**URL** : /api/pays

**Renvoi** : status(200) json : {
	"success" : 1,
	"data" : [{ 
		“ Country“ : “Allemagne” ,
		“Rule“ : “PCR/fermé/ouvert…”,
		“Voyageurs“ : [a,b,c]
},
{
“ Country“ : “Allemagne” ,
		“Rule“ : “PCR/fermé/ouvert…”,
		“Voyageurs“ : [a,b,c]
	}]}

## GET liste tous les voyageurs :

**Type** : Get

**URL** : /api/voyageurs

**Renvoi** : status(200) json : {
	"success" : 1,
	"data" : [{ 
		"idVoyageur" : 1,
 		"NomVoyageur" : "Jean" ,
		"PrenomVoyageur" : "Denis",
		"Pays de voyage" : {
			“ Country“ : “Allemagne” ,
			“Rule“ : “PCR/fermé/ouvert…”,
			“Voyageurs“ : [a,b,c]
			}
}, {voyageur 2}, ...
]
erreur: 
	"success" : 0,
	"message" : "Il n'y a aucun voyageur"

## GET lois d’un pays :

**Type** : Get

**URL** : /api/pays/:NomPays (Attention le webservice est case sensitive les pays doivent contenir la majuscule dans l'URL)

**Renvoi** : status(200) json : {
	"success" : 1,
	"data" : { 
		“ Country“ : “Allemagne” ,
		“Rule“ : “PCR/fermé/ouvert…”,
		“Voyageurs“ : [a,b,c]
	}
}
erreur: 
	"success" : 0,
	"message" : "Ce pays n'est pas frontalier"

## GET voyageur :

**Type** : Get

**URL** : /api/pays/:idVoyageur

**Renvoi** : status(200) json : {
	"success" : 1,
	"data" : { 
		"idVoyageur" : 1,
 		"NomVoyageur" : "Jean" ,
		"PrenomVoyageur" : "Denis",
		"Pays de voyage" : {
			“ Country“ : “Allemagne” ,
			“Rule“ : “PCR/fermé/ouvert…”,
			“Voyageurs“ : [a,b,c]
			}
		}
erreur: 
	"success" : 0,
	"message" : "Il n'y a pas de voyageur avec cet ID"

## Ajouter un voyageur :

**Type** : Post

**URL** : /api/voyageur/:NomPays

**Envoi** : 
Json : nom, prénom

**Renvoi** :
Succès : status(200) json : {
	"success" : 1,
	“message” : “Utilisateur bien ajouté”
}
Erreur : json : {
	"success" : 0,
	“message” : “Erreur d’ajout de l’utilisateur”
}

## Changer destination d'un voyageur :

**Type** : Put

**URL** : /api/voyageurs/:idVoyageur

**Envoi** : 
Json : nom du nouveau pays

**Renvoi** :
Succès : status(200) json : {
	"success" : 1,
	“message” : "Pays de destination bien modifié ”
}
Erreur : json : {
	"success" : 0,
	“message” : "Cet ID n'existe pas”
}

## Retirer voyageur :

**Type** : Delete

**URL** : /api/voyageurs/idVoyageur

**Renvoi** :
Succès : status(200) json : {
	"success" : 1,
	“message” : “Utilisateur bien enlevé de la base”
}
Erreur : json : {
	"success" : 0,
	“message” : “Erreur de suppression de l’utilisateur de la base”
}

