package com.example.database.domain.university;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name="LECTURE")
@IdClass(LectureId.class)
@Getter
@Setter
@Builder
public class LectureEntity {
    @Id
    @Column(name = "COURSE_ID")
    private String courseId;

    @Id
    @Column(name = "PNO")
    private String pno;

    @Column(name = "LEC_TIME")
    private String lecTime;

    @Column(name = "ROOM")
    private String room;
}
