package com.diot.Assignments.Date;


import java.util.Scanner;

public class myDate {
    private int date,month,year;
    Scanner sc=new Scanner(System.in);
   


    public int getDate() {
        return date;
    }




    public void setDate(int date) {
        this.date = date;
    }




    public int getMonth() {
        return month;
    }




    
    public void dispDate() {
        System.out.println("myDate [date=" + date + ", month=" + month + ", year=" + year); 
    }




    public void setMonth(int month) {
        this.month = month;
    }




    public int getYear() {
        return year;
    }




    public void setYear(int year) {
        this.year = year;
    }

    public boolean setddmmyy()
    {
        
        System.out.println("Enter the date ");
        int dd=sc.nextInt();
        if(!(dd>0 && dd<32))
        {
            System.out.println("Invalid date");return false;
        }
        else
        {
            setDate(dd);
        }
        int mm=sc.nextInt();
        if(!(mm>0 && mm<13))
        {
            System.out.println("Invalid month"); return false;

        }
        else{
            setMonth(mm);
        }
        int yy=sc.nextInt();
        
            setYear(yy);
        
    return true;
    }


    public static void main(String[] args) {
       

    }
}

