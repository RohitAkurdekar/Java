package com.diot.Assignments.Medicines;

import com.diot.Assignments.Date.myDate;

public class TestMedicine {
    public static void main(String[] args) {
        System.out.println("\n--------------------------------------\n");

        myDate expDateTablet = new myDate(12,10,2022);
        Medicine dolo=new Tablet(50, expDateTablet);
        
        myDate expDateSyrup=new myDate(15, 10, 2022);
        Medicine ascoril=new Syrup(100, expDateSyrup);

        myDate expDateOintment=new myDate(20, 12, 2022);
        Medicine borolin=new Ointment(200, expDateOintment);
        

        Medicine marr[]={dolo,ascoril,borolin};
        for(Medicine meds:marr)
        {
            System.out.println(meds);
            meds.displayLabel();
            System.out.print("Exp date: ");
            meds.getExpDate().dispDate();
            System.out.println("Price: "+(meds.getPrice()));
            System.out.println();
        }

        System.out.println("\n--------------------------------------\n");
    }
}
