package com.demoClass;
import java.util.Comparator;
import java.util.TreeSet;

public class decendingOrdTreset {

	public static void main(String[] args) {
        
        // Create a custom comparator class for sorting elements in descending order
        class MyComparator implements Comparator<Integer> {
            public int compare(Integer a, Integer b) {
                if (a < b) {
                    return 1;
                } else if (a > b) {
                    return -1;
                } else {
                    return 0;
                } 
//            	return -a.compareTo(b);
//            	return b.compareTo(a);

            }
        }
        
        // Create a TreeSet with the custom comparator
        TreeSet<Integer> descendingTreeSet = new TreeSet<>(new MyComparator());

        // Add some elements to the TreeSet
        descendingTreeSet.add(10);
        descendingTreeSet.add(5);
        descendingTreeSet.add(20);
        descendingTreeSet.add(15);

        // Print the TreeSet to verify the order
        System.out.println(descendingTreeSet);
    }
}
