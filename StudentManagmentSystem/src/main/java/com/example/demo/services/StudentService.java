package com.example.demo.services;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.exceptionHandler.ResourceNotFoundException;
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

	@Override
	public List<Student> getAllStudents() {
		return iStudentRepository.findAll();
	}

	@Override
	public void deleteStudent(Integer id) {
		iStudentRepository.deleteById(id);
		
	}

	@Override
	public Student updateStudent(Student student, Integer id) {
		Student existingStudent = iStudentRepository.findById(id).orElseThrow(
				()->new ResourceNotFoundException("Student", "ID", id));
		existingStudent.setsName(student.getsName());
		existingStudent.setsEmail(student.getsEmail());
		existingStudent.setStandard(student.getStandard());
		
		iStudentRepository.save(existingStudent);
		
		return existingStudent;
	}

}
