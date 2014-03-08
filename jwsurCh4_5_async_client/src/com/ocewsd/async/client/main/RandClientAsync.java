package com.ocewsd.async.client.main;

import java.util.List;

import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

import com.ocewsd.async.client.NextNResponse;
import com.ocewsd.async.client.RandImplService;
import com.ocewsd.async.client.RandService;

public class RandClientAsync {
	public static void main(String[] args) {
		RandImplService service = new RandImplService();
		RandService port = service.getRandImplPort();
		port.nextNAsync(4, new MyHandler());
		try {
			System.out.println("\nSleeping...");
			Thread.sleep(5000); 
			System.out.println("\nWoke up!");
		} catch (Exception e) {
		}
		System.out.println("\nMain is exiting...");
	}

	static class MyHandler implements AsyncHandler<NextNResponse> {
		public void handleResponse(Response<NextNResponse> future) {
			try {
				NextNResponse response = future.get();
				List<Integer> nums = response.getReturn();
				for (Integer num : nums)
					System.out.println(num);
			} catch (Exception e) {
				System.err.println(e);
			}
		}
	}
}