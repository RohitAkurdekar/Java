package com.diot;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        int iNum = sc.nextInt();
        System.out.println("Entered num is "+iNum);
    }
}
