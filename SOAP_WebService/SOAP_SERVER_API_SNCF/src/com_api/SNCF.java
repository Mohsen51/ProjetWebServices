package com_api;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class SNCF {
	
	@XmlTransient
	public final String ville="Paris";

	
	private String str_api_sncf = "https://c35f0ad5-868b-46b9-9bc2-a5e5a0039f98@api.sncf.com/v1/";
	private String str_rq_mtp_leaves = "coverage/sncf/stop_areas/stop_area:OCE:SA:87391003/departures?datetime=20200924T160630";
	private String str_test = "http://ip.jsontest.com/";
	
	private URL api_sncf = null;
	public static HttpURLConnection api_con = null;
	private int return_code = 0;
	
	public SNCF() {
		try {
			//api_sncf = new URL(str_api_sncf+str_rq_mtp_leaves);
			api_sncf = new URL(str_test);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block			
			e.printStackTrace();
		}
		
		try {
			api_con = (HttpURLConnection) api_sncf.openConnection();
			
			api_con.setRequestProperty("Content-Type", "application/json");
			api_con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:81.0) Gecko/20100101 Firefox/81.0");
			api_con.setRequestMethod("GET");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			return_code = api_con.getResponseCode();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(return_code);
	}
	
	public static int getReturnCode () {
		try {
			return api_con.getResponseCode();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		
		
	}
	
	
	

}
