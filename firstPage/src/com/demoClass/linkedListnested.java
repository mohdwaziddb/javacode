package com.demoClass;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

public class linkedListnested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a nested LinkedHashMap
		LinkedHashMap<String, LinkedHashMap<String, Integer>> nestedMap = new LinkedHashMap<>();

		// Add elements to the nested map
		LinkedHashMap<String, Integer> subMap1 = new LinkedHashMap<>();
		subMap1.put("A", 1);
		subMap1.put("B", 2);
		nestedMap.put("First", subMap1);		
		System.out.println(subMap1 + " subMap1");
		
		Set s = subMap1.entrySet();
		System.out.println(s + " s");
		Collection c = subMap1.values();
		System.out.println(c + " c");
		Set kt = subMap1.keySet();
		System.out.println(kt + " kt");
		
		Iterator itr = s.iterator();
//		while(itr.hasNext()) {
//		Map.Entry ss = (Map.Entry)itr.next();
//		System.out.println(ss.getKey() + " - key, " + ss.getValue() + " - value ");
//		}
		
		String ss12 = null;
		int ss3 = 0;
		//int[] sA = new int[5];
		ArrayList<String> nl = new ArrayList<>();
//		for (Map.Entry<String, Integer> entry : subMap1.entrySet()) {
//			for (int i=0; i<2; i++) {
//				nl.add(entry.getKey());
//			}			
//			ss3 = entry.getValue();			
//			//System.out.println(sA);
//		}
		//System.out.println(nl + " - ss3");
		
		//int i=0;
		//itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry ss = (Map.Entry)itr.next();
			
			nl.add((String) ss.getKey());
			//System.out.println(nl + " -nl");
			
		}
		
		System.out.println(nl + " nl");

		LinkedHashMap<String, Integer> subMap2 = new LinkedHashMap<>();
		subMap2.put("C", 3);
		subMap2.put("D", 4);
	    nestedMap.put("Second", subMap2);		
		//System.out.println(subMap2 + " subMap2");
		
		//System.out.println(nestedMap + " nestedMap");
		// Access elements in the nested map
//		System.out.println(nestedMap.get("First").get("A")); // Output: 1
//		System.out.println(nestedMap.get("Second").get("D")); // Output: 4
	    
//	    LinkedHashMap <String , LinkedHashMap<String, Integer>> outerMap = new LinkedHashMap();
//	    LinkedHashMap<String, Integer> innermap = new LinkedHashMap();
	    
	    LinkedHashMap<Integer, Character> chaMap = new LinkedHashMap<>();
	    Integer ikey=0;
	    for(char ch = 'A'; ch <= 'Z'; ch++) {
	    	//System.out.print(ch + " ");
	    	ikey++;
	    	//System.out.println(chaMap.put(ikey, ch));
	    	chaMap.put(ikey, ch);	    	
	    }
	    System.out.println(chaMap + " -");
	    //System.out.println( chaMap.keySet());
	    
	    
	    // 1st Method
	    for (Integer i1 : chaMap.keySet()) {	   	
	    	char n = chaMap.get(i1);
	    	//System.out.println(n + " - " + i1);
	    }
	    
	    
	    // 2nd Method 
	   Set s3 = chaMap.entrySet();
	   //Iterator i3 = chaMap.entrySet().iterator();
	   Iterator i3 = s3.iterator();
	   while(i3.hasNext()) {
		   Map.Entry<Integer, Character> entry = (Entry<Integer, Character>) i3.next();
		   //System.out.println(entry.getKey() + " - " + entry.getValue());
	   }
	   
	   
	   // 3rd Method 
	   for (Map.Entry<Integer, Character> entry : chaMap.entrySet()) {
		    Integer key = entry.getKey();
		    Character value = entry.getValue();
		    //System.out.println(key + ": " + value);
		}	   
	   
	   // 4th Method 
	   Iterator<Integer> keyIterator = chaMap.keySet().iterator();
	   while (keyIterator.hasNext()) {
		   //System.out.println(keyIterator.next());
	       Integer key = keyIterator.next();
	       Character value = chaMap.get(key);
	       System.out.println(key + " : " + value);
	   }
	   
	   
	   LinkedHashMap<Integer,Integer> tTab = new LinkedHashMap();
	   for(int i=1; i<=10; i++) {
		   //System.out.println(i + " - " +  i*2);
		   tTab.put(i, i*2);		   
	   }
	   //System.out.println(tTab);
