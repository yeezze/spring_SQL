package com.example.database.service.university;

import com.example.database.domain.university.StudentEntity;
import com.example.database.repository.university.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<StudentEntity> findAll() {
        return studentRepository.findAll();
    }

    public StudentEntity save(StudentEntity studentEntity) {
        studentRepository.saveOne(
                studentEntity.getId(),
                studentEntity.getName(),
                studentEntity.getDeptName(),
                studentEntity.getTot()
        );
        return studentEntity;
    }

    // 1-a) tuple 총 갯수 출력
    public int countAll() {return studentRepository.countAll();}

    // 1-d) max
    public List<Object[]> maxCourse() {
        return studentRepository.maxCourse();
    }
    // 1-d) min
    public List<Object[]> minCourse() {
        return studentRepository.minCourse();
    }

    // 1-h
    public List<Object[]> count_1b_dept() {return studentRepository.count_1b_dept();}
    public List<Object[]> count_1b_year() {return studentRepository.count_1b_year();}
}
