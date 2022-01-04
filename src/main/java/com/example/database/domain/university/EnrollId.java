package com.example.database.domain.university;

import com.example.database.domain.university.CourseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnrollId  implements Serializable {
    private String id;
    private CourseEntity courseEntity;

}
