/**
 * @author ElsonJr
 *
 */
package com.restful.amazon;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class KeyHelper {
	public static void main(String[] args) {
		KeyHelper.getAccessKeyId();
	}
	public static String getAccessKeyId() {
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
		return null;
	}

	public static String getSecretAccessKey() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("keys.jar"));
			br.readLine();
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
