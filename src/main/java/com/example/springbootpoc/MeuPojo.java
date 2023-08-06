package com.example.springbootpoc;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MeuPojo {

    @MyAnnotation(value = "id", min = 100, max = 1000)
    private Long id;
    @MyAnnotation(value = "name", min = 100, max = 1000, withTrim = true)
    private String name;
    @MyAnnotation(value = "birthdate", min = 100, max = 1000)
    private LocalDate birthdate;

}
