package com.example.database.domain.company;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "STOCKS")
@IdClass(StocksId.class)
@Getter
@Setter
@Builder
public class StocksEntity {
    @Id
    @Column(name = "ISBN")
    private String isbn;

    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name = "NUM")
    private String num;
}
