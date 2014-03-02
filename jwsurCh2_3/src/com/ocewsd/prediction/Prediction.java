package com.ocewsd.prediction;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "prediction")
public class Prediction implements Comparable<Prediction> {
	
	private String who; // person
	private String what; // his/her prediction
	private int id; // identifier used as lookup-key
	private Integer when;
	
	public Prediction() {
	}

	@Override
	public String toString() {
		return String.format("%2d: ", id) + who + " ==> " + what  + " ==> " +  when + "\n";
	}

	//** properties
	public void setWho(String who) {
		this.who = who;
	}

	@XmlElement(required = true)
	public String getWho() {
		return this.who;
	}

	public void setWhat(String what) {
		this.what = what;
	}

	@XmlElement(required = true)
	public String getWhat() {
		return this.what;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlElement(required = true)
	public int getId() {
		return this.id;
	}

	// implementation of Comparable interface
	public int compareTo(Prediction other) {
		return this.id - other.id;
	}

	@XmlElement
	public Integer getWhen() {
		return when;
	}

	public void setWhen(Integer when) {
		this.when = when;
	}

	

}