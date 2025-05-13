// ExamScheduleService.java
package com.klef.fsd.springboot.project.service;

import com.klef.fsd.springboot.project.model.ExamSchedule;
import java.util.List;

public interface ExamScheduleService {
    ExamSchedule addExam(ExamSchedule exam);
    List<ExamSchedule> getAllExams();
}
