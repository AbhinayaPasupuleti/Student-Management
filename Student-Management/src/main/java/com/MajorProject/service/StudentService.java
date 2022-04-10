package com.MajorProject.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MajorProject.model.Student;
import com.MajorProject.repo.StudentRepo;


@Service


public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo;
	
	public List<Student> getStudents() {
		return studentRepo.findAll();
	}

	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}

	public Student deleteStudent(Integer studId) {
		studentRepo.deleteById(studId);
		return null;
	}

	public Student getStudent(Integer studId) {
		return studentRepo.findById(studId).get();
	}

	public Student updateStudent(Integer studId, Student student) {
		Student studentFound = studentRepo.findById(studId).get();
		studentFound.setFirstName(student.getFirstName());
		studentFound.setAge(student.getAge());
		return studentRepo.save(studentFound);
	}

}
