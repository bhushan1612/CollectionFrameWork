package com.example.mapinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ListToMap {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(101, "Bhushan")); /* inisilized the constructor */
		studentList.add(new Student(102, "Tushar"));
		studentList.add(new Student(103, "Hitesh"));
		studentList.add(new Student(104, "Piyush"));
		studentList.add(new Student(105, "Radikha"));
		studentList.add(new Student(106, "Suyog"));

		System.out.println("********Printing List Record*******");
		Iterator<Student> studentIterator = studentList.iterator();

		if (!(studentList.equals("Radikha")) || !(studentList.equals("Suyog"))) {
			while (studentIterator.hasNext()) {
				System.out.println(studentIterator.next());
			}
		} else {
			System.out.println("This Student are not present in this list");
		}

		System.out.println("\n" + "*******Converting List to Map********");
		Map<Integer, String> recordMap = new HashMap<Integer, String>();
		for (Student stud : studentList) {
			recordMap.put(stud.getRollNo(), stud.getStudentName());

		}

		System.out.println("\n" + "*****Printing Map Record*****");
		for (Map.Entry<Integer, String> me : recordMap.entrySet()) {
			System.out.print(me.getKey() + " : ");
			System.out.println(me.getValue());
		}

	}

}
