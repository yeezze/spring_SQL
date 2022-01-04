package com.example.database.domain.company;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "WAREHOUSE")
@Getter
@Setter
@Builder
public class WarehouseEntity {
    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "PHONE")
    private String phone;
}
