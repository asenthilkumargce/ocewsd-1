package com.ocewsd.prediction.soap;

import java.util.List;
import java.util.Random;

import javax.annotation.Resource;
import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.servlet.ServletContext;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

@WebService
public class PredictionsSOAP {

	@Resource
	private WebServiceContext wsCtx;
	private ServletContext sCtx;
	private static final Predictions predictions = new Predictions();
	private static final int maxLength = 16;

	@WebMethod
	public List<Prediction> getAll() {
		init();
		return predictions.getPredictions();
	}

	@WebMethod
	public Prediction getOne(int id) {
		init();
		return predictions.getPrediction(id);
	}

	private void init() {
		if (wsCtx == null)
			throw new RuntimeException("DI failed on wsCtx!");
		if (sCtx == null) { // ServletContext not yet set?
			MessageContext mCtx = wsCtx.getMessageContext();
			sCtx = (ServletContext) mCtx.get(MessageContext.SERVLET_CONTEXT);
			predictions.setServletContext(sCtx);
		}
	}

	//****

	@WebMethod
	public String delete(int id) {
		init();
		String msg = "Prediction " + id + " not found.";
		Prediction p = predictions.getPrediction(id);
		if (p != null) {
			predictions.getMap().remove(id);
			msg = "Prediction " + id + " removed.";
		}
		return msg;
	}

	private int wordCount(String words) {
		if (words == null)
			return -1;
		return words.trim().split("\\s+").length;
	}

	@WebMethod
	public String edit(int id, String who, String what) throws VerbosityException {
		return null;
	}
}