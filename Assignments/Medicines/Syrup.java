package com.diot.Assignments.Medicines;


import com.diot.Assignments.Date.myDate;

public class Syrup extends Medicine{

    public Syrup(int price, myDate expDate) {
        super(price, expDate);
    }

    @Override
    public void displayLabel() {
        System.out.println("Shake well before use");
        
    }
    
}
