package com.klef.fsd.springboot.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.fsd.springboot.project.model.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Integer> {
    Faculty findByUsernameAndPassword(String username, String password);
}
