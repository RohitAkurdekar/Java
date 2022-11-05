package com.diot;

public class enh_for {
    public static void main(String[] args) {
        System.out.println("\n----------- SoC --------------");

        int arr[] = new int[5];         // Array declaration

        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        // -------------- Enhanced for in java -----------------------
        for(int ele:arr)        // for every elements[ele] of array[arr]
        {            System.out.print(ele + "\t");        }

        System.out.println("\n----------- EoC --------------\n");
    }
}

/*
------------------ OUTPUT -------------------------
 
    ----------- SoC --------------
    1       2       3       4       5
    ----------- EoC --------------

*/