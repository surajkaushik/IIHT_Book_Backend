package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.services.IStudentService;

@RestController
public class StudentController {

	@Autowired
	IStudentService istudentService;
	
	@PostMapping("/addstudent")
	Integer createStudent(@RequestBody Student student) {
		Integer id= istudentService.saveStudent(student);
		System.out.println(id);
		return id;
		
	}
}
