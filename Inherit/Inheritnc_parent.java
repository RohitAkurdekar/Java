package com.diot.Inherit;

public class Inheritnc_parent {
    private int id;
    private String empName;
    private double sal;
    

    public Inheritnc_parent(int id, String empName, double sal) {
        this.id = id;
        this.empName = empName;
        this.sal = sal;
    }


    
    public void displayEmpDetails() {
        System.out.print("EmpDetails id=" + id + ", empName=" + empName + ", sal=" + sal ); 
    }


    public static void main(String[] args) {
        System.out.println("\n");
        Inheritnc_parent emp1=new Inheritnc_parent(1, "Digvijay", 2100000);
        emp1.displayEmpDetails();

        System.out.println("\n");
    }
}
/*
    -------------------- OUTPUT --------------------
    EmpDetails id=1, empName=Digvijay, sal=2100000.0
    
 */