package com.example.gamepalsapi.controller;

import com.example.gamepalsapi.entity.User;
import com.example.gamepalsapi.payload.CreateUserRequest;
import com.example.gamepalsapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "create")
    private User create(@RequestBody CreateUserRequest request){
        return userService.create(request);
    }

    @GetMapping(path = "get")
    private User get(@RequestParam String username){
        return userService.findByUsername(username);
    }
}
