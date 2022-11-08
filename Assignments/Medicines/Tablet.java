package com.diot.Assignments.Medicines;


import com.diot.Assignments.Date.myDate;

public class Tablet extends Medicine {

    public Tablet(int price, myDate expDate) {
        super(price, expDate);
    }

    @Override
    public void displayLabel() {
        System.out.println("Store in cold places only");
        
    }
    
}
