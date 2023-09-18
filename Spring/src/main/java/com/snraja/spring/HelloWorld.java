package com.snraja.spring;

public class HelloWorld {

	private String displayName;

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public void sayHello() {
		System.out.println("Hello World " + this.getDisplayName() + " from spring");
	}
	
}
