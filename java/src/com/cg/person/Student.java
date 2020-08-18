package com.cg.person;

public class Student extends Person
{
	private String branch;
	private int studetId;
	public Student(String branch, int studentId) {
		super(branch, studentId);
		this.branch = branch;
		this.studetId = studentId;
	}
	
	 public void displayStudentDetails()
	 {
		 System.out.println(this.name +" "+this.age +this.branch +" "+this.studetId);
	 }

}
