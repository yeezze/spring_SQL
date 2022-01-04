package com.example.database.service.university;

import com.example.database.domain.university.EnrollEntity;
import com.example.database.repository.university.EnrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollService {
    @Autowired
    private EnrollRepository enrollRepository;

    // 1-a
    public List<EnrollEntity> findAll() {
        return enrollRepository.findAll();
    }

    public int countAll() {
        return enrollRepository.countAll();
    }

    // 1-f
    public List<Object[]>  avgCourse() {
        return enrollRepository.avgCourse();
    }
    public List<Object[]> gradeStu() {
        return enrollRepository.gradeStu();
    }


}
