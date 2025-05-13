package com.klef.fsd.springboot.project.service;

import com.klef.fsd.springboot.project.model.Admin;
import com.klef.fsd.springboot.project.model.Faculty;

public interface AdminService {

	Admin adminlogin(String username, String password);

	String Addadmin(Admin a);
	 

	
	
}
