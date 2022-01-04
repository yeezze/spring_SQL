package com.example.database.repository.university;

import com.example.database.domain.university.ProfessorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessorRepository extends JpaRepository<ProfessorEntity, String> {

    @Override
    @Query(
            value = "SELECT * FROM PROFESSOR",
            nativeQuery = true
    )
    List<ProfessorEntity> findAll();

    @Query(
            value = "SELECT COUNT(PNO) FROM PROFESSOR ",
            nativeQuery = true
    )
    int countAll();
}
