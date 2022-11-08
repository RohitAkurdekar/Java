package com.diot.Assignments.Medicines;

import com.diot.Assignments.Date.myDate;

public abstract class Medicine {
    int price;
    myDate expDate;

    public Medicine(int price, myDate expDate) {
        this.price = price;
        this.expDate = expDate;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Medicine [price=" + price + ", expDate=" + expDate + "]";
    }
    public myDate getExpDate() {
        return expDate;
    }

    public abstract void displayLabel();
}
