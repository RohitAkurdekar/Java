package com.diot.Assignments.BookDetails_search;

import java.util.Scanner;

public class BookDet 
{
    private String sBookName,sAuthor;
    private int iBookNo;
    private float fPrice;
    
    // constructor
    public BookDet() {    }

    // parameterized constructor
    public BookDet(String sBookName, String sAuthor, int iBookNo, float fPrice) {
        this.sBookName = sBookName;
        this.sAuthor = sAuthor;
        this.iBookNo = iBookNo;
        this.fPrice = fPrice;
    }

    // display book details
    public void vDisplayDet() {
        System.out.println("BookDet [sBookName=" + sBookName + ", sAuthor=" + sAuthor + ", iBookNo=" + iBookNo + ", fPrice="+ fPrice + "]");
    }

    // Increment book amount by given percentage
    public void vIncrPrice(float fPerc)
    {
        setfPrice(this.fPrice + (this.fPrice * fPerc/100));
    }

    // return book name
    public String getsBookName() {
        return sBookName;
    }

    // set book name
    public void setsBookName(String sBookName) {
        this.sBookName = sBookName;
    }

    // return book author
    public String getsAuthor() {
        return sAuthor;
    }

    // set book author
    public void setsAuthor(String sAuthor) {
        this.sAuthor = sAuthor;
    }


    // return book number
    public int getiBookNo() {
        return iBookNo;
    }

    // set book number
    public void setiBookNo(int iBookNo) {
        this.iBookNo = iBookNo;
    }


    // return book price
    public float getfPrice() {
        return fPrice;
    }

    // set book price
    public void setfPrice(float fPrice) {
        this.fPrice = fPrice;
    }

    // ------------------- main() ------------------------
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Create book obj and use parameterized constructor
            BookDet book1 = new BookDet("Wings of fire", "APJ Abdul Kalam", 1, 50);
            book1.vDisplayDet();
            book1.vIncrPrice(20);
            book1.vDisplayDet();


            // Create book obj and use no-args constructor
            BookDet book2 = new BookDet();

            // set params of obj since it did not used a parameterized constructor
            book2.setsBookName("Raavan");
            book2.setsAuthor("Amish Tripathi");
            book2.setiBookNo(2);
            book2.setfPrice(60);

            book2.vDisplayDet();

            book2.vIncrPrice(10);

            book2.vDisplayDet();


            BookDet book3 = new BookDet("Sita", "Amish Tripathi", 3, 250);
            BookDet book4 = new BookDet("Meluha's Naga", "Amish Tripathi", 4, 500);
            BookDet book5 = new BookDet("Monk who sold his ferrari", "Robin sharma", 5, 1000);


            BookDet bookShelf[] = {book1,book2,book3,book4,book5};

            System.out.print("\nEnter book no: ");
            int bookNo= sc.nextInt();

            boolean flag = false;

            for(BookDet book:bookShelf)
            {
                if(bookNo == book.getiBookNo())
                {
                    flag = true;
                    System.out.println("\n Book found: ");
                    book.vDisplayDet();
                    System.out.println();
                    break;
                }
            }
            if(!flag)   System.out.println("\n Book not found");
            // Book details before increments
            System.out.println("\n---------- Before Incr -------------");
            for(BookDet book:bookShelf)
            {
                book.vDisplayDet();
            }

            // Increment price by 5%
            for(BookDet book:bookShelf)
            {
                book.vIncrPrice(5);
            }


            // Book details before increments
            System.out.println("\n---------- After Incr by 5% -------------");
            for(BookDet book:bookShelf)
            {
                book.vDisplayDet();
            }

        }

    }
}
