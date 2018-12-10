package com.supremepatty.app.controllers;

import com.supremepatty.app.models.requests.PartiesSearchFilter;
import com.supremepatty.app.models.requests.PartyRequest;
import com.supremepatty.app.models.responses.PartiesResponse;
import com.supremepatty.app.models.responses.PartyResponse;
import com.supremepatty.app.services.PartyService;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Slf4j
@Data
@RequestMapping("/parties")
public class PartiesController {

    private final PartyService partyService;


    @ApiOperation(value = "Get list of parties", response = PartiesResponse.class)
    @PostMapping("/list")
    public ResponseEntity<Object> getParties(@Valid @RequestBody PartiesSearchFilter searchFilter) {
        return new ResponseEntity<>(partyService.getParties(searchFilter), HttpStatus.OK);
    }

    @ApiOperation(value = "Get list of favorites parties", response = PartiesResponse.class)
    @GetMapping("/favorites")
    public ResponseEntity<Object> getFavoriteParties() {
        return new ResponseEntity<>(partyService.getFavoriteParties(), HttpStatus.OK);
    }

    @ApiOperation(value = "Get party by id", response = PartyResponse.class)
    @GetMapping("/{id}")
    public ResponseEntity<Object> getPartyById(@PathVariable String id) {
        return new ResponseEntity<>(partyService.getPartyById(id), HttpStatus.OK);
    }

    @ApiOperation(value = "Add party to favorites")
    @PostMapping("/{id}/favorites")
    public ResponseEntity<String> addPartyToFavorite(@PathVariable String id) {
        partyService.addPartyToFavorites(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation(value = "Remove party from favorites")
    @DeleteMapping("/{id}/favorites")
    public ResponseEntity<String> removePartyFromFavorite(@PathVariable String id) {
        partyService.removePartyFromFavorites(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @ApiOperation(value = "Create party", response = PartyResponse.class)
    @PostMapping
    public ResponseEntity<Object> createParty(@Valid @RequestBody PartyRequest request) {
        return new ResponseEntity<>(partyService.createParty(request), HttpStatus.OK);
    }




}
