package services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import api.API;

@WebService (serviceName="COVID19_OpenData")
public class Services {
	
	@WebMethod(operationName="GlobalDeaths")
	public int globalDeaths(){
		return API.getGlobalRecov();
	}
	
	@WebMethod(operationName="GlobalRecovered")
	public int globalRecovered(){
		return API.getGlobalDeaths();
	}
	
}
