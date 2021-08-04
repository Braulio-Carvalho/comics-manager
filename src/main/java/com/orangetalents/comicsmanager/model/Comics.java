package com.orangetalents.comicsmanager.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table
public class Comics {

    public Comics(Long id, String discountDay, boolean activeDiscount, String title, BigDecimal price, String author, String isbn, String description, User user) {
        this.id = id;
        this.discountDay = discountDay;
        this.activeDiscount = activeDiscount;
        this.title = title;
        this.price = price;
        Author = author;
        this.isbn = isbn;
        this.description = description;
        this.user = user;
    }

    public Comics() {
    }


    @Id
    private Long id;

    private String discountDay;

    private boolean activeDiscount;

    private String title;

    private BigDecimal price;

    private String Author;

    private String isbn;

    @Column(length = 5000)
    private String description;


    @ManyToOne
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long comicId) {
        this.id = comicId;
    }

    public String getDiscountDay() {
        return discountDay;
    }

    public void setDiscountDay(String discountDay) {
        this.discountDay = discountDay;
    }

    public boolean isActiveDiscount() {
        return activeDiscount;
    }

    public void setActiveDiscount(boolean activeDiscount) {
        this.activeDiscount = activeDiscount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
