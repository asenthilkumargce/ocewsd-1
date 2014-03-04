package com.wadl;

import java.net.URI;

public class Predictions3Client {
	public static void main(String[] args) {
		new Predictions3Client().demo();
	}
//Localhost_Predictions3ResourcesP
//Localhost_JwsurCh2_3ResourcesP
	private void demo() {
		// Get a reference to the Localhost_Predictions3ResourcesP.Root defined
		// inside Localhost_Predictions3ResourcesP, as the "root" provides access
		// to other classes, which in turn support the CRUD functionalities.
		System.out.println("init");
		
		
		//Localhost_Predictions3ResourcesP.Root root = Localhost_Predictions3ResourcesP.root();
		Localhost_JwsurCh2_3ResourcesP.Root root = Localhost_JwsurCh2_3ResourcesP.root();

		
		// The xmlGetter can make GET requests against the service.

		//Localhost_Predictions3ResourcesP.Root.Xml xmlGetter = root.xml();
		//Localhost_Predictions3ResourcesP.Root.Json jsonGetter = root.json();
		Localhost_JwsurCh2_3ResourcesP.Root.Xml xmlGetter = root.xml();
		
		String xml = xmlGetter.getAsXml(String.class); // String is return type
		//String json = jsonGetter.getAsJson(String.class);

		System.out.println("The raw XML:\n" + xml); // predictions as XML doc

		//System.out.println("The raw XML:\n" + json); // predictions as json

	}
}