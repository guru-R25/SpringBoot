package com.example.demo.repository;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Student;

@Service
public interface HelloRepository {
	void addStudentRepository(Student student);

}
