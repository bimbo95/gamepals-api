package com.example.gamepalsapi.service;

import com.example.gamepalsapi.entity.Profile;
import com.example.gamepalsapi.entity.User;
import com.example.gamepalsapi.payload.CreateUserRequest;
import com.example.gamepalsapi.repository.ProfileRepository;
import com.example.gamepalsapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProfileService profileService;

    public User create(CreateUserRequest request){
        User user = new User();
        user.setEmail(request.getEmail());
        user.setUsername(request.getUsername());


        userRepository.save(user);
        Profile profile = profileService.createProfile(user.getId(), request.getFirstName(), request.getLastName());
        user.setProfile(profile);
        return user;
    }
    public User findByUsername(String username){
        User user = userRepository.findOneByUsername(username)
                .orElseThrow(RuntimeException::new);

        user.setProfile(profileService.get(user.getId()));
        return user;
    }

}
