package com.diot.Assignments.Product;

public class Product {

    int productId;
    String description;
    double price;
    
    public Product(int productId, String description, double price) {
        this.productId = productId;
        this.description = description;
        this.price = price;
    }

    public void dispDetails() {
        System.out.println( "Product [productId=" + productId + ", description=" + description + ", price=" + price + "]");
    }


   }
