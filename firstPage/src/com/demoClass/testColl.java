package com.demoClass;

import java.util.*;

public class testColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(30);
		al.add(25);
		//define index value by typing index value like this
		al.add(100);		
		System.out.println(al + " -al");
		
		
		
//		al.remove(1);
//		//System.out.println(al.contains("Roll") + " -contain");
		//System.out.println(al + " -String");
		//System.out.println(al.toString()+ " -toString");
		
		String nal = al.toString();
		//Collections.sort(al);
		System.out.println(nal + " -Stringnal");
		
		int a = al.indexOf(20);
		System.out.println(a);
		int b = al.indexOf(25);
		System.out.println(b);
		System.out.println(a+b);
		
//		for (int fc : al) {
//			System.out.println(fc);
//		}
//		
//		
//		//loop
//		for (String nAL : al) {
//			System.out.println(nAL + " -foreachloop");
//		}		
//		Iterator it = al.iterator();
//		//System.out.println(it.next());
//		while (it.hasNext()) {
//			System.out.println(it.next() + " -whileloop");
//		}
		for (int i=0; i<al.size(); i++) {
			System.out.println(i + " -forloop");
		}
		
		
		List <String> nlist = new ArrayList<>();
		nlist.add("Name");
		nlist.add("Roll");
		nlist.add("ID");
		
		System.out.println(nlist + " -nlist");
		
		
		
	}
	

}
