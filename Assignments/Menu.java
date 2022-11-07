package com.diot.Assignments;

import java.util.Scanner;

public class Menu {
// --------------------- main() ------------------------------------
    public static void main(String[] args) {
        int num1,num2,c; 
        char ch;
        try (Scanner sc = new Scanner(System.in)) {
            do
            {
                System.out.println("Enter first number");
                num1=sc.nextInt();
                System.out.println("Enter second number");
                num2=sc.nextInt();
                System.out.println("_______ ME N U _______");
                System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
                System.out.println("Enter your choice");
                c=sc.nextInt();
                switch(c)
                {
                    case 1:
                    {
                        System.out.println("Addition is "+(num1+num2));
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Subtraction is "+(num1-num2));
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Multiplication is "+(num1*num2));
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Division is "+(num1/num2));
                        break;
                    }
                }
                System.out.println("Do you want to continue?");
                ch=sc.next().charAt(0);
            }while(ch=='y' || ch=='Y');
        }
    }
}