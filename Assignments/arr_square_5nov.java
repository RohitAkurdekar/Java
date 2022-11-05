package com.diot.Assignments;

import java.util.Scanner;

public class arr_square_5nov {

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
     * @brief save square of array elements in new array
     * @param int arr
     * @return int arr
    ******************************************************/
    public int[] Operate(int[] arr)
    {
        int tempArr[]= new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            tempArr[i]=arr[i]*arr[i];
            
        }
        return tempArr;
        
    }

    /*******************************************************************
     * @name displayArr
     * @date 05/Nov/2022
     * @brief display array elements
     * @param arr
    ********************************************************************/
    public void displayArr(int[] arr)
    {
        System.out.println("Elements of the array are ");
        for(int i:arr)
        {
            System.out.print(i+"\t");
        }
    }
    //------------------------ main() -------------------------------------
    public static void main(String[] args) {
        // class_name   object  = new constructor;          --> Syntax
        arr_square_5nov myMethod=new arr_square_5nov();         // required to call class methods

        myMethod.displayArr(myMethod.Operate(myMethod.acceptArr()));
        
    }
}
