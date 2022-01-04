package com.example.database.domain.university;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name="ENROLL")
@IdClass(EnrollId.class)
@Getter
@Setter
@Builder
public class EnrollEntity {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "GRADE")
    private String grade;

    @Column(name = "EXAM")
    private int exam;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COURSE_ID")
    private CourseEntity courseEntity;
}
