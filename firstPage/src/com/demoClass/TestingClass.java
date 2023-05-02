package com.demoClass;

import org.omg.CORBA.INTERNAL;

import java.util.*;

public class TestingClass {
    public static void main (String Args[]){

        ArrayList<String> list1 = new ArrayList();
        list1.add("AB");
        list1.add("ML");
        //System.out.println(list1+ " -list1");
        Iterator iterator = list1.iterator();
        while (iterator.hasNext()){
            String newiter = (String) iterator.next();
            //System.out.println(newiter + " -iterator");
        }

        for (int i =1; i < list1.size(); i++){
            //System.out.println(list1.get(i) + " -forloop");
        }

        for (String element:list1) {
            //System.out.println(element + " -element");
        }


        LinkedHashMap <String, String> map1 = new LinkedHashMap<>();
        map1.put("A", "Apple");
        map1.put("B","Banana");
        map1.put("C","Cat");
        // System.out.println(map1 + " -map1");
        for(String elementMap : map1.keySet()){
            //System.out.println(elementMap+ " - lementMap");
            String map1Value = map1.get(elementMap);
            //System.out.println(map1Value + " -map1Value");
        }

        LinkedHashMap <String, String> map2 = new LinkedHashMap<>();
        map2.put("D", "Donut");
        map2.put("E","Egg");
        map2.put("F","Fish");
        //System.out.println(map2 + " -map2");

        for(String m2Key :map2.keySet()){
            String m2Val = map2.get(m2Key);
            //System.out.println(m2Key + " -m2- " + m2Val);
            //System.out.println(element + " -element");
        }

        for(Iterator iter = map2.entrySet().iterator(); iter.hasNext();){
            Map.Entry mFor = (Map.Entry)iter.next();
            //System.out.println(mFor + " mFor");
           // String m2key = mFor.getKey().toString();
            //System.out.println(m2key + " -m2key");
        }

        LinkedHashMap <String , LinkedHashMap<String,String>> nestedMap = new LinkedHashMap<>();
        nestedMap.put("Map1",map1);
        nestedMap.put("Map2",map2);
        //System.out.println(nestedMap + " -nestedMap");

        Iterator iter = nestedMap.entrySet().iterator();
        //System.out.println(iter + " -iter");
        while (iter.hasNext()){
            Map.Entry mapPair = (Map.Entry)iter.next();
            //System.out.println(mapPair + " -mapPair");
            String nestKey = mapPair.getKey().toString();
            //System.out.println(nestKey + " -nestKey");
            LinkedHashMap innerMap1 = (LinkedHashMap) mapPair.getValue();
            //System.out.println(innerMap1 + " -innerMap1");
            Iterator inneriter = innerMap1.entrySet().iterator();
            while (inneriter.hasNext()){
                Map.Entry innerPair1 = (Map.Entry)inneriter.next();
                //System.out.println(innerPair1 + " -innerPair1");
                String innerValue = (String) innerPair1.getValue();
                //System.out.println(innerValue + " -innerValue");
            }

        }

        for(Iterator nestediter = nestedMap.entrySet().iterator(); nestediter.hasNext();){
            Map.Entry nEntry = (Map.Entry)nestediter.next();
            //System.out.println(nEntry + " -nEntry");
            LinkedHashMap innerMap = (LinkedHashMap) nEntry.getValue();
            //System.out.println(innerMap + " -innerMap");
            for (Iterator innerIterator = innerMap.entrySet().iterator(); innerIterator.hasNext();){
                Map.Entry innerEntry = (Map.Entry) innerIterator.next();
                // System.out.println(innerEntry + " -innerEntry");
                //System.out.println(innerEntry.getKey() + " -map- " + innerEntry.getValue());
            }
        }


        for(Map.Entry nestedEntryPair : nestedMap.entrySet()) {
            String mapKey = (String) nestedEntryPair.getKey();
            //System.out.println(mapKey + " mapKey");
            LinkedHashMap<String,String> mapVal = (LinkedHashMap) nestedEntryPair.getValue();
            //System.out.println(mapVal + " mapVal");
            for(Map.Entry innerEntryPair : mapVal.entrySet()){
                //System.out.println(innerEntryPair + " -innerEntryPair");
                //System.out.println(innerEntryPair.getKey() + " -innerKey");
                //System.out.println(innerEntryPair.getValue() + " -innerValue");
            }
        }

        for(int i =1; i<=5; i++){
            //System.out.println(i + " -for");
        }

        int i=1;
        while (i <= 5){
            //System.out.println(number + " -number");
            i++;
        }



        LinkedHashMap<Integer, LinkedHashMap<Integer, LinkedHashMap <Integer, Character>>> term = new LinkedHashMap<>();

        LinkedHashMap<Integer,Character> act = new LinkedHashMap<>();
        int ictno=11;
        for(char cact = 'A'; cact<= 'D'; cact++){
            ictno++;
            //System.out.println(cact + " -act- " + ictno);
            act.put(ictno,cact);
        }
        //System.out.println(act + " -act");


        LinkedHashMap<Integer, LinkedHashMap<Integer,Character>> sub = new LinkedHashMap<>();
        for (int isub=1; isub<=5; isub++){
            //System.out.println(isub + " -isub");
            sub.put(isub,act);
        }
        //System.out.println(sub + " -sub");

        for(int tint=100; tint<=103; tint++){
            term.put(tint,sub);
        }
        //term.put(32,sub);
        //System.out.println(term + " -term");

        //Iterator iterator12 = term.entrySet().iterator();
        for (Map.Entry<Integer, LinkedHashMap<Integer, LinkedHashMap<Integer, Character>>> termmapPair : term.entrySet()){
            //System.out.println(termmapPair.getValue() + " -termmapPair");
            LinkedHashMap <Integer, LinkedHashMap<Integer,Character>> nesttermMap = termmapPair.getValue();
            //System.out.println(nesttermMap + " -nesttermMap");
            for(Map.Entry innerNestedMap : nesttermMap.entrySet()){
                //System.out.println(innerNestedMap + " -innerNestedMap");
                //System.out.println(innerNestedMap.getKey() + " innerNestedMap "  + innerNestedMap.getValue());
                LinkedHashMap<Integer,Character> inMap =  (LinkedHashMap) innerNestedMap.getValue();
                //System.out.println(inMap + " -inMap");
                for (Map.Entry iMap : inMap.entrySet()){
                    //System.out.println(iMap + " -iMap ");
                    System.out.println(iMap.getKey() + " - " + iMap.getValue());
                }
            }
        }


    }
}
