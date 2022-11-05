/********************************************************************
 * @name Box constructor concept
 * @date 05/nov/2022
 * @brief Concepts of constructor, getter and setter functions
 *******************************************************************/

package com.diot.constructor_ex;

public class Box_Constructor_conc {
    private int length,width,height;

    /***************************************************************
     * @name Box
     * @brief default no arguments Constructor
     * 
    ****************************************************************/
    public Box_Constructor_conc() {  }

    /***************************************************************
     * @name Box
     * @brief Parameterized Constructor
     * 
    ****************************************************************/
    public Box_Constructor_conc(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    /***********************************************************
     * @name    toString()
     * @date 05/nov/2022
     * @brief Convert class objid to obj data
    ***********************************************************/
    public String toString() {
        return "Box [length=" + length + ", width=" + width + ", height=" + height + "]";
    }

    
    /*****************************************
     * @name getLength
     * @date 05/nov/2022
     * @brief getter func()--> returns Length
     * @Tested ok
     * @return length value
    ******************************************/
    public int getLength() {
        return length;
    }

    
    /*****************************************
     * @name setLength
     * @date 05/nov/2022
     * @brief setter func()--> sets Length
     * @Tested ok
     * @param length
    ******************************************/
    public void setLength(int length) {
        this.length = length;
    }

    /*****************************************
     * @name getWidth
     * @date 05/nov/2022
     * @brief getter func()--> returns width
     * @Tested ok
     * @return width value
    ******************************************/
    public int getWidth() {
        return width;
    }

    /*****************************************
     * @name setWidth
     * @date 05/nov/2022
     * @brief setter func()--> sets width
     * @Tested ok
     * @param width
    ******************************************/
    public void setWidth(int width) {
        this.width = width;
    }

    /*****************************************
     * @name getHeight
     * @date 05/nov/2022
     * @brief getter func()--> returns height
     * @Tested ok
     * @return height value
    ******************************************/
    public int getHeight() {
        return height;
    }
    /*****************************************
     * @name setHeight
     * @date 05/nov/2022
     * @brief setter func()--> sets height
     * @Tested ok
     * @param height
    ******************************************/
    public void setHeight(int height) {
        this.height = height;
    }

    /*******************************************************
     * @name calcVolume
     * @date 05/nov/2022
     * @brief calculate volume of a box
     * @Tested Ok
     * @return volume value
    *******************************************************/
    public int calcVolume(){
        return (this.length*this.width*this.height);
    }

    /**********************************************************
     * @name privateFunc
     * @date 05/nov/2022
     * @brief Example of encapsulation
     *        This func is accessable only in this class 
     *          can't access outside of class 
     * @return none
    ***********************************************************/
    private void privateFunc()
    {
        System.out.println("This is example of encapsulation");
    }

    // --------------------------- main() -------------------------------
    public static void main(String[] args) {
        System.out.println("\n---------------- SoC --------------------------");

        // create a object of class and pass parameters using parameterized constructor
        Box_Constructor_conc b1 =new Box_Constructor_conc(10, 10, 10);
        System.out.println(b1);
        System.out.println("Volume of b1 is "+(b1.calcVolume()));

        // create a object of class using def no-args constructor
        Box_Constructor_conc b2 = new Box_Constructor_conc();
        System.out.println(b2);

        b2.privateFunc();
        
        System.out.println("\n---------------- EoC --------------------------");
    }
}


/* 
----------------- OUTPUT --------------------------
    ---------------- SoC --------------------------
    Box [length=10, width=10, height=10]
    Volume of b1 is 1000
    Box [length=0, width=0, height=0]

    ---------------- EoC --------------------------
 */