package com.orangetalents.comicsmanager.service.serviceImpl;

import com.orangetalents.comicsmanager.service.ComicsService;
import com.orangetalents.comicsmanager.service.serviceImpl.MethodsServiceImpl;
import com.orangetalents.comicsmanager.utils.client.MarvelClient;
import com.orangetalents.comicsmanager.dto.ComicsDTO;
import com.orangetalents.comicsmanager.dto.MarvelResponseDTO;
import com.orangetalents.comicsmanager.dto.UserListComicsDTO;
import com.orangetalents.comicsmanager.excepion.UserNotFoundException;
import com.orangetalents.comicsmanager.model.Comics;
import com.orangetalents.comicsmanager.model.User;
import com.orangetalents.comicsmanager.repository.ComicsRepository;
import com.orangetalents.comicsmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import static com.orangetalents.comicsmanager.utils.Const.*;

@Service
public class ComicsServiceImpl implements ComicsService {

    @Autowired
    private MarvelClient marvelClient;
    @Autowired
    private ComicsRepository comicsRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MethodsServiceImpl methodsServiceImpl;

    public Comics createComics(Long id, Long comicsId) {

        User user = userRepository.findById(id).orElseThrow(UserNotFoundException::new);
        MarvelResponseDTO response = marvelClient.comics(comicsId, TS, API_KEY, HASH);
        ComicsDTO comicsDTO = response.getData().getResults().get(0);
        char lastChar = comicsDTO.getIsbn().charAt(comicsDTO.getIsbn().length() - 1);

        methodsServiceImpl.lastChar(lastChar);
        Comics comics = new Comics(
                comicsDTO.getId(),
                methodsServiceImpl.discountDay,
                comicsDTO.getTitle(),
                comicsDTO.getPrices().get(0).getPrice(),
                "",
                comicsDTO.getIsbn(),
                comicsDTO.getDescription(),
                user
        );
        return comicsRepository.save(comics);
    }

    public UserListComicsDTO getUserComicList(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
        List<Comics> userComicList = comicsRepository.findAllByUserId(userId);
        UserListComicsDTO userListComicsDTO = new UserListComicsDTO(user, userComicList);

        BigDecimal discount = BigDecimal.valueOf(0.9);
        for (Comics comics : userComicList) {
            if (comics.isActiveDiscount()) {
                BigDecimal newPrice = comics.getPrice().multiply(discount);
                newPrice = newPrice.setScale(2, RoundingMode.HALF_UP);
                comics.setPrice(newPrice);

            }
        }

        return userListComicsDTO;
    }

}