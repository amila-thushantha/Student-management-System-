package com.studentCrud.practice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


    @Entity
    @Table(name = "student")
    @Getter @Setter


    public class Student{



        @Id
        @GeneratedValue( strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        private int age;

        private String email;


    }


