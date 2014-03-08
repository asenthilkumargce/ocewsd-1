package com.ocewsd.amazon.client.soap.handler;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

public class AwsHandlerResolver implements HandlerResolver {
	private String awsSecretKey;

	public AwsHandlerResolver(String awsSecretKey) {
		this.awsSecretKey = awsSecretKey;
	}

	public List<Handler> getHandlerChain(PortInfo portInfo) {
		List<Handler> handlerChain = new ArrayList<Handler>();

		QName serviceQName = portInfo.getServiceName();
		System.out.println("Service name: " + serviceQName.getLocalPart());
		if (serviceQName.getLocalPart().equals("AWSECommerceService")) {
			handlerChain.add(new AwsSoapHandler(awsSecretKey));
		}
		return handlerChain;
	}
}

