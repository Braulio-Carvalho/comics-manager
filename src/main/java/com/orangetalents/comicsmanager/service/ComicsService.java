package com.orangetalents.comicsmanager.service;

import com.orangetalents.comicsmanager.dto.UserListComicsDTO;
import com.orangetalents.comicsmanager.model.Comics;

public interface ComicsService {

    Comics createComics(Long id, Long comicsId);

    UserListComicsDTO getUserComicList(Long userId);
}
