package com.zzptc.wxz;

public class Student {
	int id;
	String name;
	String brithday;
	public Student() {
		
	}

	public Student(int id, String name, String brithday) {
		this.id = id;
		this.name = name;
		this.brithday = brithday;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", brithday=" + brithday + "]";
	}
	
	

}
