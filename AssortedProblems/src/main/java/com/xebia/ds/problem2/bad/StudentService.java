package com.xebia.ds.problem2.bad;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xebia.ds.datastore.Datastore;
import com.xebia.ds.domain.Contact;
import com.xebia.ds.domain.Student;

public class StudentService {

	public List<Student> getStudents(String sortBy) {
		Student[] students = Datastore.ALL_STUDENTS;
		for (int i = 0; i < students.length; i++) {
			for (int j = i + 1; j < students.length; j++) {
				if (sortBy.equals("name")) {
					if (students[i].getName().compareTo(students[j].getName()) > 0) {
						swap(students, i, j);
					}
				} else if (sortBy.equals("age")) {
					if (students[i].getAge() > students[j].getAge()) {
						swap(students, i, j);
					}
				} else if (sortBy.equals("rollNumber")) {
					if (students[i].getRollNumber() > students[j]
							.getRollNumber()) {
						swap(students, i, j);
					}
				}
			}
		}
		return Arrays.asList(students);
	}
	
	public List<Student> getStudents1(String sortBy) {
		Student[] students = Datastore.ALL_STUDENTS;
		List<Student> studentsList = Arrays.asList(students);
		if(sortBy.equals("name")){
			Collections.sort(studentsList, new Comparator<Student>(){
				@Override
				public int compare(Student o1, Student o2) {
					// TODO Auto-generated method stub
					return o1.getName().compareTo(o2.getName());
				}
			});
		}
		
		// Similarly can be done for others, If else can be refactored as well.
		
		return studentsList;
		//return Arrays.asList(students);
	}

	

	private void swap(Student[] students, int i, int j) {
		Student temp;
		temp = students[i];
		students[i] = students[j];
		students[j] = temp;
	}

}
