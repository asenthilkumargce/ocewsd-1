package com.ocewsd.requesters;

import java.net.URL;
import java.net.URLConnection;
import java.net.MalformedURLException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class UrlConnectionClient {
	public static void main(String[] args) {
		//String urlString = "http://www.google.com";
		String urlString = "http://localhost:8080/jwsurCh1/";
		
		
		System.out.println("Request Main");
		
		try {
			
			// Parse the URL.
			URL url = new URL(urlString.trim());

			// Connect.
			URLConnection sock = url.openConnection();
			System.out.println("The response: ");
			// Read and print.
			BufferedReader reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			String next_record = null;
			while ((next_record = reader.readLine()) != null)
				System.out.println(next_record);

			// Close.
			reader.close();
			System.out.println("FIM");
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
