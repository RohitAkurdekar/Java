package com.diot.AbstractEg;

// pojo - plain old java object

// Can not create an object/Instance of abstract class.
public abstract class Shape {
    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    // Declaration of abstract method
    public abstract void draw();
    
}