//	   for(Integer it : tTab.keySet()) {
//		   System.out.println(it + " : " + tTab.get(it));
//	   }
	   
	   List<Map.Entry<Integer, Integer>> list = new ArrayList<>(tTab.entrySet());
	   Collections.sort(list,new sortbyValue());
	   //System.out.println(list.get(1).getValue());
	   System.out.println(list);
	  
//	   for(int i =0; i< list.size(); i++) {
//		   System.out.println(list.get(i).getValue());
//	   }
	   
	   
	   LinkedHashMap<Integer, Integer> sortedmap = new LinkedHashMap<>();
	   int i=0;
	   for(Map.Entry<Integer, Integer> entryset : list) {
		   i++;
		   sortedmap.put(i, entryset.getValue());
		   System.out.println(entryset.getKey() + " - " + entryset.getValue() + " - " + i);
		   
	   }
	   
	   sortedmap.put(3, 1000);
	   System.out.println(sortedmap + " -sortedmap");
	   
	   
	   //Set s123 = tTab.entrySet();
	   //System.out.println(list + " -list");
	   //System.out.println(s123 + " -s123");	
	   
	   
//Example:- 
//1) Convert Array to List
	   String[] name = new String[3];
	   name[0] = "AB";
	   name[1] = "ML";
	   name[2] = "NA";
	   //System.out.println(name[2]);
	   for(int ia=0; ia<name.length; ia++) {
		   System.out.println(name[ia] + " <-> name Array");
	   }
	   
	   List<String> nameList = Arrays.asList(name);
	   System.out.println(nameList + " <-> nameList");
	   
//2) List to Array
	   List<String> name1 = new ArrayList<>();
	   name1.add("Ab");
	   name1.add("Ml");
	   name1.add("Na");
	   System.out.println(name1 + " <-> name1 List");
	   // iterating list with forEach loop
	   for(String al : name1) {
		   System.out.println(al + " <-> foreach loop");
	   }
	   
	   // iterating list with while loop
	   Iterator it = name1.iterator();
	   while(it.hasNext()) {
		   String abc=(String) it.next();
		   System.out.println(abc + " <-> while loop");
	   }
	   
	   // iterating list with for loop
	   name1.remove(2);
	   for(int iab = 0; iab < name1.size(); iab ++) {
		   System.out.println(name1.get(iab) + " <-> for loop");
	   }
	   
	   String[] nameA = name1.toArray(new String[0]);
	   //System.out.println(nameA + " nameA");
	   for(int ib=0; ib<nameA.length; ib++) {
		   System.out.println(nameA[ib] + " <-> nameA Array");
	   }
//3) Reverse collection and Shuffle
	   List<String> l = new ArrayList<>();
	   l.add("Apple");
	   l.add("Mango");
	   l.add("Banana");
	   l.add("Graph");
	   System.out.println(l + " <-> List");	   
	   Collections.reverse(l);
	   //Collections.shuffle(l);
	   System.out.println(l + " <-> List Reverse or Shuffle");
	   System.out.println(l.size() + " <-> List Size");
	   System.out.println(l.isEmpty() + " <-> List isEmpty ?");
	   
	}

}

class sortbyValue implements Comparator<Map.Entry<Integer, Integer>>{

	public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
		//System.out.println(o2 + " - " + o1);
		return o2.getValue().compareTo(o1.getValue());
	}	
}






