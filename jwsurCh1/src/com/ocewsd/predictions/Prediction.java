package com.ocewsd.predictions;

import java.io.Serializable;

public class Prediction implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String who; // person
	private String what; // his/her prediction
	public Integer getWhen() {
		return when;
	}

	public void setWhen(Integer when) {
		this.when = when;
	}

	private Integer when;

	public Prediction() {
	}

	public void setWho(String who) {
		this.who = who;
	}

	public String getWho() {
		return this.who;
	}

	public void setWhat(String what) {
		this.what = what;
	}

	public String getWhat() {
		return this.what;
	}
}