package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Madhu");
	}
	public void studentDept() {
		System.out.println("CSE");
	}
	public void studentId() {
		System.out.println("54656");
	}

	public static void main(String[] args) {
		Student s=new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
		s.deptName();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
	}

}
