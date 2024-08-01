package com.example.B2_java_spring_SQL.mapper;

import com.example.B2_java_spring_SQL.dto.request.UserCreationRequest;
import com.example.B2_java_spring_SQL.dto.request.UserUpdateRequest;
import com.example.B2_java_spring_SQL.dto.response.UserResponse;
import com.example.B2_java_spring_SQL.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toUser(UserCreationRequest request) {
        if ( request == null ) {
            return null;
        }

        User user = new User();

        user.setUsername( request.getUsername() );
        user.setPassword( request.getPassword() );
        user.setPhoneNumber( request.getPhoneNumber() );
        user.setRole( request.getRole() );

        return user;
    }

    @Override
    public UserResponse toUserResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponse.UserResponseBuilder userResponse = UserResponse.builder();

        userResponse.id( user.getId() );
        userResponse.username( user.getUsername() );
        userResponse.password( user.getPassword() );
        userResponse.phoneNumber( user.getPhoneNumber() );
        userResponse.role( user.getRole() );
        userResponse.createAt( user.getCreateAt() );
        userResponse.updateAt( user.getUpdateAt() );

        return userResponse.build();
    }

    @Override
    public void updateUser(User user, UserUpdateRequest request) {
        if ( request == null ) {
            return;
        }

        user.setPassword( request.getPassword() );
        user.setPhoneNumber( request.getPhoneNumber() );
        user.setRole( request.getRole() );
    }
}
