package com.example.test;

import lombok.Data;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.Size;
import java.util.Objects;

@Data
@Entity
@PrimaryKeyJoinColumn(name = "patient_id")
public class Patient extends User {

    @Column(nullable = false, unique = true)
    @Size(max = 45)
    private String insuranceNumber;


}
