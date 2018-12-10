package com.supremepatty.app.models.requests;

import lombok.Data;

@Data
public class ProfileRequest {

    private String photoUrl;
    private String firstName;
    private String lastName;
    private String vk;
    private String instagram;
    private String telegram;
}
