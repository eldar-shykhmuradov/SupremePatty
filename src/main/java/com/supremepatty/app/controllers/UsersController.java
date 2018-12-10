package com.supremepatty.app.controllers;

import com.supremepatty.app.models.requests.ProfileRequest;
import com.supremepatty.app.models.responses.PartiesResponse;
import com.supremepatty.app.models.responses.PartyResponse;
import com.supremepatty.app.models.responses.UserResponse;
import com.supremepatty.app.services.UserService;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Data
@RequestMapping("/users")
@Slf4j
public class UsersController {

    private final UserService userService;

    @ApiOperation(value = "Get user by id", response = UserResponse.class)
    @GetMapping("/{id}")
    public ResponseEntity<Object> getUserById(@PathVariable Long id) {
        return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
    }

    @ApiOperation(value = "Update user by id", response = UserResponse.class)
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateUserById(@PathVariable Long id, @Valid @RequestBody ProfileRequest request) {
        return new ResponseEntity<>(userService.updateUser(id, request), HttpStatus.OK);
    }
}
