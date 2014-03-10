package com.ocewsd.prediction.soap.client.main;

import java.util.List;

import com.ocewsd.prediction.soap.client.Create;
import com.ocewsd.prediction.soap.client.Delete;
import com.ocewsd.prediction.soap.client.Edit;
import com.ocewsd.prediction.soap.client.GetAll;
import com.ocewsd.prediction.soap.client.GetOne;
import com.ocewsd.prediction.soap.client.GetOneResponse;
import com.ocewsd.prediction.soap.client.Prediction;
import com.ocewsd.prediction.soap.client.PredictionsSOAP;
import com.ocewsd.prediction.soap.client.PredictionsSOAPService;
import com.ocewsd.prediction.soap.client.VerbosityException;
import com.ocewsd.prediction.soap.client.handler.ClientHandlerResolver;

public class PredictionsClient {

	public static void main(String[] args) {
		try {
			String name = "curly";
			String key = "CurlyCurlyCurly";
			
			
			System.out.println("Main...");
			PredictionsSOAPService service = new PredictionsSOAPService();
			service.setHandlerResolver(new ClientHandlerResolver(name, key));
			PredictionsSOAP port = service.getPredictionsSOAPPort();

			PredictionsClient.listAll(port);

			System.out.println("\nCreating a new one...");

			Create createParam = new Create();
			createParam.setArg0("Mr Salabin");
			createParam.setArg1("I rule the world!");

			port.create(createParam);

			System.out.println("\nDeleting one... ");
			Delete deleteParam = new Delete();
			deleteParam.setArg0(-3);
			port.delete(deleteParam);
			
			PredictionsClient.listAll(port);
			
			System.out.println("\nUpdating...");
			Edit editParameters = new Edit();
			editParameters.setArg0(1);
			editParameters.setArg1("Mr Harold");
			editParameters.setArg2("Enjoy life!");
			port.edit(editParameters);
			
			PredictionsClient.listAll(port);
			
			System.out.println("Getting one...");
			GetOne getOneParameters = new GetOne();
			getOneParameters.setArg0(2);
			GetOneResponse getOneResponse =  port.getOne(getOneParameters);
			Prediction pred = getOneResponse.getReturn();
			System.out.println("\nId.: " + pred.getId());
			System.out.println("Who.: " + pred.getWho());
			System.out.println("What.: " + pred.getWhat());
			
			
			
		} catch (VerbosityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	private static void listAll(PredictionsSOAP port){
		List<Prediction> preds = null;
		System.out.println("\n Listing All:");
		preds = (port.getAll(null)).getReturn();
		System.out.println("\n");
		for (Prediction pred : preds)
			System.out.println(String.format("%2d: ", pred.getId()) + pred.getWho() + " predicts: "
					+ pred.getWhat());
	}

}
