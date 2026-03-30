package com.example.project1;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Todo {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    // getters & setters
}