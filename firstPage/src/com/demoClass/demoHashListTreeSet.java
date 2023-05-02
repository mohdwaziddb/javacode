package com.demoClass;

import java.util.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class demoHashListTreeSet {
    public static void main (String[]args) {
        HashSet <String> abc = new HashSet();
        abc.add("AB");
        abc.add("ML");
        abc.add("EX");
        System.out.println(abc);
        for(String i : abc)
            System.out.println(i);


        Iterator <String> p = abc.iterator();
        while (p.hasNext()) {
            System.out.println(p.next() + " (while loop) ");
        }

        //System.out.println("HashSet is empty or not - " + abc.isEmpty());

        HashSet <String> abccopy = (HashSet) abc.clone();
        System.out.println(abccopy);

        //creating an array
        String[] newArray = new String[abc.size()];
        abc.toArray(newArray);
        //System.out.println(newArray);

        //creating new ArrayList
        List<String> newArrayList = new ArrayList <String>(abc);
        System.out.println(newArrayList + " (Data in ArrayList) ");

        for(String element : newArray)
            System.out.println(element);

        //making TreeSet
        TreeSet <String> new_treeset = new TreeSet <String>();
        new_treeset.add("Red");
        new_treeset.add("Green");
        new_treeset.add("Black");
        System.out.println(new_treeset);

        TreeSet <String> new_treeset1 = new TreeSet <String>();
        new_treeset1.add("Yellow");
        new_treeset1.add("Green");
        new_treeset1.add("Pink");
        System.out.println(new_treeset1);



        Iterator it = new_treeset.descendingIterator();

        //print list element in reverse order
        while(it.hasNext()) {
            System.out.println(it.next() + " (print iterated value)");
        }

        //comparing two array
        TreeSet <String> new_treesetCom = new TreeSet();

        for(String element : new_treeset) {
            //new_treesetCom.add(new_treeset1.contains(element) ? "Yes" : "No");
            System.out.print(new_treeset1.contains(element) ? " Yes, " : " No, ");
        }
        //System.out.println(new_treesetCom);

        TreeSet <Integer> treeNum = new TreeSet();
        treeNum.add(1);
        treeNum.add(2);
        treeNum.add(3);
        treeNum.add(4);
        treeNum.add(5);
        treeNum.add(6);
        System.out.println(); //for line break only.
        System.out.println(treeNum);

        Set treeLess = (TreeSet)treeNum.headSet(5);
        System.out.println(treeLess);
        //Iterator treeLessit = treeLess.iterator();
        for (Object abc1 : treeLess) {
            System.out.println(abc);
        }







    }

}

