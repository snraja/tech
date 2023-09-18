package com.snraja.j2ee.jaxrs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AreaModel {
	public String name;
	public String area;
	
	public AreaModel(String name, String area) {
		super();
		this.name = name;
		this.area = area;
	}
	
}
