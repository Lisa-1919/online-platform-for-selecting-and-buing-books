package com.example.onlinestore.models;

import java.io.Serializable;
import java.util.List;

public class Product implements Serializable {
    private Long id;
    private String name;
    private String category;
    private double evaluation;
    private String description;
    private double price;
    private int orderQuantity;
    private int stockQuantity;
    private String seller;
    private List<String> images;

    public Product() {
    }

    public Product(Long id, String name, String category, double evaluation, String description, double price,
                   int orderQuantity, int stockQuantity, String seller, List<String> images) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.evaluation = evaluation;
        this.description = description;
        this.price = price;
        this.orderQuantity = orderQuantity;
        this.stockQuantity = stockQuantity;
        this.seller = seller;
        this.images = images;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(double evaluation) {
        this.evaluation = evaluation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}
