package com.example.database.service.university;

import com.example.database.domain.university.CourseEntity;
import com.example.database.repository.university.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    // 1-a
    public List<CourseEntity> findAll() {
        return courseRepository.findAll();
    }

    public int countAll() {
        return courseRepository.countAll();
    }

    // 1-b
    public List<Object[]> findByIdwithenroll(String id) {
        return courseRepository.findByIdwithenroll(id);
    }

    // 1-e
    public List<Object[]> examStu() {
        return courseRepository.examStu();
    }
}
