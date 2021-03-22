package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dto.Student;
import com.example.demo.repository.HelloRepository;
import com.example.demo.service.HelloService;

public class HelloServiceImpl implements HelloService {
	
	@Autowired
	HelloRepository helloRepo;

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		
		helloRepo.addStudentRepository(student);
	}

}
