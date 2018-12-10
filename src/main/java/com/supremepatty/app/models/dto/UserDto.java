package com.supremepatty.app.models.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserDto extends SimpleUserDto {

    private String firstName;
    private String lastName;
    private String vk;
    private String instagram;
    private String telegram;
}
