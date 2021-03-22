package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Student;
import com.example.demo.service.HelloService;
 
@RestController
public class HelloController {
 
	/*
	 * @RequestMapping("/hello") public String hello() { return
	 * "Hello World RESTful with Spring Boot";
	 * 
	 * // Response.status(200).entity("helloworld").build(); }
	 */ 
    
	@Autowired
	HelloService hello;
	
	@RequestMapping(value ="/insertData",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Student insertData(@Validated @RequestBody Student student) {
    	//Student student=null;
    	
    	//HttpHeaders headers = new HttpHeaders();
    	//headers.setContentType(MediaType.APPLICATION_JSON);
    	System.out.println("<--coming inside-->"+student.getStudentName());
    	hello.addStudent(student);
    	return student;
    }
}



