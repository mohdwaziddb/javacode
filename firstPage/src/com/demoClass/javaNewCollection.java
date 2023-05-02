package com.demoClass;
import java.util.*;
import java.util.Collection.*;

public class javaNewCollection {
	public static void main (String[]args) {
	//arraylist
	List<Integer> list = new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	
	//System.out.println(list + " -- list");
	//add element to index value
	list.add(1, 30);
	//System.out.println(list + " -- list");
	
	List<Integer> list1 = new ArrayList<>();
	list1.add(6);
	list1.add(7);
	list1.add(9);
	
	list.addAll(list1);
	//System.out.println(list + " --");
	//System.out.println(list.get(3));
	list.remove(Integer.valueOf(9));
	//System.out.println(list + " --=");
	
	list.set(1, 100);
	//System.out.println(list + " --+");
	//for loop
	for(int i=0; i<list.size(); i++) {
		//System.out.println(list.get(i));
	}
	// for each loop
	for (int num : list) {
		//System.out.println(num + " --num foreach");
	}
	
	//System.out.println(list.size() + " -size");
	
//	while (list.size()<0) {
//		System.out.println(list + " -whileloop");
//	}
	
	// 
	
	Iterator <Integer> it = list.iterator();
	//System.out.println(it.next() + " ---it");
//	while (it.hasNext()) {
//		System.out.println(it.next());
//	}
	
	
	//Stack Class
	//(LIFO) last in first out example : balti
	Stack <String> nList = new Stack<>();
	nList.add("Apple");
	nList.push("Banana");
	nList.push("Mango");
	
	//System.out.println(nList + " --nList");
	//System.out.println(nList.peek() + " --peak");
	//find first value
	
	nList.pop();
	//remove last value
	//System.out.println(nList + " --pop");
	
	
	// Queue Interface
	Queue <String> queue = new LinkedList<>();
	
	//dont use add() , element() , remove() its show exception in the code for Queue.
	queue.offer("First");
	queue.offer("Second");
	queue.offer("Third");
	System.out.println(queue + " --queue");
	
	System.out.println(queue.peek() + " --peek");
	//System.out.println(queue.poll() + " --poll");
	queue.poll();
	System.out.println(queue + "----list");	
	//System.out.println(queue.remove() + " --poll");
	
	
	
	// Priority Queue
	Queue <Integer> plist = new PriorityQueue<>();
	plist.offer(2);
	plist.offer(5);
	plist.offer(3);
	plist.offer(1);
	
	System.out.println(plist + " --plist");	
	plist.poll();
	System.out.println(plist + " --plist");	
	
	
	
	//ArrayDeque
	ArrayDeque<Integer> adq = new ArrayDeque<>();
	adq.offer(10);
	adq.offer(7);
	adq.offer(20);
	adq.offerFirst(1);
	adq.offerLast(100);
	System.out.println(adq + " --ArrayDeque");
	//System.out.println(adq.peek());
	adq.poll();
	System.out.println(adq + " --poll");
	System.out.println(adq.peek());
	adq.pollLast();
	System.out.println(adq + " --pollLast");
	
	
	//SET
	Set<Integer> set = new TreeSet<>();
	set.add(5);
	set.add(10);
	set.add(15);
	set.add(7);
	set.add(1);
	
	System.out.println(set + " -sets");
	set.remove(15);
	System.out.println(set + " -remove");
	System.out.println(set.contains(7) + " -contains");
	System.out.println(set.isEmpty() + " -isEmpty");
	System.out.println(set.size() + " -size");
	
	
	//MAP
	Map <String, Integer> nMap = new HashMap<>();
	nMap.put("Mango", 2);
	//nMap.put("Apple", 1);
	nMap.put("Banana", 5);
	nMap.put("Graph", 3);
	
	nMap.putIfAbsent("New Fruit", 1);
	//System.out.println(nMap + " - nMap HashMap");
	
	Map <String, Integer> nMap1 = new LinkedHashMap<>();
	nMap1.put("Mango", 2);
	nMap1.put("Apple", 1);
	nMap1.put("Banana", 5);
	nMap1.put("Graph", 3);
	//System.out.println(nMap1 + " - nMap1 LinkedHashMap");
	
	Map <String, Integer> nMap2 = new TreeMap<>();
	nMap2.put("Mango", 2);
	nMap2.put("Apple", 1);
	nMap2.put("Banana", 5);
	nMap2.put("Graph", 3);
	System.out.println(nMap2 + " - nMap2 TreeMap");
	
	
	
	//Iterating Map
	for (Map.Entry<String, Integer> e : nMap2.entrySet()) {
		System.out.println(e + " -map-iterate");
		//System.out.println(e.getKey() + " -getKey");		
	}
	
//	for (String key : nMap2.keySet()) {
//		System.out.println(key + " -key");
//	}
	
	for (Integer value : nMap2.values()) {
		System.out.println(value);
	}
	
	
	
	Map<String, Integer> map123 = new LinkedHashMap<>();
	map123.put("Deepak", 1);
	map123.put("Gagan", 10);
	map123.put("Rishi", 8);
	map123.put("Kajal", 5);
	map123.put("Shivani", 11);
	
	System.out.println(map123);
	
	
	
	
	
	
	}
}
