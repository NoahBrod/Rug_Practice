package com.example.urban_rug_finds.rug;

import org.apache.tomcat.util.codec.binary.Base64;

import jakarta.persistence.Column;
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
    @Column(columnDefinition = "LONGBLOB")
    private byte[] image; // add later
    private double price;
    // private String style; // traditional, modern, transitional, bohemian
    // private String size; // area, runner, round
    // private String color; // neutral, bold, pattern
    // private String brand; // reputable, handmade
    // private String purpose; // indoor, outdoor, comfort
    // private String maintenance; // easy, low, high


    // public Rug(Long id, byte[] image, double price, String style, String size, String color, String brand, String purpose, String maintenance) {
    //     this.id = id;
    //     this.image = image;
    //     this.price = price;
    //     this.style = style;
    //     this.size = size;
    //     this.color = color;
    //     this.brand = brand;
    //     this.purpose = purpose;
    //     this.maintenance = maintenance;
    // }

    // public Rug(byte[] image, double price, String style, String size, String color, String brand, String purpose, String maintenance) {
    //     this.id = id;
    //     this.image = image;
    //     this.price = price;
    //     this.style = style;
    //     this.size = size;
    //     this.color = color;
    //     this.brand = brand;
    //     this.purpose = purpose;
    //     this.maintenance = maintenance;
    // }

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

    public String getImage64() {
        return Base64.encodeBase64String(image);
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

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", image='" + getImage() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }
}
