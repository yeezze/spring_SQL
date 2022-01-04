package com.example.database.domain.company;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "BOOK")
@Getter
@Setter
@Builder
public class BookEntity {
    @Id
    @Column(name = "ISBN")
    private String isbn;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "YEAR")
    private String year;

    @Column(name = "PRICE")
    private String price;
}
