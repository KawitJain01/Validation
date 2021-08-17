package com.example.demo;

import javax.validation.constraints.Positive;

public class MyRequestInfo2 extends MyRequestInfo {

	@Positive
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String toString()
	{
		return "[Age="+age+"]";
	}
}
