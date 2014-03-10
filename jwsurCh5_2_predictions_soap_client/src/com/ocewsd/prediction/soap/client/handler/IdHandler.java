/**
 * @author ElsonJr
 *
 */
package com.ocewsd.prediction.soap.client.handler;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.LogicalMessage;
import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;

import com.ocewsd.prediction.soap.client.Delete;
import com.ocewsd.prediction.soap.client.Edit;
import com.ocewsd.prediction.soap.client.GetOne;

public class IdHandler implements LogicalHandler<LogicalMessageContext> {

	@Override
	public void close(MessageContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean handleFault(LogicalMessageContext arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean handleMessage(LogicalMessageContext lmctx) {
		Boolean outbound = (Boolean) lmctx.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		System.out.println(" public boolean handleMessage(LogicalMessageContext lmctx) - IdHandler");
		System.out.println("	MESSAGE_OUTBOUND_PROPERTY: " + outbound);
		if (outbound) { // request?
			LogicalMessage msg = lmctx.getMessage();
			try {

				/**
				 * If the getPayload method is invoked with no arguments (line
				 * 3), the payload would be returned as an XML document.
				 * 
				 * If the getPayload method is invoked with a JAXBContext as the
				 * argument, a reference to an Object is returned
				 * 
				 */

				JAXBContext jaxbCtx = JAXBContext.newInstance("com.ocewsd.prediction.soap.client");
				Object payload = msg.getPayload(jaxbCtx);
				// Check payload to be sure it's what we want.
				if (payload instanceof JAXBElement) {
					Object value = ((JAXBElement) payload).getValue();
					// Three possibilities of interest: GetOne, Edit, or Delete
					int id = 0;
					boolean getOne, edit, delete;
					getOne = edit = delete = false;
					if (value != null) {

						if (value.toString().contains("GetOne")) {
							id = ((GetOne) value).getArg0();
							getOne = true;
						} else if (value.toString().contains("Edit")) {
							id = ((Edit) value).getArg0();
							edit = true;
						} else if (value.toString().contains("Delete")) {
							id = ((Delete) value).getArg0();
							delete = true;
						} else if (id > 0) {
							return true;
						}
					} else {
						System.err.println("NULL Value!");
					}

					if (getOne || edit || delete) {
						if (id == 0) // can't fix
							throw new RuntimeException("ID cannot be zero!");
						// id < 0 and operation is GetOne, Edit, or Delete
						int newId = Math.abs(id);
						// Update argument.
						if (getOne)
							((GetOne) value).setArg0(newId);
						else if (edit)
							((Edit) value).setArg0(newId);
						else if (delete)
							((Delete) value).setArg0(newId);
						// Update payload.
						((JAXBElement) payload).setValue(value);
						// Update message
						msg.setPayload(payload, jaxbCtx);
					}
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return true;
	}

}
