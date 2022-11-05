package com.diot.Assignments;

public class oddArray_5nov {

    // Display odd elements in array
    public void Operate(int[] arr)
    {
        System.out.println("Elements of the array are ");
        for(int ele:arr)
        {
            if(ele%2!=0)
            {                System.out.print(ele+"\t");            }
            
        }
        
    }
    //------------------------ main() ---------------------------------------
    public static void main(String[] args) {
        oddArray_5nov myMethod = new oddArray_5nov();

        int arr[] = {1,2,3,4,5,6,7};

        myMethod.Operate(arr);
        
    }
}
