package com.MajorProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MajorProject.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
