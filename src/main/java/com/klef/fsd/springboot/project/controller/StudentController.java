package com.klef.fsd.springboot.project.controller;

import com.klef.fsd.springboot.project.model.Student;
import com.klef.fsd.springboot.project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentController {

    @Autowired
    private StudentService studentService;

    
    
    @PostMapping("/add")
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        try {
            String response = studentService.addStudent(student);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Failed to add student: " + e.getMessage());
        }
    }
    @PostMapping("/login")
    public ResponseEntity<?> studentLogin(@RequestBody Student s) {
        Student student = studentService.studentLogin(s.getUsername(), s.getPassword());
        if (student != null) {
            return ResponseEntity.ok(student);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
        }
    }
    
}
