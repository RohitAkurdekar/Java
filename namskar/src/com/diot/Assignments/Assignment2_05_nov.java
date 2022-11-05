package com.diot;

import java.util.Scanner;

public class Assignment2_05_nov 
{
    public int pow(int num1,int num2)
    {
       return (int)Math.pow(num1, num2);
    }
    public float degr(float celci)
    {
        return (celci*9/5)+32;
    }
    public static void main(String[] args) {
        System.out.println("\n------- SoC --------------");

        Scanner sc = new Scanner(System.in);

        Assignment2_05_nov myMethod=new Assignment2_05_nov();
        int num1=2,num2=5;
        System.out.println(num1+"^"+num2+"="+(myMethod.pow(num1, num2)));

        System.out.print("Enter temp in celcius: ");
        int celci = sc.nextInt();
        System.out.println(celci + " degree in fahrenheit is "+(myMethod.degr(5)));

        // System.out.println("5 degree celcius in fahrenheit is "+(myMethod.degr(5)));

        System.out.println("------- EoC --------------\n");
    }
}

/* --------------- Outout --------------------- 
    ------- SoC --------------
    2^5=32
    Enter temp in celcius: 5
    5 degree in fahrenheit is 41.0
    -> 5 degree celcius in fahrenheit is 41.0   Won't work as it is commented in code
    ------- EoC --------------
*/