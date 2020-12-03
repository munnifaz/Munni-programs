package week4assign.student;

import week4assign.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("student name is munni");}
	
	public void studentDept() {
		System.out.println("student department is cse");}
	
	public void studentID() {
		System.out.println("student id is 21");}
	
	public void deposit() {
		System.out.println("the deposit is 200000");
	}

	public static void main(String[] args) {
		Student st=new Student();
			st.studentName();
			st.studentDept();
			st.studentID();
			st.deptName();
			st.collegeCode();
			st.collegeName();
			st.collegeRank();
			st.deposit();
			st.getstudentinfo(2);
			st.getstudentinfo(23, "munni");
			st.getstudentinfo("mun@gail.com",23456);
			
		
	}

	}
