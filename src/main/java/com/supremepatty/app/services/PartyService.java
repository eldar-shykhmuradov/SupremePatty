package com.supremepatty.app.services;

import com.supremepatty.app.models.requests.PartiesSearchFilter;
import com.supremepatty.app.models.requests.PartyRequest;
import com.supremepatty.app.models.responses.PartiesResponse;
import com.supremepatty.app.models.responses.PartyResponse;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class PartyService {

    public PartiesResponse getParties(PartiesSearchFilter searchFilter) {

        return null;
    }

    public PartiesResponse getFavoriteParties() {
        return null;
    }

    public PartyResponse getPartyById(String id) {
        return null;
    }

    public PartyResponse createParty(PartyRequest request) {
        return null;
    }

    public void addPartyToFavorites(String id) {

    }

    public void removePartyFromFavorites(String id) {

    }
}
