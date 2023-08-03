package com.example.demo1.Model;

public class Computer {
    private  int id;
    private String name;
    private double price;
    private int YearOfManufacture;
    private String description;

    public Computer(int id, String name, double price, int yearOfManufacture, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        YearOfManufacture = yearOfManufacture;
        this.description = description;
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

    public int getYearOfManufacture() {
        return YearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        YearOfManufacture = yearOfManufacture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
