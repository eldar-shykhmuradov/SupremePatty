package com.supremepatty.app.services;

import com.supremepatty.app.models.requests.ProfileRequest;
import com.supremepatty.app.models.responses.UserResponse;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserResponse getUserById(Long userId) {
        return new UserResponse(null);
    }

    public UserResponse updateUser(Long id, ProfileRequest request) {
        return new UserResponse(null);
    }
}
