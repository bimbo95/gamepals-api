package com.example.gamepalsapi.repository;

import com.example.gamepalsapi.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

}
