package com.klef.fsd.springboot.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsd.springboot.project.model.Student;
import com.klef.fsd.springboot.project.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepo;

    @Override
    public Student studentLogin(String username, String password) {
        return studentRepo.findByUsernameAndPassword(username, password);
    }

    @Override
    public String addStudent(Student student) {
        studentRepo.save(student);
        return "Student Added Successfully";
    }
}
