package com.orangetalents.comicsmanager.repository;

import com.orangetalents.comicsmanager.model.Comics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;





@Repository
public interface ComicsRepository extends JpaRepository<Comics, Long> {

    List<Comics> findAllByUserId(Long id);
}
