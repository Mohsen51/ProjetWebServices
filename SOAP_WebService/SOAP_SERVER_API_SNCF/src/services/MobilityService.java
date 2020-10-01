package services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com_api.SNCF;

@WebService (serviceName="SNCF_Mobility_Data")
public class MobilityService {
	@WebMethod
	public double conversionEuroToUSD (@WebParam(name="mteuro")double montant){
		return montant * 1.25;
	}
	
	@WebMethod(operationName="ReturnCode")
	public int getHttpReturnCode(){
		return SNCF.getReturnCode();
	}
	
}
