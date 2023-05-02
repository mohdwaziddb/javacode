package com.demoClass;
import java.util.*;

public class sortwithLength {
	
	public static void main(String[] args) {
		
		TreeSet<String> t = new TreeSet<>(new myComparator());
		t.add("AA");
		t.add("CCCC");
		t.add("EEE");
		t.add("DDDDD");
		System.out.println(t + " -t");		
		
	}
}

class myComparator implements Comparator{
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		
		int l1 = s1.length();
		int l2 = s2.length();
		
		if (l1 < l2) {
			return -1;
		}else if (l1 > l2) {
			return +1;
		}else {
			 //return 0;
			return s1.compareTo(s2);
			}
		}
	}
