package com.gmail.vorononovskyi.yaroslav.isg.homework.first.model;

public class Laptop extends ElectronicGood {
    public Laptop(int id, String name, double price, String color, String producingCountry, int serialNumber) {
        super(id, name, price, color, producingCountry, serialNumber);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", producingCountry='" + producingCountry + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }
}
