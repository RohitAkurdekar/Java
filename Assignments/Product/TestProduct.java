package com.diot.Assignments.Product;

public class TestProduct{


    public static void main(String[] args) {
      Product p1=new Product(1,"Mobile",2000f);
      Product p2=new Item(2,"mouse",1500,6,"Dell");
      Product p3=new Service(3,"AntiVirus",3512f,"Kaspersky");
      
      Product[] parr={p1,p2,p3};
      System.out.println("\n");

      for(Product product:parr)
      {
        product.dispDetails();
        System.out.println("\n");
      }
      System.out.println("\n");
    }
}
