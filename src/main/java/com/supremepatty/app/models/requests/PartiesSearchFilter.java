package com.supremepatty.app.models.requests;


import lombok.Data;

@Data
public class PartiesSearchFilter {

    private Double longitude;
    private Double latitude;
    private Integer radius;
    private Long userId;
    private Integer number;
    private Integer count;

}
