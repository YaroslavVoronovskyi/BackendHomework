package com.gmail.vorononovskyi.yaroslav.isg.homework.first.model;

import java.util.Objects;

public abstract class ElectronicGood {
    protected int id;
    protected String name;
    protected double price;
    protected String color;
    protected String producingCountry;
    protected int serialNumber;

    public ElectronicGood(int id, String name, double price, String color, String producingCountry, int serialNumber) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.producingCountry = producingCountry;
        this.serialNumber = serialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProducingCountry() {
        return producingCountry;
    }

    public void setProducingCountry(String producingCountry) {
        this.producingCountry = producingCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElectronicGood that = (ElectronicGood) o;
        return id == that.id && Double.compare(that.price, price) == 0
                && serialNumber == that.serialNumber
                && name.equals(that.name)
                && color.equals(that.color)
                && producingCountry.equals(that.producingCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, color, producingCountry, serialNumber);
    }
}
