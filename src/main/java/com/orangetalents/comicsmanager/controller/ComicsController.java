package com.orangetalents.comicsmanager.controller;

import com.orangetalents.comicsmanager.client.MarvelClient;
import com.orangetalents.comicsmanager.dto.MarvelResponseDTO;
import com.orangetalents.comicsmanager.service.ComicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comics")
public class ComicsController {

    @Autowired
    private MarvelClient marvelClient;

    @Autowired
    private ComicsService comicsService;


    @GetMapping
    public ResponseEntity<MarvelResponseDTO> comicsMarvel() {
        MarvelResponseDTO response = marvelClient.comics(1308L, "1", "4bed1697092faffe577408c94de335e3", "a763e1d818f7cfe0cb14ed75da52c045");
        return ResponseEntity.ok(response);
    }

    @PostMapping("{comicsId}")
    public ResponseEntity<?> comicsMavelId(@PathVariable Long comicsId) {
//        MarvelResponseDTO response = marvelClient.comics(comicsId, "1", "4bed1697092faffe577408c94de335e3", "a763e1d818f7cfe0cb14ed75da52c045");
        return ResponseEntity.status(HttpStatus.CREATED).body(comicsService.createComics(comicsId));
    }


}
