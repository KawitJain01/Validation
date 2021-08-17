package com.example.demo;

import java.util.List;

public class RequestInfo {

	private List<MyRequestInfo> t;
	
	public List<MyRequestInfo> getT() {
		return t;
	}

	public void setT(List<MyRequestInfo> t) {
		this.t = t;
	}

	public RequestInfo()
	{
	}
	
	public String toString()
	{
		return t.toString();
	}
}
