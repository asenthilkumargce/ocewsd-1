package com.testing;

import org.apache.commons.codec.binary.Base64;

public class Test {
	public static void main(String args[]) throws Exception {
		//XXX use commons-codec-1.9.jar
		byte[] input = new byte[] {
				25, 109, -39, -23, 82, -47, -88, 115, 
				-34, 126, -57, 16, -110, -110, 60, -7, 
				-123, -3, 60, 91, 112, -93, -67, -65, -71,
				-107, 123, -15, -106, 86, -80, 79
		};

		
		
		Base64 b64 = new Base64(64);
		String output = new String(b64.encode(input));
		output = output.trim();
		System.out.println("*"+output+"*");
	}
}