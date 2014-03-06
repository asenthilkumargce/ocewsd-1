/**
 * @author ElsonJr
 *
 */
package com.ocewsd.client;

import java.util.List;

public class RandClientMain {
	public static void main(String[] args) {
		System.out.println("RandService client...");
		// set-up
		RandImplService service = new RandImplService();
		RandService port = service.getRandImplPort();

		// sample calls
		System.out.println("next1:");
		int next1ReturnValue = port.next1();
		System.out.println("\t" + next1ReturnValue);
		System.out.println("nextN:");
		List<Integer> nums = port.nextN(5);
		for (Integer num : nums)
			System.out.println("\t" + num);
	}
}
