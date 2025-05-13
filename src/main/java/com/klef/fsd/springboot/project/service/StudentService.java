package com.klef.fsd.springboot.project.service;

import com.klef.fsd.springboot.project.model.Student;

public interface StudentService {
    String addStudent(Student student);
    Student studentLogin(String username, String password);
}
