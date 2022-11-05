package com.diot;

import java.util.Scanner;

public class Input_Assignment_05_nov {

    /******************************
     * @name readline
     * @date 05/nov/2022
     * @tested OK
     * @brief Reads line from terminal
     * @apiNote Use this method only if terminal is scanned atleast once
     * @param sc
     * @return String read from terminal
     ******************************/
    public String readLine(Scanner sc){
        sc.nextLine();
        return sc.nextLine();
    }

    /******************************
     * @name dispMsg
     * @date 05/nov/2022
     * @tested OK
     * @brief display message particular times
     * @param msg:String , times:int
     * @return none
     ******************************/
    public void dispMsg(String msg,int times)
    {
        System.out.println("\n--------- Printing message -------------");
        for(int i =0;i<times;i++)
        {
            System.out.println(msg);
        }
    }

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("\n--------- SoC -----------------------");
        Scanner sc = new Scanner(System.in);
        Input_Assignment_05_nov myMeth = new Input_Assignment_05_nov();

        System.out.print("\nEnter number of times to display message: ");
        int times = sc.nextInt();

        System.out.print("Enter message: ");
        String tempMsg = myMeth.readLine(sc);

        myMeth.dispMsg(tempMsg, times);

        System.out.println("--------- EoC -----------------------\n");
    }
}

/* ------------------ OUTPUT ------------------
 
    --------- SoC -----------------------

    Enter number of times to display message: 5
    Enter message: Hello Zagdya Ramoshi

    --------- Printing message -------------
    Hello Zagdya Ramoshi
    Hello Zagdya Ramoshi
    Hello Zagdya Ramoshi
    Hello Zagdya Ramoshi
    Hello Zagdya Ramoshi
    --------- EoC -----------------------
 */