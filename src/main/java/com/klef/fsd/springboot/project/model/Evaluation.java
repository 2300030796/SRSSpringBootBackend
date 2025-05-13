package com.klef.fsd.springboot.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Evaluation_table")
public class Evaluation {
	@Id
	
    @Column(name="Studentid")
    private int Studentid;
    @Column(length = 50,nullable = false)
    private String studentname;
    @Column(length = 10,nullable = false)
    private String Section;
    @Column(length = 20,nullable = false,unique=true)
    private String Subject;
    @Column(length = 50,nullable = false)
    private String examtype;
    @Column
    private int marksobtained;
    

    
    
	public int getStudentid() {
		return Studentid;
	}
	public void setStudentid(int studentid) {
		Studentid = studentid;
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
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getExamtype() {
		return examtype;
	}
	public void setExamtype(String examtype) {
		this.examtype = examtype;
	}
	public int getMarksobtained() {
		return marksobtained;
	}
	public void setMarksobtained(int marksobtained) {
		this.marksobtained = marksobtained;
	}
}