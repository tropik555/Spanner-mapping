package com.example.test;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.UUID;

@Data
@Entity(name = "userr")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String userId= UUID.randomUUID().toString();

    @Column(nullable = false)
    @Size(max = 45)
    String login;

    @Column(nullable = false)
    @Size(max = 25)
    String password;

}
