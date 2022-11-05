package com.diot.constructor_ex;

public class Box_constr_2 {
    public static void main(String[] args) {
        Box_Constructor_conc b1 = new Box_Constructor_conc(4,2,6);
        System.out.println("volume: "+b1.calcVolume());
        // b1.privateFunc();            // This line gives error as it is private func
    }
}
