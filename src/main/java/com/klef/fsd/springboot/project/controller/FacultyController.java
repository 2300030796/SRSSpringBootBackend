package com.klef.fsd.springboot.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.klef.fsd.springboot.project.model.Faculty;
import com.klef.fsd.springboot.project.service.FacultyService;
import com.klef.fsd.springboot.project.service.FacultyServiceImpl;
@RestController
@CrossOrigin("*")
public class FacultyController {

    @Autowired
    private FacultyServiceImpl fs;

    @PostMapping("/addfaculty")
    public String addfaculty(@RequestBody Faculty f) {
        return fs.Addfaculty(f);
    }

    @PostMapping("/faclogin")
    public ResponseEntity<?> facultyLogin(@RequestBody Faculty f) {
        Faculty faculty = fs.Facultylogin(f.getUsername(), f.getPassword());

        if (faculty != null) {
            return ResponseEntity.ok(faculty); // Return full faculty object
        } else {
            return ResponseEntity.status(404).body("Invalid Username or Password");
        }
    }
    @GetMapping("/viewallfaculty")
    public ResponseEntity<List<Faculty>> viewAllFaculty() {
        List<Faculty> facultyList = fs.displayfaculty();
        return ResponseEntity.ok(facultyList);
    }
	  
	
}
