package pra.pengfei.webservice.service;

import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.client.WebClient;

public class Client {


	public static void main(String[] args) {
		
		
		String str = WebClient.create("http://localhost:8080/ws/hello/hello1/service/123")
				.accept(MediaType.APPLICATION_JSON)
				.get(String.class);
		
		System.out.println(str);
		
	}
}
