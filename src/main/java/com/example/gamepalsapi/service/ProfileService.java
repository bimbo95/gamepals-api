package com.example.gamepalsapi.service;

import com.example.gamepalsapi.entity.Profile;
import com.example.gamepalsapi.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

        @Autowired
        private ProfileRepository profileRepository;

        public Profile createProfile(Long userId, String firstName, String lastName){
            Profile profile = new Profile();
            profile.setUserId(userId);
            profile.setFirstName(firstName);
            profile.setLastName(lastName);

            profileRepository.save(profile);
            return profile;
        }

        public Profile get(Long userId){
            return profileRepository.findById(userId)
                    .orElse(null);
        }

}
