package com.diot.Assignments;

import java.util.Scanner;

public class arr_5nov {

    /************************************************
     * @name acceptArr
     * @date 05/nov/2022
     * @brief Accept array 
     * @return int array
    *************************************************/
    public int[] acceptArr()
    {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr= new int[5];
            System.out.println("Enter the elements");
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }
            return arr;
        }
    }

    /*****************************************************
     * @name Operate
     * @date 05/nov/2022
     * @brief Display sum and average of array elements
     * @param int arr
    ******************************************************/
    public void Operate(int[] arr)
    {
        int Sum=0;
        for(int ele:arr)
        {
            Sum+=ele;
        }
        System.out.println("Sum is "+Sum);
        System.out.println("Average is "+(Sum/arr.length) );
    }
    // -------------------- main() ----------------------
    public static void main(String[] args) {
        arr_5nov myMethod=new arr_5nov();
        myMethod.Operate(myMethod.acceptArr());     // accept array and pass it to operate func()
    }
}
