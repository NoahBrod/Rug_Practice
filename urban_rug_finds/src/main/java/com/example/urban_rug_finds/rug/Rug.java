package com.example.urban_rug_finds.rug;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Rug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Lob
    private byte[] image; // add later
    private double price;
    private String style; // traditional, modern, transitional, bohemian
    private String size; // area, runner, round
    private String color; // neutral, bold, pattern
    private String brand; // reputable, handmade
    private String purpose; //indoor, outdoor, comfort
    private String maintenance; // easy, low, high


    public Rug(Long id, byte[] image, double price, String style, String size, String color, String brand, String purpose, String maintenance) {
        this.id = id;
        this.image = image;
        this.price = price;
        this.style = style;
        this.size = size;
        this.color = color;
        this.brand = brand;
        this.purpose = purpose;
        this.maintenance = maintenance;
    }

    public Rug(byte[] image, double price, String style, String size, String color, String brand, String purpose, String maintenance) {
        this.id = id;
        this.image = image;
        this.price = price;
        this.style = style;
        this.size = size;
        this.color = color;
        this.brand = brand;
        this.purpose = purpose;
        this.maintenance = maintenance;
    }

    public Rug() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getImage() {
        return this.image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStyle() {
        return this.style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getMaintenance() {
        return this.maintenance;
    }

    public void setMaintenance(String maintenance) {
        this.maintenance = maintenance;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", image='" + getImage() + "'" +
            ", price='" + getPrice() + "'" +
            ", style='" + getStyle() + "'" +
            ", size='" + getSize() + "'" +
            ", color='" + getColor() + "'" +
            ", brand='" + getBrand() + "'" +
            ", purpose='" + getPurpose() + "'" +
            ", maintenance='" + getMaintenance() + "'" +
            "}";
    }


}
