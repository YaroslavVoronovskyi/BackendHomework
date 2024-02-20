package com.gmail.vorononovskyi.yaroslav.isg.homework.first.model;

public class SmartPhone extends ElectronicGood {
    public SmartPhone(int id, String name, double price, String color, String producingCountry, int serialNumber) {
        super(id, name, price, color, producingCountry, serialNumber);
    }

    @Override
    public String toString() {
        return "SmartPhone [ " + name + '\'' +
                ", price: " + price + "$" +
                ", color: '" + color + '\'' +
                ", producingCountry: '" + producingCountry + '\'' +
                ", serialNumber: " + serialNumber + " ]";
    }
}
