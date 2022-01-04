package com.example.database.repository.university;

import com.example.database.domain.university.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, String> {

    @Override
    @Query(
            value = "SELECT * FROM COURSE",
            nativeQuery = true
    )
    List<CourseEntity> findAll();

    // 1-a)
    @Query(
            value = "SELECT COUNT(COURSE_ID) FROM COURSE",
            nativeQuery = true
    )
    int countAll();

    // 1-b)
    @Query(
            value = "SELECT c.TITLE, c.CREDITS, e.EXAM FROM COURSE c JOIN ENROLL e ON c.COURSE_ID=e.COURSE_ID where e.ID = :id",
            nativeQuery = true
    )
    List<Object[]> findByIdwithenroll(@Param("id") String id);

    // 1-e)
    @Query(
            value = "select e.id, sum(c.credits), avg(e.exam)\n" +
                    "from course c join enroll e\n" +
                    "on c.course_id = e.course_id\n" +
                    "group by e.id",
            nativeQuery = true
    )
    List<Object[]> examStu();
}
