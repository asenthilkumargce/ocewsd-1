/**
 * @author ElsonJr
 *
 */
package com.ocewsd.amazon.client.soap.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class KeyHelper {
	private static final String FILE_NAME = "keys.jar";

	public static void main(String[] args) {
		KeyHelper.getAccessKeyId();
	}

	public static String getAccessKeyId() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(FILE_NAME));
			return br.readLine().trim();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public static String getSecretAccessKey() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(FILE_NAME));
			br.readLine();
			return br.readLine().trim();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
