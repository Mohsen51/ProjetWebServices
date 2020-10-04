package services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import api.API;
import api.Data;

@WebService (serviceName="COVID19_OpenData")
public class Services {
	
	@WebMethod(operationName="TotalDeaths")
	public int totalDeaths(){
		return Data.TotalDeaths;
	}
	
	@WebMethod(operationName="TotalRecovered")
	public int totalRecovered(){
		return Data.TotalRecovered;
	}
	
	@WebMethod(operationName="TotalConfirmed")
	public int totalConfirmed(){
		return Data.TotalConfirmed;
	}
	
	@WebMethod(operationName="NewDeaths")
	public int newDeaths(){
		return Data.NewDeaths;
	}
	
	@WebMethod(operationName="NewRecovered")
	public int newRecovered(){
		return Data.NewRecovered;
	}
	
	@WebMethod(operationName="NewConfirmed")
	public int newConfirmed(){
		return Data.NewConfirmed;
	}
	
	
}
