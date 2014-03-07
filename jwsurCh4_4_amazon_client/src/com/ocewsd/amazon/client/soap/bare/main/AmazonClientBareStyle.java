package com.ocewsd.amazon.client.soap.bare.main;

import java.util.List;

import com.ocewsd.amazon.client.soap.bare.AWSECommerceService;
import com.ocewsd.amazon.client.soap.bare.AWSECommerceServicePortType;
import com.ocewsd.amazon.client.soap.bare.Item;
import com.ocewsd.amazon.client.soap.bare.ItemSearch;
import com.ocewsd.amazon.client.soap.bare.ItemSearchRequest;
import com.ocewsd.amazon.client.soap.bare.ItemSearchResponse;
import com.ocewsd.amazon.client.soap.bare.Items;
import com.ocewsd.amazon.client.soap.handler.AwsHandlerResolver;
import com.ocewsd.amazon.client.soap.util.KeyHelper;

class AmazonClientBareStyle {
	public static void main(String[] args) {
		System.out.println("Bare style client...");
		final String accessID = KeyHelper.getAccessKeyId();
		final String secretKey = KeyHelper.getSecretAccessKey();

		// Create service and get portType reference.
		AWSECommerceService service = new AWSECommerceService();
		// Secret key for Amazon.
		service.setHandlerResolver(new AwsHandlerResolver(secretKey));

		AWSECommerceServicePortType port = service.getAWSECommerceServicePort();

		// Create request.
		ItemSearchRequest request = new ItemSearchRequest();

		// Add details to request.
		request.setSearchIndex("Books");
		request.setKeywords("Austen");

		ItemSearch itemSearch = new ItemSearch();
		itemSearch.setAWSAccessKeyId(accessID);
		itemSearch.setAssociateTag("kalin");
		itemSearch.getRequest().add(request);

		// Invoke service operation and get response.
		ItemSearchResponse response = port.itemSearch(itemSearch);

		List<Items> itemsList = response.getItems();

		int i = 1;
		for (Items next : itemsList)
			for (Item item : next.getItem())
				System.out.println(String.format("%2d: ", i++) + item.getItemAttributes().getTitle());
	}
}