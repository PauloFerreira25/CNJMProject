package br.com.starssource.cnjm.webservice.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "HelloMessengerService", targetNamespace = "http://java.boot.by/", wsdlLocation = "http://localhost:9999/Hello?wsdl")
public class PessoaWSClient extends Service {

	private final static URL HELLOMESSENGERSERVICE_WSDL_LOCATION;

	static {
		URL url = null;
		try {
			url = new URL("http://localhost:9999/Hello?wsdl");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		HELLOMESSENGERSERVICE_WSDL_LOCATION = url;
	}

	public PessoaWSClient(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public PessoaWSClient() {
		super(HELLOMESSENGERSERVICE_WSDL_LOCATION, new QName(
				"http://java.boot.by/", "HelloMessengerService"));
	}

	@WebEndpoint(name = "HelloMessengerPort")
	public HelloMessenger getHelloMessengerPort() {
		return (HelloMessenger) super.getPort(new QName("http://java.boot.by/",
				"HelloMessengerPort"), HelloMessenger.class);
	}

	@WebEndpoint(name = "HelloMessengerPort")
	public HelloMessenger getHelloMessengerPort(WebServiceFeature... features) {
		return (HelloMessenger) super.getPort(new QName("http://java.boot.by/",
				"HelloMessengerPort"), HelloMessenger.class, features);
	}
}