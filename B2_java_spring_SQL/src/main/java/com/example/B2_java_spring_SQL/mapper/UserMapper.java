package com.example.B2_java_spring_SQL.mapper;

import com.example.B2_java_spring_SQL.dto.request.UserCreationRequest;
import com.example.B2_java_spring_SQL.dto.request.UserUpdateRequest;
import com.example.B2_java_spring_SQL.dto.response.UserResponse;
import com.example.B2_java_spring_SQL.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);

}

