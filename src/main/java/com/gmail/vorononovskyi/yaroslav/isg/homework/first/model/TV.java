package com.gmail.vorononovskyi.yaroslav.isg.homework.first.model;

public class TV extends ElectronicGood {
    public TV(int id, String name, double price, String color, String producingCountry, int serialNumber) {
        super(id, name, price, color, producingCountry, serialNumber);
    }

    @Override
    public String toString() {
        return "TV{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", producingCountry='" + producingCountry + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }
}
