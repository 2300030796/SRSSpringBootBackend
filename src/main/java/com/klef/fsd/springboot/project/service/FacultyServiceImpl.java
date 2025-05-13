package com.klef.fsd.springboot.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsd.springboot.project.model.Faculty;
import com.klef.fsd.springboot.project.repository.FacultyRepository;

@Service
public class FacultyServiceImpl implements FacultyService{

	@Autowired
	private FacultyRepository fr;
	@Override
	public Faculty Facultylogin(String u, String p) {
		return	fr.findByUsernameAndPassword(u, p);

	}
	@Override
	public String Addfaculty(Faculty f) {
		fr.save(f);
	
		return "Added";
	}
	@Override
	public List<Faculty> displayfaculty() {
	    return fr.findAll();  // ✅ Fix: call from repository instance `fr`, not class name
	}

}
