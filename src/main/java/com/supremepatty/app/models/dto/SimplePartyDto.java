package com.supremepatty.app.models.dto;

import lombok.Data;

import java.util.List;

@Data
public class SimplePartyDto {

    private Long id;
    private AddressDto address;
    private String description;
    private List<String> imageUrls;
    private Boolean favorite;
    private SimpleUserDto userDto;

}
