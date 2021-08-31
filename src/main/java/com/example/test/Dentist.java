package com.example.test;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.Size;

@Data
@Entity
@PrimaryKeyJoinColumn(name = "dentist_id")
public class Dentist extends User {

    @Column(nullable = false)
    @Size(max = 25)
    String books;
}
