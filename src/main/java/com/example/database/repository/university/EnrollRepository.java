package com.example.database.repository.university;

import com.example.database.domain.university.EnrollEntity;
import com.example.database.domain.university.EnrollId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrollRepository extends JpaRepository<EnrollEntity, EnrollId> {

    // 1-a
    @Override
    @Query(
            value = "SELECT * FROM ENROLL",
            nativeQuery = true
    )
    List<EnrollEntity> findAll();

    @Query(
            value = "SELECT COUNT(ID) FROM ENROLL",
            nativeQuery = true
    )
    int countAll();

    // 1-f
    @Query(
            value = "select avg(exam), course_id from enroll\n" +
                    "group by course_id",
            nativeQuery = true
    )
    List<Object[]> avgCourse();

    @Query(
            value = "select count(id), grade from enroll\n" +
                    "group by grade",
            nativeQuery = true
    )
    List<Object[]> gradeStu();
}
