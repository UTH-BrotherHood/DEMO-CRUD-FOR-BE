package com.example.B2_java_spring_SQL.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {
    String id;

    String username;
    String password;
    String phoneNumber;
    String role;
    LocalDateTime createAt;
    LocalDateTime updateAt;
}
