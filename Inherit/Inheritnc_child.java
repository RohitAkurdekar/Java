package com.diot.Inherit;

public class Inheritnc_child extends Inheritnc_parent{
    private double commision;
    
    public Inheritnc_child(int id, String empName, double sal, double commision) {
        super(id, empName, sal);
        this.commision = commision;
    }

    /*
        ---------- Method Overriding concept ----------
        It is used between super and sub class.
        Same method name and return type.


        Method Overriding leads to Dynamic polymorphism

        Dynamic Polymorphism --> Run-Time polymorphism
            Ability of object to invoke a method/variable depending
              on itself wherever it's in the inheritence hierarchy.
    */
    public void displayEmpDetails() {
        super.displayEmpDetails();
        System.out.println(", commision=" + commision); 
    }

    public static void main(String[] args) {
        System.out.println("\n");
        Inheritnc_child empSales=new Inheritnc_child(2, "Rohit", 2200000, 100000);
        empSales.displayEmpDetails();
        System.out.println("\n");


        Inheritnc_parent emp2 = new Inheritnc_child(3, "Saurav", 15422, 2400);
        emp2.displayEmpDetails();
        System.out.println("\n");

    }
}
/*
    ----------------------------- OUTPUT -----------------------------
    EmpDetails id=2, empName=Rohit, sal=2200000.0, commision=100000.0

 */