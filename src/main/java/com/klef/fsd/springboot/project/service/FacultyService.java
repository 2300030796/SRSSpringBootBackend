package com.klef.fsd.springboot.project.service;

import java.util.List;

import com.klef.fsd.springboot.project.model.Faculty;

public interface FacultyService {
	public Faculty Facultylogin(String u,String p);
	public String Addfaculty(Faculty f);
	 
	  public List<Faculty> displayfaculty();
	  
}
