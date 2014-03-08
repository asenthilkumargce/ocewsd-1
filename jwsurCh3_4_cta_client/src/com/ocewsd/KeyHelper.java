/**
 * @author ElsonJr
 *
 */
package com.ocewsd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class KeyHelper {
	
	public static String getSecretAccessKey() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("keys.jar"));
			return br.readLine().trim();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
			}
		}
		return null;	}

}
