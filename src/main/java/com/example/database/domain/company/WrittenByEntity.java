package com.example.database.domain.company;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "WRITTEN_BY")
@IdClass(WrittenById.class)
@Getter
@Setter
@Builder
public class WrittenByEntity {
    @Id
    @Column(name = "NAME")
    private String name;

    @Id
    @Column(name = "ADDRESS")
    private String address;

    @Id
    @Column(name = "ISBN")
    private String isbn;

}
