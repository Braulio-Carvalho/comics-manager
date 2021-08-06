package com.orangetalents.comicsmanager.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;

@Entity
public class Comics {
    @Id
    private Long id;
    @Enumerated(EnumType.STRING)
    private DayOfWeek discountDay;
    private String title;
    private BigDecimal price;
    private String Author;
    private String isbn;
    @Column(length = 5000)
    private String description;
    @ManyToOne
    private User user;

    public Comics(Long id, DayOfWeek discountDay, String title, BigDecimal price,
                  String author, String isbn, String description, User user) {
        this.id = id;
        this.discountDay = discountDay;
        this.title = title;
        this.price = price;
        Author = author;
        this.isbn = isbn;
        this.description = description;
        this.user = user;
    }

    public Comics() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long comicId) {
        this.id = comicId;
    }
    public DayOfWeek getDiscountDay() {
        return discountDay;
    }
    public void setDiscountDay(DayOfWeek discountDay) {
        this.discountDay = discountDay;
    }
    public boolean isActiveDiscount() {
        return LocalDate.now().getDayOfWeek() == this.discountDay;
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
