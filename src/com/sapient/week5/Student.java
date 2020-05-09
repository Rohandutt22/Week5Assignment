package com.sapient.week5;

public class Student {

	private int id;
	private String name;
	private String city;
	
	
	public Student() {
		super();
	}
	public Student(Student s) {
		this.city=s.getCity();
		this.id=s.getId();
		this.name=s.getName();
	}
	
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Name : "+name+" id : "+ id +" city : "+city;
	
	}
}
