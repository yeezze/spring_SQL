package com.example.database.repository.university;


import com.example.database.domain.university.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, String> {

    @Override
    @Query(
            value = "SELECT * FROM STUDENT",
            nativeQuery = true
    )
    List<StudentEntity> findAll();

    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO STUDENT(ID, NAME, DEPT_NAME, TOT_CRED) VALUES (:id, :name, :dept_name, :tot_cred)",
            nativeQuery = true
    )
    void saveOne(
            @Param("id") String id,
            @Param("name") String name,
            @Param("dept_name") String dept_name,
            @Param("tot_cred") String tot_cred
    );

    // 1-a) tuple의 총 갯수 출력
    @Query(
            value = "SELECT COUNT(ID) FROM STUDENT",
            nativeQuery = true
    )
    int countAll();

    // 1-h 학과별
    @Query(
            value = "SELECT COUNT(ID), DEPT_NAME FROM STUDENT GROUP BY DEPT_NAME",
            nativeQuery = true
    )
    List<Object[]> count_1b_dept();

    // 1-h 학년별
    @Query(
            value = "SELECT COUNT(ID), YEAR FROM STUDENT GROUP BY YEAR",
            nativeQuery = true
    )
    List<Object[]> count_1b_year();

    // 1-d 과목별 최고 점수
    @Query(
            value = "with en_max(value, course_id) as\n" +
                    "    (select max(e.exam), e.course_id\n" +
                    "    from enroll e\n" +
                    "    group by e.course_id)  \n" +
                    "select s.*, max_id.value, max_id.c_id from student s\n" +
                    "join (     \n" +
                    "    select id, en_max.value value, en_max.course_id c_id\n" +
                    "    from enroll, en_max\n" +
                    "    where enroll.exam = en_max.value \n" +
                    "    and enroll.course_id = en_max.course_id) max_id\n" +
                    "on s.id=max_id.id",
            nativeQuery = true
    )
    List<Object[]> maxCourse();

    // 1-d 과목별 최저 점수
    @Query(
            value = "with en_min(value, course_id) as\n" +
                    "    (select min(e.exam), e.course_id\n" +
                    "    from enroll e\n" +
                    "    group by e.course_id)  \n" +
                    "select s.*, min_id.value, min_id.c_id from student s\n" +
                    "join (     \n" +
                    "    select id, en_min.value value, en_min.course_id c_id\n" +
                    "    from enroll, en_min\n" +
                    "    where enroll.exam = en_min.value \n" +
                    "    and enroll.course_id = en_min.course_id) min_id\n" +
                    "on s.id=min_id.id",
            nativeQuery = true
    )
    List<Object[]> minCourse();
}

