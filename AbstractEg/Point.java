package com.diot.AbstractEg;

public class Point extends Shape {

    @Override
    public void draw() {        // Implementing abstract method
        System.out.println(".");
    }
    
    public static void main(String[] args) {
        System.out.println();
        
        Shape s1 = new Point();
        s1.setColor("bluee");
        System.out.println("Color: "+s1.getColor());
        s1.draw();

        System.out.println();
    }
    
}
/*
 * ------------------------- OUTPUT ----------------------
 
            Color: bluee
            .

 */