package org.student;

public class Students {
	
	
	public void getStudentInfo(int id) {
	
		
		System.out.println("StudentID" + " " +id);
	}
		
	public void getStudentInfo(int id,String name) {
				
		System.out.println(id + " " +  name);
	}
	public void getStudentInfo(String email,int num) {
		System.out.println(email + " " + num);
	}
	public static void main(String[] args) {
		
		Students s=new Students();
		s.getStudentInfo(52);
		s.getStudentInfo(548, "abc");
		s.getStudentInfo("xxx", 154569);
	}

}
