package com.klef.fsd.springboot.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Reports_table")
public class Reports {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(length = 50,nullable = false)
    private String studentname;
    @Column(length = 10,nullable = false)
    private String Section;
    @Column(length = 20,nullable = false,unique=true)
    private String Date;
    @Column(length = 50,nullable = false)
    private String Grade;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getstudentname() {
		return studentname;
	}
	public void setstudentname(String studentname) {
		studentname = studentname;
	}
	public String getSection() {
		return Section;
	}
	public void setSection(String section) {
		Section = section;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
}