package com.orangetalents.comicsmanager.service;

import com.orangetalents.comicsmanager.client.MarvelClient;
import com.orangetalents.comicsmanager.dto.ComicsDTO;
import com.orangetalents.comicsmanager.dto.MarvelResponseDTO;
import com.orangetalents.comicsmanager.model.Comics;
import com.orangetalents.comicsmanager.repository.ComicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComicsService {

    @Autowired
    private MarvelClient marvelClient;

    @Autowired
    private ComicsRepository comicsRepository;

    public Comics createComics(Long comicsId) {

        MarvelResponseDTO response = marvelClient.comics(comicsId, "1", "4bed1697092faffe577408c94de335e3", "a763e1d818f7cfe0cb14ed75da52c045");

        ComicsDTO comicsDTO = response.getData().getResults().get(0);

        Comics comics = new Comics(
                comicsDTO.getId(),
                "",
                false,
                comicsDTO.getTitle(),
                comicsDTO.getPrices().get(0).getPrice(),
                "",
                comicsDTO.getIsbn(),
                comicsDTO.getDescription(),
                null
        );
        return comicsRepository.save(comics);
    }
}
