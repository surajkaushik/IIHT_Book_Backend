package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sId;
	private String sName;
	private String sEmail;
	private Integer standard;
	
	public Student() {
		super();
	}
	
	public Student(Integer sId, String sName, String sEmail, Integer standard) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sEmail = sEmail;
		this.standard = standard;
	}
	
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	public Integer getStandard() {
		return standard;
	}
	public void setStandard(Integer standard) {
		this.standard = standard;
	}
	
	

}
