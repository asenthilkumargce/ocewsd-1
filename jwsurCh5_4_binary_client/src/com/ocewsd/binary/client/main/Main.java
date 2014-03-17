/**
 * @author ElsonJr
 *
 */
package com.ocewsd.binary.client.main;

import javax.activation.DataHandler;

import com.ocewsd.binary.client.GetImageResponse;
import com.ocewsd.binary.client.SkiImageService;
import com.ocewsd.binary.client.SkiImageServiceService;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("retrieving nordic image...");
		SkiImageServiceService service = new SkiImageServiceService();
		SkiImageService servicePort = service.getSkiImageServicePort(); 
		
		
		Main.getImage(servicePort, "alpine");
		Main.getImage(servicePort, "nordic");
		Main.getImage(servicePort, "telemk");
		Main.getImage(servicePort, "xxx");
		
	}
	private static  void getImage(SkiImageService servicePort, String fileName){
		System.out.println(fileName+":");
		byte[] image = null;
		image = servicePort.getImage(fileName);
		if(image != null){
			System.out.println("\t"+image.length);
		}else{
			System.out.println("\tWS returned a null image!!!");
		}
	}
	
}
