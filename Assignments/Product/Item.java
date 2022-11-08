package com.diot.Assignments.Product;

public class Item extends Product{
    int warranty;
    String manufacturer;

    
    public Item(int productId, String description, double price, int warranty, String manufacturer) {
        super(productId, description, price);
        this.warranty = warranty;
        this.manufacturer = manufacturer;
    }


    public void dispDetails() {
        super.dispDetails();
        System.out.println("Item [warranty=" + warranty + ", manufacturer=" + manufacturer + "]");
    }

}
