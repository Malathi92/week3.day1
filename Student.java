package Org.student;

import Org.department.Department;

public class Student extends Department {

	public void studentName(String stuName)
	{
		System.out.println("the student name is :"+stuName);
	}
	public void studentDept(String dept)
	{
		System.out.println("the student department is :"+dept);
	}
	public void studentId(int id)
	{
		System.out.println("the student id is :"+id);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		System.out.println("multi level inheritance");
		s.collegeName("PET Engg College");
		s.collegeCode(4966);
		s.collegeRank(1);
		s.depName("ENGINEERING");
		s.studentDept("MALATHI");
		s.studentDept("CSE");
		s.studentId(42);
		

	}

}
