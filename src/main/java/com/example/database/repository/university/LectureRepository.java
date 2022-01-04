package com.example.database.repository.university;

import com.example.database.domain.university.LectureEntity;
import com.example.database.domain.university.LectureId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LectureRepository extends JpaRepository<LectureEntity, LectureId> {

    @Override
    @Query(
            value = "SELECT * FROM LECTURE",
            nativeQuery = true
    )
    List<LectureEntity> findAll();

    // 1-a
    @Query(
            value = "SELECT COUNT(PNO) FROM LECTURE",
            nativeQuery = true
    )
    int countAll();

    // 1-g
    @Query(
            value = "select count(pno), c.dept_name\n" +
                    "from lecture l\n" +
                    "JOIN course c\n" +
                    "on l.course_id = c.course_id group by c.dept_name",
            nativeQuery = true
    )
    List<Object[]> countLec();
}
