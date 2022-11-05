package com.diot;

public class assignment1_05_nov {
public static void main(String[] args) {
    
    int num1=10,num2=2,num3=45;
    System.out.println("\nWho is saglyat motha....?? "+num1+","+num2+","+num3 +"\n");
    if(num1>num2 && num1>num3)
    {
        System.out.println(num1+" is motha");
    }
    else if(num2>num3)
    {
        System.out.println(num2+" is badaa");
    }
    else
    {
        System.out.println(num3+" is saglyaat motha");
    }
    System.out.println("\n------------ Multi table ----------------\n");
    for(int i=1;i<=10;i++)
    {
        System.out.println(num2+"*"+i+"="+(i*num2));
    }
    int sum = 0;
    System.out.println("\n------------------- Sum of 30 prime numbers -------------------- \n");
    for(int j=1;j<31;j++)
    {
        if(j%2==0){sum+=j;}
    }
    System.out.println("Sum is "+sum);
    System.out.println("\n");
}    
}


/* ----------- Output ------------------------
    
    Who is saglyat motha....?? 10,2,45

    45 is saglyaat motha

    ------------ Multi table ----------------

    2*1=2
    2*2=4
    2*3=6
    2*4=8
    2*5=10
    2*6=12
    2*7=14
    2*8=16
    2*9=18
    2*10=20

    ------------------- Sum of 30 prime numbers -------------------- 

    Sum is 240

*/