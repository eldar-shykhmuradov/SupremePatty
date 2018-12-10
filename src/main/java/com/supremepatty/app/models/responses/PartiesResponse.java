package com.supremepatty.app.models.responses;

import com.supremepatty.app.models.dto.PartyDto;
import com.supremepatty.app.models.dto.SimplePartyDto;
import lombok.Data;

import java.util.List;

@Data
public class PartiesResponse {

    private final List<SimplePartyDto> parties;
    private final int partiesCount;
}
