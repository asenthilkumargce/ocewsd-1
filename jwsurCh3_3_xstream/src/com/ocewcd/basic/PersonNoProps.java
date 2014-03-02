package com.ocewcd.basic;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class PersonNoProps  {
    private String name;
    private int    age;
    private String gender;

    public PersonNoProps(String name, int age, String gender){
	this.name = name;
	this.age = age;
	this.gender = gender;
    }
}

