package com.example.database.domain.company;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "CONTAINS")
@IdClass(ContainsId.class)
@Getter
@Setter
@Builder
public class ContainsEntity {
    @Id
    @Column(name = "BASKETID")
    private String basketid;

    @Id
    @Column(name = "ISBN")
    private String isbn;

    @Column(name = "NUM")
    private String num;
}
