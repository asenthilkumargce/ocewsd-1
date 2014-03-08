package com.ocewsd.prediction.soap;

public class VerbosityException extends Exception {
	private String details;

	public VerbosityException(String reason, String details) {
		super(reason);
		this.details = details;
	}

	public String getFaultInfo() {
		return this.details;
	}
}