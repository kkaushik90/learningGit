package com.xebia.ds.domain;

public class Student {

	@Override
	public String toString() {
		return "Student [age=" + age + ", lastName=" + lastName + ", name="
				+ name + ", rollNumber=" + rollNumber + "]";
	}

	private String name;
	private int age;
	private String lastName;
	private long rollNumber;

	public Student(String name, int age, String lastName, long rollNumber) {
		super();
		this.name = name;
		this.age = age;
		this.lastName = lastName;
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(long rollNumber) {
		this.rollNumber = rollNumber;
	}
}
