package com.example.B2_java_spring_SQL.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id // Dinh nghia ID
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    String username;
    String password;
    String phoneNumber;
    String role;
    LocalDateTime createAt;
    LocalDateTime updateAt;
}
