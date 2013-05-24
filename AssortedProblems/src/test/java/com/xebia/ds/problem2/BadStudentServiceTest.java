package com.xebia.ds.problem2;

import java.util.List;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.xebia.ds.domain.Student;
import com.xebia.ds.problem2.bad.StudentService;

public class BadStudentServiceTest extends TestCase {

	public void testGetStudentListSortedByAge() {
		StudentService studentService = new StudentService();
		List<Student> students = studentService.getStudents("age");
		int i = 0;
		while (i < students.size() - 1) {
			Assert.assertTrue(students.get(i).getAge() <= students.get(++i)
					.getAge());
		}
	}

	public void testGetStudentListSortedByName() {
		StudentService studentService = new StudentService();
		List<Student> students = studentService.getStudents("name");
		int i = 0;
		while (i < students.size() - 1) {
			Assert.assertTrue(students.get(i).getName().compareTo(
					students.get(++i).getName()) <= 0);
		}
	}

	public void testGetStudentListSortedByRollNumber() {
		StudentService studentService = new StudentService();
		List<Student> students = studentService.getStudents("rollNumber");
		int i = 0;
		while (i < students.size() - 1) {
			Assert.assertTrue(students.get(i).getRollNumber() <= students.get(
					++i).getRollNumber());
		}
	}
}
