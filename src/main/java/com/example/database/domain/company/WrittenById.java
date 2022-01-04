package com.example.database.domain.company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WrittenById implements Serializable {
    private String name;
    private String address;
    private String isbn;
}
