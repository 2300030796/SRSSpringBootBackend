package com.klef.fsd.springboot.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "timetable_table")
public class Timetable
{
    @Id
    @Column
    private int Facultyid;

    @Column(nullable = false)
    private String department;

    @Column(nullable = false)
    private String facultyName;

    @Column(nullable = false)
    private String weekDay; // e.g., Monday, Tuesday

    @Column(nullable = false)
    private String sessionTime; // e.g., 10:00 AM - 11:00 AM

    @Column(nullable = false)
    private String subject;
  
    // Getters and Setters
    

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    public String getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(String sessionTime) {
        this.sessionTime = sessionTime;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

	public int getFacultyid() {
		return Facultyid;
	}

	public void setFacultyid(int facultyid) {
		Facultyid = facultyid;
	}

	
	
}