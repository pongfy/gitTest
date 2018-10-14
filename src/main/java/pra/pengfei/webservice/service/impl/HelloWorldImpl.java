package pra.pengfei.webservice.service.impl;

import pra.pengfei.webservice.service.HelloWorld;


public class HelloWorldImpl implements HelloWorld {

	@Override
	public String service(String name) {
		return "Hello " + name;
	}

}
