package com.orangetalents.comicsmanager.dto;

import java.math.BigDecimal;

public class PriceDTO {

    private String type;
    private BigDecimal price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
