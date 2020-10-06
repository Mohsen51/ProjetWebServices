import requests
import lxml.etree
import xml.etree.ElementTree as ET
import colorama
import time

colorama.init()

url = "http://localhost:7777/?wsdl"
headers = {'content-type': 'text/xml'}

class bcolors:
    HEADER = '\033[95m'
    OKBLUE = '\033[94m'
    OKGREEN = '\033[92m'
    WARNING = '\033[93m'
    FAIL = '\033[91m'
    ENDC = '\033[0m'
    BOLD = '\033[1m'
    UNDERLINE = '\033[4m'


def NewConfirmed():
    
    body = """<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://services/">
    <soapenv:Header/>
    <soapenv:Body>
        <ser:NewConfirmed/>
    </soapenv:Body>
    </soapenv:Envelope>"""
    response = requests.post(url,data=body,headers=headers)
    tree=ET.fromstring(response.text)
    #print(tree)
    nsmap = {'n': "http://schemas.xmlsoap.org/soap/envelope/"}
    full=tree.find('n:Body', namespaces=nsmap)
    print(full[0][0].text)
    time.sleep(2)

def NewDeath():
    
    body = """<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://services/">
   <soapenv:Header/>
   <soapenv:Body>
      <ser:NewDeaths/>
   </soapenv:Body>
</soapenv:Envelope>"""
    response = requests.post(url,data=body,headers=headers)
    tree=ET.fromstring(response.text)
    #print(tree)
    nsmap = {'n': "http://schemas.xmlsoap.org/soap/envelope/"}
    full=tree.find('n:Body', namespaces=nsmap)
    print(full[0][0].text)
    time.sleep(2)


def NewRecovered():
    
    body = """<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://services/">
   <soapenv:Header/>
   <soapenv:Body>
      <ser:NewRecovered/>
   </soapenv:Body>
</soapenv:Envelope>"""
    response = requests.post(url,data=body,headers=headers)
    tree=ET.fromstring(response.text)
    #print(tree)
    nsmap = {'n': "http://schemas.xmlsoap.org/soap/envelope/"}
    full=tree.find('n:Body', namespaces=nsmap)
    print(full[0][0].text)
    time.sleep(2)


def TotalConfirmed():
    
    body = """<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://services/">
   <soapenv:Header/>
   <soapenv:Body>
      <ser:TotalConfirmed/>
   </soapenv:Body>
</soapenv:Envelope>"""
    response = requests.post(url,data=body,headers=headers)
    tree=ET.fromstring(response.text)
    #print(tree)
    nsmap = {'n': "http://schemas.xmlsoap.org/soap/envelope/"}
    full=tree.find('n:Body', namespaces=nsmap)
    print(full[0][0].text)
    time.sleep(2)


def TotalDeaths():
    
    body = """<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://services/">
   <soapenv:Header/>
   <soapenv:Body>
      <ser:TotalDeaths/>
   </soapenv:Body>
</soapenv:Envelope>"""
    response = requests.post(url,data=body,headers=headers)
    tree=ET.fromstring(response.text)
    #print(tree)
    nsmap = {'n': "http://schemas.xmlsoap.org/soap/envelope/"}
    full=tree.find('n:Body', namespaces=nsmap)
    print(full[0][0].text)
    time.sleep(2)


def TotalRecovered():
    
    body = """<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://services/">
   <soapenv:Header/>
   <soapenv:Body>
      <ser:TotalRecovered/>
   </soapenv:Body>
</soapenv:Envelope>"""
    response = requests.post(url,data=body,headers=headers)
    tree=ET.fromstring(response.text)
    #print(tree)
    nsmap = {'n': "http://schemas.xmlsoap.org/soap/envelope/"}
    full=tree.find('n:Body', namespaces=nsmap)
    print(full[0][0].text)
    time.sleep(2)



def menu():
    print("Bienvenue sur Covid-WS, que voulez-vous savoir ?")
    print("1. Quels est le nombre de cas confirmé?")
    print("2. Combien y a-t-il de nouveaux morts?")
    print("3. Combien y a-t-il de nouveaux soignés?")
    print("4. Quel est le nombre total de cas confirmés?")
    print("5. Quel est le nombre total de personnes qui sont soignés?")
    print("6. Quel est le nombre de total de décès?")
    inputs=input("Choisissez...\n\n")
    tableaurep=[1,2,3,4,5,6]
    inputs=int(inputs)
    if inputs in tableaurep:
        print("good its in")
        if inputs==1:
            print(bcolors.OKBLUE+"Le nombre de cas confirmé est de : ")
            NewConfirmed()
            print("personnes")
            print("Oopsie ça fait beaucoup"+bcolors.ENDC)
            menu()
        if inputs==2:
            print(bcolors.WARNING+"Le nombre de nouveau morts est de :")
            NewDeath()
            print("personnes"+bcolors.ENDC)
            menu()
        if inputs==3:
            print(bcolors.OKGREEN+"Le nombre de nouveau soignés est de :")
            NewRecovered()
            print("personnes"+bcolors.ENDC)
            menu()
        
        if inputs==4:
            print(bcolors.FAIL+"Le nombre total de cas confirmé est de :")
            TotalConfirmed()
            print("personnes"+bcolors.ENDC)
            menu()
        if inputs==5:
            print(bcolors.WARNING+"Le nombre total de soignés est de :")
            TotalRecovered()
            print("personnes"+bcolors.ENDC)
            menu()
        if inputs == 6:
            print(bcolors.WARNING+"Le nombre total de décès est de : ")
            TotalDeaths()
            print("personnes"+bcolors.ENDC)
            menu()

    else:
        print("not good")
        print("Veuilliez choisir une des options existantes!")
        menu()


menu()
    
    

