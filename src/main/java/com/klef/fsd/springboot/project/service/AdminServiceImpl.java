package com.klef.fsd.springboot.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsd.springboot.project.model.Admin;
import com.klef.fsd.springboot.project.model.Faculty;
import com.klef.fsd.springboot.project.repository.AdminRepository;
import com.klef.fsd.springboot.project.repository.FacultyRepository;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepository ar;

	@Override
	public Admin adminlogin(String username, String password) {
		return ar.findByUsernameAndPassword(username, password);
	}

	@Override
	public String Addadmin(Admin a) {
		ar.save(a);
		return "Added";
	}

	

	
}