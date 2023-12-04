package com.example.webservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class MyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private int age;
    private double income;

    public MyUser(String name, String surname, int age, double income){
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.income = income;
    }

}
