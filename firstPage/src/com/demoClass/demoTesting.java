package com.demoClass;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class demoTesting {
    public static void main (String[]args) {

        //2d array stirng
        String[] abc = new String[2];
        abc[0] = "Raj";
        abc[1] = "Rahul";
        //System.out.println(abc[0].charAt(2));
//		for (int i=0; i<abc.length; i++) {
//			System.out.println(abc[i]);
//		}


        ArrayList<String> demoArray = new ArrayList();
        demoArray.add("Apple");
        demoArray.add("Banana");
        demoArray.add("Mango");
        demoArray.add("Papaya");
        //System.out.println(demoArray + " -demoArray");

//		for (String element : demoArray) {
//			System.out.println(element);
//		}

        for(int i=0; i<demoArray.size(); i++) {
            System.out.println(demoArray.get(i) + " (index value is) "  + i);
        }

        ArrayList <Integer> list1 = new ArrayList ();
        list1.add(5);
        list1.add(10);

        ArrayList <Integer> list2 = new ArrayList();
        list2.add(15);
        list2.add(20);

        ArrayList <Integer> list3 = new ArrayList();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println(list3);


        //Collections.reverse(list3);
        //Collections.shuffle(list3);
        //System.out.println(list3);

        //extract portion from arraylist
        List <Integer> newList = list3.subList(0, 2);
        System.out.println(newList + " - newList");


//		list3.add(1, 100);
//		System.out.println(list3);



        LinkedList <String> a1 = new LinkedList();
        a1.add("A");
        a1.add("B");
        a1.add("C");

        LinkedList <String> a2 = new LinkedList();
        a2.add("B");
        a2.add("C");
        a2.add("D");

        LinkedList <String> a3 = new LinkedList();
        for(String i : a1) {
            a3.add(a2.contains(i) ? "Yes" : "No");

        }
        System.out.println(a3);


        if(a1.contains("B")) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }







    }

}