package com.diot;

import java.util.Scanner;

public class arr_method {

    /*******************************************************************
     * @name dispArr
     * @date 05/Nov/2022
     * @brief Iterate through array and display elements
     * @tested OK
     * @param arr
    ********************************************************************/
    public void dispArr(int[] arr)
    {
        System.out.println("\nArray elements are :");
        for(int ele:arr)    System.out.print(ele + "\t");
    }

    /*******************************************************
     * @name acceptArray
     * @date 05/nov/2022
     * @brief accept array
     * @tested OK
     * @return int array
     ********************************************************/
    public int[] acceptArray()
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter total number of array: ");
            int arrLen = 0;
            arrLen = sc.nextInt();
            int arr[] = new int[arrLen];
            System.out.println("\nEnter array elements: ");
            for(int i=0;i<arrLen;i++)
            {
                arr[i]=sc.nextInt();
            }

            return arr;
        }
    }


    // -------------- Main() -------------------------------
    public static void main(String[] args) {
        System.out.println("\n------------ SoC ------------\n");

        arr_method myMethod = new arr_method();
        // int myarr[] = {1,2,3,4,5,6};

        myMethod.dispArr(myMethod.acceptArray());       // accept array and send it to display func()

        System.out.println("\n------------ EoC ------------\n");
        
    }
}


/*
 -------------------- Output -------------------------
      
    ------------ SoC ------------

    Enter total number of array: 5

    Enter array elements: 
    1 
    2
    3
    4
    5

    Array elements are :
    1       2       3       4       5
    ------------ EoC ------------

 */