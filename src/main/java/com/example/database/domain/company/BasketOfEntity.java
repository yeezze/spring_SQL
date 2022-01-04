package com.example.database.domain.company;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "BASKET_OF")
@IdClass(BasketOfId.class)
@Getter
@Setter
@Builder
public class BasketOfEntity {
    @Id
    @Column(name = "EMAIL")
    private String email;

    @Id
    @Column(name = "BASKETID")
    private String basketid;

}
