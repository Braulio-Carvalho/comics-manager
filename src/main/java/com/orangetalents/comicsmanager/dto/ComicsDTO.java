package com.orangetalents.comicsmanager.dto;

import java.util.List;

public class ComicsDTO {

    private Long id;
    private String title;
    private String description;
    private String isbn;
    private List<PriceDTO> prices;
    private CreatorsDTO creators;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public List<PriceDTO> getPrices() {
        return prices;
    }

    public void setPrices(List<PriceDTO> prices) {
        this.prices = prices;
    }

    public CreatorsDTO getCreators() {
        return creators;
    }

    public void setCreators(CreatorsDTO creators) {
        this.creators = creators;
    }


}
