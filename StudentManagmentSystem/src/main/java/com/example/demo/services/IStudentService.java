package com.example.demo.services;

import java.util.Optional;

import com.example.demo.entity.Student;

public interface IStudentService {
	
	Integer saveStudent (Student student);
	
	Optional<Student> getStudent(Integer id);

}
