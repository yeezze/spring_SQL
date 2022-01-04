package com.example.database.domain.university;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name="STUDENT")
@Getter
@Setter
@Builder
public class StudentEntity {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DEPT_NAME")
    private String deptName;

    @Column(name = "TOT_CRED")
    private String tot;
}
