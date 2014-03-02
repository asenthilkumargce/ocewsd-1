/**
 * @author ElsonJr
 *
 */
package com.ocewcd.basic;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;
import com.thoughtworks.xstream.io.xml.DomDriver;

class Main {
    public static void main(String[ ] args) {
	PersonNoProps bd = new PersonNoProps("Bjoern Daehlie", 492, "Male");
	XStream xstream = new XStream(new DomDriver());
	xstream.alias("skier", PersonNoProps.class); // for readability

	// serialize
	String xml = xstream.toXML(bd);
	System.out.println(xml);
	PersonNoProps bdClone = (PersonNoProps) xstream.fromXML(xml);
	System.out.println(xstream.toXML(bdClone));
    }
}
/*
<skier>
  <name>Bjoern Daehlie</name>
  <age>49</age>
  <gender>Male</gender>
</skier>
*/