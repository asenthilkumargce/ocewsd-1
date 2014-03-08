package com.ocewsd.prediction.soap.client.main;

import java.util.List;

import com.ocewsd.prediction.soap.client.GetAll;
import com.ocewsd.prediction.soap.client.Prediction;
import com.ocewsd.prediction.soap.client.PredictionsSOAP;
import com.ocewsd.prediction.soap.client.PredictionsSOAPService;
import com.ocewsd.prediction.soap.client.handler.ClientHandlerResolver;

public class PredictionsClient {

	public static void main(String[] args) {
		String name = "curly";
		String key = "CurlyCurlyCurly";
		
		System.out.println("Main...");
		PredictionsSOAPService service = new PredictionsSOAPService();
		service.setHandlerResolver(new ClientHandlerResolver(name, key));
		PredictionsSOAP port = service.getPredictionsSOAPPort();


		List<Prediction> preds = (port.getAll(null)).getReturn();
		System.out.println("\n");
		for (Prediction pred : preds)
			System.out.println(String.format("%2d: ", pred.getId()) + pred.getWho() + " predicts: " + pred.getWhat());
	}
	
}
