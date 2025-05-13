// ExamScheduleServiceImpl.java
package com.klef.fsd.springboot.project.service;

import com.klef.fsd.springboot.project.model.ExamSchedule;
import com.klef.fsd.springboot.project.repository.ExamScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamScheduleServiceImpl implements ExamScheduleService {

    @Autowired
    private ExamScheduleRepository examRepo;

    @Override
    public ExamSchedule addExam(ExamSchedule exam) {
        return examRepo.save(exam);
    }

    @Override
    public List<ExamSchedule> getAllExams() {
        return examRepo.findAll();
    }
}
