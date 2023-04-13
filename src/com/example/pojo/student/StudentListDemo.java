package com.example.pojo.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentListDemo {
	
	public List<Student> ConvertObjectValueToList(Student student){
		System.out.println("\n");
 		System.out.println("****** ConvertObjectValueToList ******");
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(student);
		
		
	for (Student student2 : studentList) {
		System.out.println(student2);
	}
	Iterator<Student> studentIterator = studentList.iterator();
	while (studentIterator.hasNext()) {
		Student student2 = studentIterator.next();
		System.out.println("Student ID : "+student.getStudentId());
		
	}
		return studentList;
		
	}
	
	public List<Student> retriveStudentData(List<Student> studentList){
		
		System.out.println("****retriveStudentData*****");
		for (Student student : studentList) {
		System.out.println(student);
		}
		
		System.out.println("\n");
		System.out.println("*****************************");
		Iterator<Student> studentIterator1 = studentList.iterator();
		while(studentIterator1.hasNext()) {
			System.out.println(studentIterator1.next());
		}
		
		return studentList;
	}

	public static void main(String[] args) {
		/*Creating student list*/
		Student student = new Student();
		
		student.setStudentId(100);
		student.setStudentName("Bhushan");
		student.setStudentEmail("bhushanm1882@gmail.com");

		
		/*Creating student2 object to add the data*/
		StudentListDemo studentListDemo = new StudentListDemo();
		Student student2 = new Student();
		student2.setStudentId(101);
		student2.setStudentName("Ajay");
		student2.setStudentEmail("ajay1782@gmail.com");
		
		List<Student> studentList2 = new ArrayList<Student>();
		studentList2.add(student2);
		studentList2.add(student);
		
		studentListDemo.retriveStudentData(studentList2);
		studentListDemo.ConvertObjectValueToList(student2);
	
		
	}

}
