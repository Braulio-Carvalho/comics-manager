package com.orangetalents.comicsmanager.controller;

import com.orangetalents.comicsmanager.dto.ComicsRequestDTO;
import com.orangetalents.comicsmanager.service.ComicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comics")
public class ComicsController {

    @Autowired
    private ComicsService comicsService;


    @PostMapping("{userId}")
    public ResponseEntity<?> comicsMavelId(@PathVariable Long userId, @RequestBody ComicsRequestDTO comicsRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(comicsService.createComics(userId, comicsRequestDTO.getComicsId()));
    }
}
