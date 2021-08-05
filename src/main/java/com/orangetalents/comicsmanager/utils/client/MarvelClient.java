package com.orangetalents.comicsmanager.utils.client;

import com.orangetalents.comicsmanager.dto.MarvelResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "http://gateway.marvel.com/v1/public/comics", name = "marvel")
public interface MarvelClient {

    @GetMapping("/{id}")
    MarvelResponseDTO comics(@PathVariable Long id,
                             @RequestParam("ts") String ts,
                             @RequestParam("apikey") String apikey,
                             @RequestParam("hash") String hash);
}
