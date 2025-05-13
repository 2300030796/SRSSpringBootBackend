package com.klef.fsd.springboot.project.repository;
import com.klef.fsd.springboot.project.model.Courses;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Courses, Integer> {
}
