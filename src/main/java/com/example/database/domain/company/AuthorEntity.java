package com.example.database.domain.company;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "AUTHOR")
@IdClass(AuthorId.class)
@Getter
@Setter
@Builder
public class AuthorEntity {

    @Id
    @Column(name = "NAME")
    private String name;

    @Id
    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "URL")
    private String url;
}
