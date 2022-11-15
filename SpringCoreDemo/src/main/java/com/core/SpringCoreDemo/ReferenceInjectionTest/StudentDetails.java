package com.core.SpringCoreDemo.ReferenceInjectionTest;

public class StudentDetails {
	
	private String studentName;
	private String studentClass;
	private Integer studentAge;
	private String studentCity;
	private StudentSubjects studentSubjects;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public Integer getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public StudentSubjects getStudentSubjects() {
		return studentSubjects;
	}
	public void setStudentSubjects(StudentSubjects studentSubjects) {
		this.studentSubjects = studentSubjects;
	}
	@Override
	public String toString() {
		return "StudentDetails [studentName=" + studentName + ", studentClass=" + studentClass + ", studentAge="
				+ studentAge + ", studentCity=" + studentCity + ", studentSubjects=" + studentSubjects + "]";
	}
	public StudentDetails(String studentName, String studentClass, Integer studentAge, String studentCity,
			StudentSubjects studentSubjects) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.studentAge = studentAge;
		this.studentCity = studentCity;
		this.studentSubjects = studentSubjects;
	}
	
	

}
