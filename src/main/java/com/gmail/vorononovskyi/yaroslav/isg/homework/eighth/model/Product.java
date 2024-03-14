package com.gmail.vorononovskyi.yaroslav.isg.homework.eighth.model;

import java.util.Objects;
import java.util.UUID;

public class Product {

    private String id = UUID.randomUUID().toString();
    private String name;
    private String color;
    private String price;
    private String serialNumber = UUID.randomUUID().toString();

    public Product(String name, String color, String price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public boolean matches(String pattern) {
        boolean matches = false;
        if (name.contains(pattern)) {
            matches = true;
        }
        return matches || specificMatches(pattern);
    }

    public boolean specificMatches(String pattern) {
        return name.contains(pattern);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id.equals(product.id) && name.equals(product.name) && color.equals(product.color) && price.equals(product.price) && serialNumber.equals(product.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, color, price, serialNumber);
    }

    @Override
    public String toString() {
        return "Product [ " + name +
                ", " + color +
                ", " + price + "$ " +
                ", serialNumber: " + serialNumber +
                " ]";
    }
}
