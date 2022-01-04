package com.example.database.domain.university;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity(name="EMP_TEST")
@Builder
public class EmployeeEntity {
    @Id
    private int empno;

    private String ename;
}
