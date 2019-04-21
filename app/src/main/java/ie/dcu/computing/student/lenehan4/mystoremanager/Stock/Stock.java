package ie.dcu.computing.student.lenehan4.mystoremanager.Stock;

import android.content.Intent;

public class Stock {
    private String UPC, Brand;
    private Integer Quantity;
    private Float Price;


    public Stock() {
    }

    public Stock(String UPC, String brand, Integer quantity, Float price) {
        this.UPC = UPC;
        Brand = brand;
        Quantity = quantity;
        Price = price;
    }

    public String getUPC() {
        return UPC;
    }

    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public Float getPrice() {
        return Price;
    }

    public void setPrice(Float price) {
        Price = price;
    }



}
