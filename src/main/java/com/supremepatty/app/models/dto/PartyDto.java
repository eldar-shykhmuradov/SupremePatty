package com.supremepatty.app.models.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
public class PartyDto extends SimplePartyDto {

    private Boolean requestSent;

}
