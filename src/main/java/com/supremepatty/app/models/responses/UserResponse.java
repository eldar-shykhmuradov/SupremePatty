package com.supremepatty.app.models.responses;

import com.supremepatty.app.models.dto.UserDto;
import lombok.Data;

@Data
public class UserResponse {

    private final UserDto user;
}
