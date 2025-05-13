package com.klef.fsd.springboot.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.fsd.springboot.project.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String>  {
 Admin findByUsernameAndPassword(String username, String password);
}
