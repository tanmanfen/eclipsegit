package com.zzptc.wxz;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.github.javafaker.Faker;

public class Test {

	public static void main(String[] args) {
		Faker faker=new Faker(Locale.CHINA);
		List<Student> list=new ArrayList<Student>();
		for(int i=0;i<100;i++) {
			Student s=new Student(i+1,faker.name().fullName(),faker.date().birthday().toString());
			list.add(s);
		}
		System.out.println(list.size());
		System.out.println(list.get(0));
		

	}

}
