package com.anilkumar.model;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	
	private String id;
	private String name;
	private String grade;
	private String Department;
	private String mobilenumber;
	
	

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public Student() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}
	
	public String getDepartment() {
		return Department;
	}

	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
