package com.xebia.ds.datastore;

import com.xebia.ds.domain.Student;

public interface Datastore {

	String[] NAMES = { "abhay", "abhi", "antim", "bobby", "balaji", "carlos",
			"erwin", "erwin", "inder" };

	Student[] ALL_STUDENTS = { new Student("Tim", 27, "Hain", 1l),
			new Student("Raj", 23, "Vardhan", 7l),
			new Student("Hem", 43, "Raj", 1l),
			new Student("Ron", 24, "Eee", 5l),
			new Student("Raon", 21, "Eee", 2l) };
}
