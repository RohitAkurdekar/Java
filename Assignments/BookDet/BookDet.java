package com.diot.Assignments.BookDet;

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
    }
}
