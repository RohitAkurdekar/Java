package com.diot.AbstractEg;

public class Circle extends Point{

    @Override
    public void draw() {        // Overriding abstract method
        System.out.println("O");
    }

    public static void main(String[] args) {
        System.out.println();
        
        Shape s1 = new Point();
        s1.draw();
        Shape s2 = new Circle();
        s2.draw();

        System.out.println();
    }

}
/*
 --------------------- OUTPUT ---------------------------------
        .
        O

*/