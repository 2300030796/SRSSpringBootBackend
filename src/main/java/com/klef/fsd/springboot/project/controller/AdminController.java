package com.klef.fsd.springboot.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.klef.fsd.springboot.project.model.Admin;
import com.klef.fsd.springboot.project.model.Faculty;
import com.klef.fsd.springboot.project.model.Student;
import com.klef.fsd.springboot.project.repository.StudentRepository;
import com.klef.fsd.springboot.project.service.AdminService;
import com.klef.fsd.springboot.project.service.FacultyService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@CrossOrigin("*")
public class AdminController {

	@Autowired
	public AdminService as;
	
	@Autowired
	public StudentRepository sr;
	@PostMapping("/addadmin")
	public String addadmin(@RequestBody Admin a) {
		return as.Addadmin(a);
	}
	
	
	@PostMapping("/adminlogin")
	public ResponseEntity<?> adminLogin(@RequestBody Admin f) {
	    Admin a = as.adminlogin(f.getUsername(), f.getPassword());

	    if (a != null) {
	        return ResponseEntity.ok(a);
	    } else {
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Username or Password");
	    }
	}
	@GetMapping("/viewallstudents")
	public ResponseEntity<?> viewallstudents() {
		List<Student> l=sr.findAll();
		if (l != null) {
	        return ResponseEntity.ok(l);
	    } else {
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Username or Password");
	    }
	}
	


	
}
