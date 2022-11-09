package com.diot.Interface;
// Can inherit only one class and can implement multiple interface
public class testInterf extends Inherit implements Interf2 , Interf4 {
    @Override
    public void interfaceMethod() {
        System.out.println("Inside interfaced method 1");
    }

    @Override
    public void interfaceMethod2() {
        System.out.println("Inside interfaced method 2");
    }

    @Override
    public void interfaceMethod3() {
        System.out.println("Inside interfaced method 3");
        
    }
    @Override
    public void interfaceMethod4() {
        System.out.println("Inside interfaced method 4");
        
    }

    @Override
    public void unwantedMethod() {
        // Need to declare it here
        // No need of defination and call
    }

    public static void main(String[] args) {
        System.out.println("\n --------- Interface ex -------------\n");
        testInterf Obj = new testInterf();

        Obj.inheritMethod();
        Obj.interfaceMethod();
        Obj.interfaceMethod2();
        Obj.interfaceMethod3();
        Obj.interfaceMethod4();

        System.out.println();
    }

}
/*
---------- Output ---------------------------

 --------- Interface ex -------------

    Inside Inherit method
    Inside interfaced method 1
    Inside interfaced method 2
    Inside interfaced method 3
*/