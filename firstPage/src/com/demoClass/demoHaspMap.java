package com.demoClass;

import java.security.KeyStore.Entry;
import java.util.*;

public class demoHaspMap {
    public static void main (String[]args) {

        HashMap<String, Integer> demoHash = new HashMap<>();
        demoHash.put("one", 1);
        demoHash.put("two", 2);
        demoHash.put("four", 3);


        demoHash.put("one", 10);
        //demoHash.putIfAbsent("one", 15);
        //System.out.println(demoHash);
        System.out.println(demoHash.get("two"));
        System.out.println(demoHash.containsKey("one"));

        //demoHash.replace("one", 10, 20);
        //demoHash.remove("two");
        //demoHash.remove("two" , 9);
        System.out.println(demoHash);
//		System.out.println(demoHash.keySet());
//		System.out.println(demoHash.values());
//		System.out.println(demoHash.entrySet());

        for(Map.Entry ab : demoHash.entrySet()) {
            System.out.println(ab.getKey() + " - " + ab.getValue());
        }

        System.out.println("Size of Map - " + demoHash.size());
        //Removing element form linked Map
//		demoHash.clear();
//		System.out.println("Removing element form linked Map - " + demoHash);


        HashMap <Integer, String> firstMap = new HashMap <Integer, String>();
        firstMap.put(1, "First");
        firstMap.put(2, "Second");
        firstMap.put(3, "Third");
        System.out.println(firstMap);

        HashMap <Integer, String> secondMap = new HashMap <Integer, String>();
        secondMap.put(4, "Four");
        secondMap.put(5, "Five");
        secondMap.put(6, "Six");
        System.out.println(secondMap);

        if(firstMap.containsValue("Second")) {
            System.out.println("True - " + firstMap.get(2));
        } else {
            System.out.println("False");
        }

        // Creating Set View for Map
        Set demoSet = firstMap.entrySet();
        System.out.println(demoSet);

        String firstVal = firstMap.get(1);
        System.out.println("Value of Key 1 - " +firstVal);

//		var result = firstMap.isEmpty();
//		System.out.println(result);
//
//		firstMap.clear();
//
//		result = firstMap.isEmpty();
//		System.out.println(result);

//		firstMap.putAll(secondMap);
//		System.out.println(firstMap);
//



    }

}

