package com.example.onlinestore.models;

import java.util.List;

public class Basket {

    private Long id;
    private User user;
    private List<Product> productsInBasket;

    public Basket() {
    }

    public Basket(Long id, User user, List<Product> productsInBasket) {
        this.id = id;
        this.user = user;
        this.productsInBasket = productsInBasket;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProductsInBasket() {
        return productsInBasket;
    }

    public void setProductsInBasket(List<Product> productsInBasket) {
        this.productsInBasket = productsInBasket;
    }
}
