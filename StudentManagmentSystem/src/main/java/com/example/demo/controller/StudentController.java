package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/student/{id}")
	public Optional<Student> findStudent(@PathVariable Integer id) {
		Optional<Student> s=istudentService.getStudent(id);
		return s;
	}
	
	@GetMapping("/allstudents")
	List<Student> allStudents(){
		return istudentService.getAllStudents();
	}
	
//	@DeleteMapping("/delete/{id}")
//	public void delelteStudent(@PathVariable Integer id) {
//		istudentService.deleteStudent(id);
//	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<Student> deleteStudent(@PathVariable Integer id){
		ResponseEntity<Student> re= new ResponseEntity<>(HttpStatus.OK);
		try {
			istudentService.deleteStudent(id);
		}catch(Exception e) {
			e.printStackTrace();
			re=new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
		return re;
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable(name = "id") Integer id,@RequestBody Student student){
		return new ResponseEntity<Student>(istudentService.updateStudent(student, id), HttpStatus.OK);
	}
}
	
