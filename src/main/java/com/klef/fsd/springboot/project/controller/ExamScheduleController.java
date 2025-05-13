package com.klef.fsd.springboot.project.controller;

import com.klef.fsd.springboot.project.model.ExamSchedule;
import com.klef.fsd.springboot.project.service.ExamScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exam")
@CrossOrigin("*")
public class ExamScheduleController {

    @Autowired
    private ExamScheduleService examService;

    @PostMapping("/add")
    public ResponseEntity<ExamSchedule> addExam(@RequestBody ExamSchedule exam) {
        return ResponseEntity.ok(examService.addExam(exam));
    }

    @GetMapping("/all")
    public ResponseEntity<List<ExamSchedule>> getAllExams() {
        return ResponseEntity.ok(examService.getAllExams());
    }
}
