package com.diot.PassByRef;

import java.util.Arrays;

class Person{
    int id;
    String name;
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }

    
}

public class PassByRef {

    public static void m1(int i)
    {
        i++;
    }
    public static void m2(String str)
    {
        str+=" World";
    }
    public static void m3(int arr[])
    {
        arr[0] = 100000000;
    }

    public static void m4(Person P)
    {
        P.name = "Zingaaalalaaalala";
    }

    public static Integer m5(int iobj)
    {
        return ++iobj;
    }

    public static void main(String[] args) {
        System.out.println();

        int j = 10;
        m1(j);
        System.out.println("j: "+j);

        String s1 ="Hello" ;
        m2(s1);
        System.out.println("s1: "+s1);

        int nums[] = {1,2,3,4,5};
        m3(nums);

        System.out.println("Array: "+Arrays.toString(nums));

        Person P1 = new Person(1, "Huhuhuhuhuhuhuhu");
        System.out.println(P1);
        m4(P1);
        System.out.println(P1);

        System.out.println("j: "+m5(new Integer(j)));

        System.out.println();
    }
}

/*
    ----------- OUTPUT --------------------   
            j: 10
            s1: Hello
            Array: [100000000, 2, 3, 4, 5]
            Person [id=1, name=Huhuhuhuhuhuhuhu]
            Person [id=1, name=Zingaaalalaaalala]
            j: 11
*/

// THERE IS A DIFFERENCE BETWEEN 'IT SHOULD' AND 'IT WILL'