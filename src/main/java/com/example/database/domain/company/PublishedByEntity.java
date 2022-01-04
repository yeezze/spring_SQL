package com.example.database.domain.company;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "PUBLISHED_BY")
@IdClass(PublishedById.class)
@Getter
@Setter
@Builder
public class PublishedByEntity {
    @Id
    @Column(name = "NAME")
    private String name;

    @Id
    @Column(name = "ISBN")
    private String isbn;
}
