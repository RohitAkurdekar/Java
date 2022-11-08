package com.diot.Overloadingg;

public class Overloadin {
/*
    ------------------- Method overloading concept --------------------
    Two or more method with same name and same parameters can not exist,
    but Two or more method with same name and diff parameters can exist.
    
    Method Overloading leads to static polymorphism.
*/

    // Add two integers
    public static int add(int iNum1,int iNum2)                     // <-- A
    {        return iNum1+iNum2;    }


/*
    -------- THIS FUNCTION GIVES ERROR --------------------------
    // Add two integers
    public int add(int iNum1,int iNum2)                     
    {        return iNum1+iNum2;    }
*/

    // Add three integers
    public static int add(int iNum1,int iNum2, int iNum3)          // <-- B
    {        return iNum1+iNum2+iNum3;    }


    // Concat two string
    public static String add(String sText1,String sText2)          // <-- C
    {        return sText1+sText2;    }

    // Add two float numbers
    public static float add(float fNum1,float fNum2)               // <-- D
    {        return fNum1+fNum2;    }

    public static int add(String numArr[])
    {
        int sum = 0;

        for(String num: numArr)
        {
            sum += Integer.parseInt(num);
        }

        return sum;
    }

    public static void main(String[] args) {
        Overloadin A1 = new Overloadin();

        System.out.println(add(args));


        //Static methods can be using object
        System.out.println((A1.add(10, 15)));                   // A -->

        System.out.println(A1.add("Concat", "enation"));      // C -->

        System.out.println(A1.add(34.5f, 45.6f));               // D -->

        System.out.println(A1.add(12, 65, 14));           // B -->

        //Static methods can be called directly
        System.out.println(add(10, 15));                   // A -->
        System.out.println(add("Concat", "enation"));      // C -->
        System.out.println(add(34.5f, 45.6f));               // D -->
        System.out.println(add(12, 65, 14));           // B -->
    }
}
/* 
----------------- OUTPUT -----------------------
25
Concatenation
80.1
91
25
Concatenation
80.1
91
 */