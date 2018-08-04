package com.TestCases.Countryinfo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

public class SoapConnection {
	
	public static String GetConnection(String mesg1, String EndURL) throws UnsupportedOperationException, SOAPException, IOException {
		SOAPConnectionFactory factory = SOAPConnectionFactory.newInstance();
		SOAPConnection con = factory.createConnection();
		java.net.URL url = new java.net.URL(EndURL);
		java.io.InputStream is = new ByteArrayInputStream(mesg1.getBytes());
		SOAPMessage request = MessageFactory.newInstance().createMessage(null, is);
		is.close();
		SOAPMessage response = con.call(request, url);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		response.writeTo(baos);
		String op1 = baos.toString();
		baos.close();
		String op2= op1.replaceAll("&lt;","<");
		String output= op2.replaceAll("&lt;","<");
		return output;
		
	}

}
