/**
 * @author ElsonJr
 *
 */
package com.ocewsd.amazon.client.soap.wrapped.main;

import java.util.List;

import javax.xml.ws.Holder;

import com.ocewsd.amazon.client.soap.handler.AwsHandlerResolver;
import com.ocewsd.amazon.client.soap.util.KeyHelper;
import com.ocewsd.amazon.client.soap.wrapped.*;

public class AmazonClientWrappedStyle {
	public static void main(String[] args) {
		System.out.println("Wrapped style client...");
		final String accessId = KeyHelper.getAccessKeyId();
		final String secretKey = KeyHelper.getSecretAccessKey();
		AWSECommerceService service = new AWSECommerceService();
		service.setHandlerResolver(new AwsHandlerResolver(secretKey));
		AWSECommerceServicePortType port = service.getAWSECommerceServicePort();
		ItemSearchRequest request = new ItemSearchRequest();
		request.setSearchIndex("Books");
		request.setKeywords("Austen");
		ItemSearch search = new ItemSearch();
		search.getRequest().add(request);
		search.setAWSAccessKeyId(accessId);
		search.setAssociateTag("kalin");
		Holder<OperationRequest> operationRequest = null;
		Holder<List<Items>> items = new Holder<List<Items>>();
		port.itemSearch(search.getMarketplaceDomain(), search.getAWSAccessKeyId(), search.getAssociateTag(),
				search.getXMLEscaping(), search.getValidate(), search.getShared(), search.getRequest(),
				operationRequest, items);
		Items retval = items.value.get(0);
		int i = 1;
		List<Item> item_list = retval.getItem();
		for (Item item : item_list)
			System.out.println(String.format("%2d: ", i++) + item.getItemAttributes().getTitle());
	}
}
