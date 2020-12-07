package com.example.gamepalsapi.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "profile")
public class Profile {

    @Id
    private Long userId;

    private String firstName;

    private String lastName;

    private String bio;


}
