package com.example.demo;

public class MyRequestInfo1 extends MyRequestInfo {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString()
	{
		return "[Name="+name+"]";
	}
}
