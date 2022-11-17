package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.IStudentRepository;

@Service
public class StudentService implements IStudentService{

	@Autowired
	IStudentRepository iStudentRepository;
	
	@Override
	public Integer saveStudent(Student student) {
		Student savedStuednt=iStudentRepository.save(student);
		return savedStuednt.getsId();	
	}

	@Override
	public Optional<Student> getStudent(Integer id) {
		return iStudentRepository.findById(id);
	}

}
