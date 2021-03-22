package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Student;

@Service
public interface HelloService {
	void addStudent(Student student);
}



