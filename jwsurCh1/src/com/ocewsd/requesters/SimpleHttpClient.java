package com.ocewsd.requesters;

import java.net.Socket;
import java.net.URL;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SimpleHttpClient {
	public static void main(String[] args) {
		//String urlString = "http://www.google.com";
		//String urlString = "http://localhost:8080/jwsurCh1/";
		String urlString = "http://localhost:8080/jwsurCh2_3/resourcesP/create/what=qwe&who=qqq";
		
		
		
		System.out.println("Request Main");
		try { 


			// Parse the URL.
			URL url = new URL(urlString);
			String host = url.getHost();
			String path = url.getPath();
			int port = url.getPort();
			if (port < 0)
				port = 80;

			final String httpMethod = "POST ";
			//final String httpMethod = "GET ";
			
			// Send the request.
			String request = httpMethod + path + " HTTP/1.1\n";
			request += "host: " + host;
			request += "\n\n";

			Socket sock = new Socket(host, port);
			PrintWriter writer = new PrintWriter(sock.getOutputStream());
			writer.print(request);
			writer.flush();
			System.out.println("The response: ");
			// Read and print the response.
			BufferedReader reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			String next_record = null;
			while ((next_record = reader.readLine()) != null)
				System.out.println(next_record);
			sock.close();
			
			System.out.println("FIM");
		} catch (MalformedURLException e) {
			throw new RuntimeException("Please try again. Bad URL.\n" + e);
		} catch (UnknownHostException e) {
			throw new RuntimeException("Please try again. Unknown host.\n" + e);
		} catch (IOException e) {
			throw new RuntimeException("Please try again. Something's wrong.\n" + e);
		}
	}
}