package com.diot.Assignments.Product;

public class Service extends Product{
    String serviceEngg;


    
    public Service(int productId, String description, double price, String serviceEngg) {
        super(productId, description, price);
        this.serviceEngg = serviceEngg;
    }



    public void dispDetails() {
        super.dispDetails();
        System.out.println( "Service [serviceEngg=" + serviceEngg + "]");
    }

}
