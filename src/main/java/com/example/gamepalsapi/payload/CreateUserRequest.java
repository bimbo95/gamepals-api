package com.example.gamepalsapi.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserRequest {

    private String username;

    private String email;

    private String firstName;

    private String lastName;

}
