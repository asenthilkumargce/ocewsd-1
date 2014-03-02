package com.ocewsd.adages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "adage") //JAX-B annotation -> XML Binding
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"words", "wordCount"})
public class Adage {
	
	@XmlElement(required=true)
	protected String words;
	@XmlElement(required=true)
	protected int wordCount;

	public Adage() {
	}

	// overrides
	@Override
	public String toString() {
		return words + " -- " + wordCount + " words";
	}

	// properties
	public void setWords(String words) {
		this.words = words;
		this.wordCount = words.trim().split("\\s+").length;
	}

	public String getWords() {
		return this.words;
	}

	public void setWordCount(int wordCount) {
	}

	public int getWordCount() {
		return this.wordCount;
	}
}
