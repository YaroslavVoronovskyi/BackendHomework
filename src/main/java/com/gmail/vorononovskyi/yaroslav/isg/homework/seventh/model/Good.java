package com.gmail.vorononovskyi.yaroslav.isg.homework.seventh.model;

import java.util.Objects;
import java.util.UUID;

public class Good {

    private final String id = UUID.randomUUID().toString();
    private final String name;
    private final String color;
    private final int price;
    private final String serialNumber = UUID.randomUUID().toString();

    public Good(String name, String color, int price) {
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

    public int getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Good good = (Good) o;
        return price == good.price
                && id.equals(good.id)
                && name.equals(good.name)
                && color.equals(good.color)
                && serialNumber.equals(good.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, color, price, serialNumber);
    }

    @Override
    public String toString() {
        return "Good [" +
                "id: " + id +
                ", name: " + name +
                ", color: " + color +
                ", price: " + price + "$ " +
                ", serialNumber: " + serialNumber +
                " ]";
    }
}
