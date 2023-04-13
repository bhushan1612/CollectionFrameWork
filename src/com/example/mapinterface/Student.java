package com.example.mapinterface;

public class Student {

	private int rollNo;
	
	private String studentName;

	public int getRollNo() {
		return rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public Student(int rollNo, String studentName) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + "]";
	}

	}
