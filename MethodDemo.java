package com.diot;

public class MethodDemo {

    public void greet(String user)
    {
        System.out.println("\nHello "+ user);
    }

    public int add(int iNum1,int iNum2)
    {
        return iNum1+iNum2;
    }

    public static void main(String[] args) {
        System.out.println("\n------------ SoC --------------------\n");

        MethodDemo myMethod = new MethodDemo();
        myMethod.greet("Mogambo");

        int iNum1 = 2, iNum2 = 6;

        System.out.println(iNum1 + " + " + iNum2 +" = " + (iNum1+iNum2));

        System.out.println("\n------------ EoC --------------------\n");
    }
}
/* ----------------- Output -----------------------
    ------------ SoC --------------------
    Hello Mogambo
    2 + 6 = 8
    ------------ EoC --------------------
*/