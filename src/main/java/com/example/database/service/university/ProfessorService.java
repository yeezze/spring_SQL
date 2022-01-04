package com.example.database.service.university;

import com.example.database.domain.university.ProfessorEntity;
import com.example.database.repository.university.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    public List<ProfessorEntity> findAll() {return professorRepository.findAll();}

    // 투플 총 갯수 출력
    public int countAll() {return professorRepository.countAll();}
}
