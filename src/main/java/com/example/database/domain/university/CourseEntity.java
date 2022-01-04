package com.example.database.domain.university;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "COURSE")
@Getter
@Setter
@Builder
public class CourseEntity {
    @Id
    @Column(name = "COURSE_ID")
    private String courseId;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DEPT_NAME")
    private String deptName;

    @Column(name = "CREDITS")
    private int credits;

    @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "courseEntity")
    private List<EnrollEntity> enrollEntities = new ArrayList<>();
}
