# Requêtes projet

## GET lois tous les pays :

**Type** : Get

**URL** : /api/pays

**Renvoi** : status(200) json : {
	success : 1,
	data : [{ 
		“ Country“ : “Allemagne” ,
		“Rule“ : “PCR/fermé/ouvert…”,
		“Voyageurs“ : [a,b,c]
},
{
“ Country“ : “Allemagne” ,
		“Rule“ : “PCR/fermé/ouvert…”,
		“Voyageurs“ : [a,b,c]
	}]}

## GET lois d’un pays :

**Type** : Get
**URL** : /api/pays/:NomPays
**Renvoi** : status(200) json : {
	success : 1,
	data : { 
		“ Country“ : “Allemagne” ,
		“Rule“ : “PCR/fermé/ouvert…”,
		“Voyageurs“ : [a,b,c]
}
}

## Ajouter un voyageur :

Type : Post
**URL** : /api/voyageur/:NomPays
**Envoi** : 
**Json** : nom, prénom
**Renvoi** :
Succès : status(200) json : {
	success : 1,
	“message” : “Utilisateur bien ajouté”
}
Erreur : json : {
	success : 0,
	“message” : “Erreur d’ajout de l’utilisateur”
}

## Changer lois du pays : (à voir ensemble)

**Type** : Put
**URL** : /api/pays/:NomPays
**Envoi** : 
Json : nouvelle loi
**Renvoi** :
Succès : status(200) json : {
	success : 1,
	“message” : “Loi bien modifiée ”
}
Erreur : json : {
	success : 0,
	“message” : “Erreur de modif de la loi du pays”
}

## Retirer voyageur :

**Type** : Delete
**URL** : /api/voyageur
**Envoi** : 
Json : nom, prénom
**Renvoi** :
Succès : status(200) json : {
	success : 1,
	“message” : “Utilisateur bien enlevé de la base”
}
Erreur : json : {
	success : 0,
	“message” : “Erreur de suppression de l’utilisateur de la base”
}

