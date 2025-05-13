package com.klef.fsd.springboot.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.fsd.springboot.project.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	Student findByUsernameAndPassword(String username, String password);
}
