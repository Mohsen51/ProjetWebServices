import json
import requests


listevoyageur=[]
listepays=[]


class bcolors:
    HEADER = '\033[95m'
    OKBLUE = '\033[94m'
    OKGREEN = '\033[92m'
    WARNING = '\033[93m'
    FAIL = '\033[91m'
    ENDC = '\033[0m'
    BOLD = '\033[1m'
    UNDERLINE = '\033[4m'
###Definition des classes 
class voyageur:
    def __init__(self,nom,prenom,age,email,nationalite):
        self.nom=nom
        self.prenom=prenom
        self.age=age
        self.email=email
        self.nationalite=nationalite
        listevoyageur.append(self)
    
    def delete(self):
        listevoyageur.remove(self)
        del self
        

class country:
    
    def __init__(self,nom,regle,liste):
        self.nom=nom
        self.regle=regle
        self.liste=liste
        listepays.append(self)
        

    def nom(self,nom):
        if type(nom)!='str':
            print("Not good")

    def returnRule(self):
        print(self.regle)
        if self.regle=='0':
            print('PCR')
            return self.regle
        if self.regle=='1':
            print('Fermé')
            return self.regle
        if self.regle=='2':
            print('Ouvert')
            return self.regle
        else :
            print("Not good rule")

"""class rule:
    
    def __init__(self,regle_int):
        self.regle_int=regle_int
            

    
    def returnRule(self):
        if self.regle_int=='0':
            print('PCR')
        if self.regle_int=='1':
            print('Fermé')
        if self.regle_int=='2':
            print('Ouvert')
        else :
            print("Not good rule")"""

def loipays(listepays):
    for i in listepays:
        print(listepays[i].regle)

def menu():
    print(bcolors.HEADER+"Bienvenues sur l'interface covid-WS\n"+bcolors.ENDC)
    print(bcolors.HEADER+"Que voulez-vous faire ?\n"+bcolors.ENDC)
    print(bcolors.UNDERLINE+"1. Voir les lois covid des différents pays"+bcolors.ENDC)
    print(bcolors.UNDERLINE+"2. Voir la liste de tous les voyageurs"+bcolors.ENDC)
    print(bcolors.UNDERLINE+"3. Voir la législation des pays"+bcolors.ENDC)
    choix =input(bcolors.BOLD+"\nVotre choix : "+bcolors.ENDC)
    
    if choix=='1':
        resp=requests.get("http://localhost:8080/api/pays")
        json_data=json.loads(resp.text)
        ##text=text.replace("[", "",-1).replace('"',"",-1).replace("{","",-1).replace("]","",-1).replace("}","",-1)
        i=0
        while i <len(json_data):
            print(bcolors.OKBLUE+((json_data[i])["nomPays"])+" : "+bcolors.WARNING+(json_data[i])["accesPays"]+bcolors.ENDC)
            i+=1
        input("Appuyez sur nimporte quelle touche pour continuer...\n")
    if choix == '2':
        resp=requests.get("http://localhost:8080/api/voyageurs")
        json_data=json.loads(resp.text)
        ##text=text.replace("[", "",-1).replace('"',"",-1).replace("{","",-1).replace("]","",-1).replace("}","",-1)
        i=0
        while i <len(json_data):
            print(bcolors.OKBLUE+(str((json_data[i])["idVoyageur"]))+bcolors.WARNING+" : Nom : "+(json_data[i])["nomVoyageur"]+bcolors.FAIL+" - Prénom : "+(json_data[i])["prenomVoyageur"]+bcolors.HEADER+" - Pays : "+json_data[i]["pays"]["nomPays"]+bcolors.ENDC)
            i+=1
        input("Appuyez sur nimporte quelle touche pour continuer...\n")
        menu()
    if choix =="3":
        nomPays=input(bcolors.OKBLUE+bcolors.BOLD+"Choisissez le nom du pays qui vous intéresse \n"+bcolors.ENDC)
        nomPays=nomPays.lower().replace(nomPays[0].lower(),nomPays[0].upper(),1)
        resp=requests.get(f"http://localhost:8080/api/pays/{nomPays}")
        json_data=json.loads(resp.text)
        print(bcolors.OKBLUE+json_data["nomPays"]+" : "+bcolors.WARNING+json_data["accesPays"]+bcolors.ENDC)
        input("Appuyez sur nimporte quelle touche pour continuer...\n")
        menu()
    if choix =="4":
        idVoyageur=input(bcolors.OKBLUE+bcolors.BOLD+"Choisissez le nom du voyageur qui vous intéresse \n"+bcolors.ENDC)
        idVoyageur=idVoyageur
        resp=requests.get(f"http://localhost:8080/api/voyageurs/{idVoyageur}")
        json_data=json.loads(resp.text)
        print(bcolors.OKBLUE+(str(json_data["idVoyageur"]))+bcolors.WARNING+" : Nom : "+json_data["nomVoyageur"]+bcolors.FAIL+" - Prénom : "+json_data["prenomVoyageur"]+bcolors.HEADER+" - Pays : "+json_data["pays"]["nomPays"]+bcolors.ENDC)

        input("Appuyez sur nimporte quelle touche pour continuer...\n")
        menu()
            
            

        
     
        
#####testons les requêtes

if __name__ == "__main__":
    menu()









    """
    resp = requests.get("http://localhost:8080/api/voyageurs")
    print(resp.json())
    john={'nomVoyageur' : 'Mcjohnson', 'prenomVoyageur' : 'John'}
    resp2=requests.post("http://localhost:8080/api/voyageurs/:Allemagne", json=john)
    print(resp2)
    Allemagne = country("Allemagne","1",["John","Patrick","Didier"])
    France= country("France","1",["Michel, Frank, Colon, Samuel"])
    #print(Allemagne.returnRule())
    voyageur1=voyageur("Simon","Tancev",1,"simo.tan","France")
    voyageur2=voyageur("Yah","Ro",4,"siad","Jo")
    print(listevoyageur[1].nom)
    listevoyageur[1].delete()
"""



    
    

        