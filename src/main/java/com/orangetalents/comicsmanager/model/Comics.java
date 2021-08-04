package com.orangetalents.comicsmanager.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table
public class Comics {

    //ComicId, Título, Preço, Autores, o ISBN e Descrição
    @Id
    private Long comicId;

    private String discountDay;

    private boolean activeDiscount;

    private String title;

    private BigDecimal price;

    private String Author;

    private String isbn;

    private String description;

    @ManyToOne
    private User user;
}
