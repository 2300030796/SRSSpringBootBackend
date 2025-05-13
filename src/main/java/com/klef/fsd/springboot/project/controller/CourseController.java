package com.klef.fsd.springboot.project.controller;
import com.klef.fsd.springboot.project.model.Courses;
import com.klef.fsd.springboot.project.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
@CrossOrigin(origins = "*")  // Allow requests from frontend
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/add")
    public ResponseEntity<String> addCourse(@RequestBody Courses course) {
        try {
            String response = courseService.addCourse(course);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Failed to add course: " + e.getMessage());
        }
    }
}
