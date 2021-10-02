package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        /* Vector of initial capacity(size) of 2 */
        Vector<String> vec = new Vector<String>(2);

        /* Adding elements to a vector*/
        vec.addElement("Apple");
        vec.addElement("Orange");
        vec.addElement("Mango");
        vec.addElement("Fig");

        /* check size and capacityIncrement*/
        System.out.println("Initial size is: "+vec.size());
        System.out.println("Default capacity increment is: "+vec.capacity());

        vec.addElement("Pineapple");


        /*size and capacityIncrement after two insertions*/
        System.out.println("Size after addition: "+vec.size());


        /*Display Vector elements*/
        Enumeration en = vec.elements();
        System.out.println("\nElements are:");
        while(en.hasMoreElements())
            System.out.print(en.nextElement() + " ");

    }
}

