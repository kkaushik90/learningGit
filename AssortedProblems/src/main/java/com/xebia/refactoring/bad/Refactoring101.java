package com.xebia.refactoring.bad;

public class Refactoring101 {

	public double potentionalEnery(float mass, float height) {
		return mass * height * 9.81;
	}

	public String[] returnStudentDetails() {
		String[] student = new String[4];
		student[0] = "Rupesh";
		student[1] = "Agrawal";
		student[2] = "26";
		student[3] = "Male";
		return student;
	}
	
	
}
