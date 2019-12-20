package com.example.demo.Model;

public class Product {
    private long id;
    private String name;
    private double price;
    private double profit_percentage;
    private long product_type;

    public Product(long id, String name, double price, double profit_percentage, long product_type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.profit_percentage = profit_percentage;
        this.product_type = product_type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getProfit_percentage() {
        return profit_percentage;
    }

    public void setProfit_percentage(double profit_percentage) {
        this.profit_percentage = profit_percentage;
    }

    public long getProduct_type() {
        return product_type;
    }

    public void setProduct_type(long product_type) {
        this.product_type = product_type;
    }
}
