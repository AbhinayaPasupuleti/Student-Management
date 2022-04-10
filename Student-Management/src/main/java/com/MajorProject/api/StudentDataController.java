package com.MajorProject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MajorProject.model.Student;
import com.MajorProject.service.StudentService;

@RestController
public class StudentDataController {

	@Autowired
	private StudentService studentService;
	@GetMapping("/students") 
	
	public List<Student> getStudents()
	{
		return studentService.getStudents();
	}
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	@PostMapping("/student/{studId}")
	public Student saveStudent(@PathVariable("studId") Integer studId) {
		return studentService.deleteStudent(studId);
	}
	
	@GetMapping("/student/{studId}")
	public Student getStudent(@PathVariable("studId") Integer studId) {
		return studentService.getStudent(studId);
	}
	
	@PostMapping("/updateStudent/{studId}")
	public Student updateStudent(@PathVariable("studId") Integer studId,@RequestBody Student student) {
		return studentService.updateStudent(studId,student);
	}
}