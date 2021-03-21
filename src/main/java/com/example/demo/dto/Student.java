package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sdudetails")
public class Student {
	
	@Column(name = "id")
	int id;
	
	@Column(name = "student_name")
	String studentName;
	
	@Column(name = "section")
	String section;
	
	@Column(name = "subjects")
	String subjects;
	
	@Column(name = "dob")
	String dateOfBirth;
	
	@Column(name = "gender")
	String gender;
	
	

}
