package org.college;

public class College {
	private void collegeName() {
		System.out.println("The New College (Autonomous)");
}
	private void collegeCode() {
		System.out.println("College Code - 9955331");
	}
	private void collegeRank() {
		System.out.println("College Rank - 05");
	}
	public static void main(String[] args) {
		College c=new College();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		Student s=new Student();
		s.studentName();
		s.studentId();
		s.studentDepartment();
		Hostel h=new Hostel();
		h.hostelName();
		Department d=new Department();
		d.departName();
	}
}
