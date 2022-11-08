package com.diot.Overloadingg;

public class TestOverLoadin {
    
    public static void main(String[] args) {
        // Overloadin A1 = new Overloadin();

        //Static methods can be called directly
        System.out.println(Overloadin.add(10, 15));                   // A -->
        System.out.println(Overloadin.add("Concat", "enation"));      // C -->
        System.out.println(Overloadin.add(34.5f, 45.6f));               // D -->
        System.out.println(Overloadin.add(12, 65, 14));           // B -->
    }
}

/* 
-------------- Output -------------------------
    25
    Concatenation
    80.1
    91
*/