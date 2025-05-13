package com.klef.fsd.springboot.project.repository;

import com.klef.fsd.springboot.project.model.ExamSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamScheduleRepository extends JpaRepository<ExamSchedule, Integer> {
}
