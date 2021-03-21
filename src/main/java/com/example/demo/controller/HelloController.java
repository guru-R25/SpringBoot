package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Student;
 
@RestController
public class HelloController {
 
	/*
	 * @RequestMapping("/hello") public String hello() { return
	 * "Hello World RESTful with Spring Boot";
	 * 
	 * // Response.status(200).entity("helloworld").build(); }
	 */ 
    
    @RequestMapping(value ="/insertData",method = RequestMethod.POST, produces = "application/json")
    public Student insertData(Student student) {
    	//Student student=null;
    	System.out.println("<--coming inside-->"+student);
    	return student;
    }
}



