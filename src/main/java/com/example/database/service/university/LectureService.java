package com.example.database.service.university;

import com.example.database.domain.university.LectureEntity;
import com.example.database.repository.university.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LectureService {
    @Autowired
    private LectureRepository lectureRepository;

    // 1-a
    public List<LectureEntity> findAll() {
        return lectureRepository.findAll();
    }

    public int countAll() {
        return lectureRepository.countAll();
    }

    // 1-g
    public List<Object[]> countLec() {
        return lectureRepository.countLec();
    }
}
