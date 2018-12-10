package com.supremepatty.app.models.requests;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class PartyRequest {

    @NotNull
    private Double latitude;
    @NotNull
    private Double longitude;
    @NotBlank
    private String addressName;
    @NotBlank
    private String description;
    @NotEmpty
    private List<String> imageUrls;
}
