package com.diot.Assignments.Medicines;


import com.diot.Assignments.Date.myDate;

public class Ointment extends Medicine {

    public Ointment(int price, myDate expDate) {
        super(price, expDate);
    }

    @Override
    public void displayLabel() {
        System.out.println("for external use only");
        
    }
    

}
