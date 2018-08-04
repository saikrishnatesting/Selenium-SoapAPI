package com.TestCases.Countryinfo;

import java.io.IOException;

import javax.xml.soap.SOAPException;

import org.testng.annotations.Test;

public class CapitalCity {
	
	@Test(priority=1)
	public void CapitalCity_TC01() throws UnsupportedOperationException, SOAPException, IOException{
		String CapitalCity_URL= "http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso";
		String input = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://www.oorsprong.org/websamples.countryinfo\">\n" + 
				"   <soapenv:Header/>\n" + 
				"   <soapenv:Body>\n" + 
				"      <web:CapitalCity>\n" + 
				"         <web:sCountryISOCode>NZ</web:sCountryISOCode>\n" + 
				"      </web:CapitalCity>\n" + 
				"   </soapenv:Body>\n" + 
				"</soapenv:Envelope>";
		String response = SoapConnection.GetConnection(input,CapitalCity_URL);
		System.out.println(response);
	}
	
	@Test(priority=2)
	public void CapitalCity_TC02() throws UnsupportedOperationException, SOAPException, IOException{
		String CapitalCity_URL= "http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso";
		String input = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://www.oorsprong.org/websamples.countryinfo\">\n" + 
				"   <soapenv:Header/>\n" + 
				"   <soapenv:Body>\n" + 
				"      <web:CapitalCity>\n" + 
				"         <web:sCountryISOCode>NZ</web:sCountryISOCode>\n" + 
				"      </web:CapitalCity>\n" + 
				"   </soapenv:Body>\n" + 
				"</soapenv:Envelope>";
		String response = SoapConnection.GetConnection(input,CapitalCity_URL);
		System.out.println(response);
	}
	
	

}
