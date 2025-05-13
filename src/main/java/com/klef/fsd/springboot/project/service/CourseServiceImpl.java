package com.klef.fsd.springboot.project.service;
import com.klef.fsd.springboot.project.model.Courses;
import com.klef.fsd.springboot.project.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public String addCourse(Courses course) {
        courseRepository.save(course);
        return "Course Added Successfully";
    }
}
