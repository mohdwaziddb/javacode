package newJavaProj;

import java.util.*;

public class onlyAllMethod {
	public static void main(String[] args) {
		//1.add(Object element): Adds an element to the end of the list.
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		//2.add(int index, Object element): Inserts an element at a specified index.
		list.add(1, "grape");
		
		//3. addAll(Collection c): Adds all elements in a collection to the end of the list.
		List<String> fruits = new ArrayList<>();
		fruits.add("pear");
		fruits.add("watermelon");
		list.addAll(fruits);
		
		//4. addAll(int index, Collection c): Inserts all elements in a collection at a specified index.
		List<String> berries = new ArrayList<>();
		berries.add("strawberry");
		berries.add("blueberry");
		list.addAll(2, berries);
		
		//5. remove(int index): Removes the element at a specified index.
		list.remove(2);
		
		//6. remove(Object element): Removes the first occurrence of the specified element from the list.
		list.remove("apple");
		
		//7. removeAll(Collection c): Removes all elements in a collection from the list.
		list.removeAll(fruits);
		
		//8. retainAll(Collection c): Removes all elements from the list except those in a collection.
		//list.retainAll(berries);
		
		//9. clear(): Removes all elements from the list.
		//list.clear();
		
		//10. get(int index): Returns the element at a specified index.
		//String fruit = list.get(0);
		//System.out.println(fruit + " -fruit");
		
		//11. set(int index, Object element): Replaces the element at a specified index with a new element.
		//list.set(1, "cherry");
		
		//12. indexOf(Object element): Returns the index of the first occurrence of the specified element, or -1 if the element is not found.
		//int index = list.indexOf("banana");
		//System.out.println(index + " -index");
		
		//13. lastIndexOf(Object element): Returns the index of the last occurrence of the specified element, or -1 if the element is not found.
		//int lastIndex = list.lastIndexOf("blueberry");
		//System.out.println(lastIndex + " -lastIndex");
		
		//14. size(): Returns the number of elements in the list.
		//int size = list.size();
		//System.out.println(size + " -size");
		
		//15. isEmpty(): Returns true if the list is empty.
		//boolean empty = list.isEmpty();
		//System.out.println(empty + " -empty");
		
		//16. contains(Object element): Returns true if the list contains the specified element.
		//boolean contains = list.contains("cherry");
		//System.out.println(contains + " -contains");
		
		//17. containsAll(Collection c): Returns true if the list contains all elements in a collection.
		boolean containsAll = list.containsAll(berries);
		//System.out.println(containsAll + " -containsAll");
		
		//18. toArray(): Returns an array containing all of the elements in the list.
		Object[] array = list.toArray();
//		for (int i=0; i<array.length; i++) {
//			System.out.println(i + " - " +array[i] + " -toArray()");
//		}
		
//		for (Object i : array) {
//			System.out.println(i + " -array");
//		}
		
		//19. toArray(Object[] a): Returns an array containing all of the elements in the list, using the specified array if it is large enough.
		String[] array1 = new String[list.size()];
		array1 = list.toArray(array1);
		for (Object i : array1) {
			//System.out.println(i + " -array1");
		}
		
//		System.out.println(array1 + " -array1");
		
		//20. iterator(): Returns an iterator over the elements in the list.
//		Iterator<String> iterator = list.iterator();
//		while (iterator.hasNext()) {
//		    String element = iterator.next();
//		    System.out.println(element);
//		}
		
		//21. listIterator(): Returns a list iterator over the elements in the list.
//		ListIterator<String> listIterator = list.listIterator();
//		while (listIterator.hasNext()) {
//		    String element = listIterator.next();
//		    System.out.println(element);
//		}
		
		//22. listIterator(int index): Returns a list iterator over the elements in the list, starting at a specified index.
//		ListIterator<String> listIterator1 = list.listIterator(2);
//		while (listIterator1.hasNext()) {
//		    String element = listIterator1.next();
//		    System.out.println(element);
//		}
		
		//23. subList(int fromIndex, int toIndex): Returns a view of the portion of the list between the specified fromIndex (inclusive) and toIndex (exclusive).
		List<String> sublist = list.subList(0, 2);
		///System.out.println(sublist + " -sublist");
//		
		//24. ensureCapacity(int minCapacity): Increases the capacity of the ArrayList to at least the specified minimum capacity.
		list.ensureCapacity(10);
		
		//25. trimToSize(): Trims the capacity of the ArrayList to the current size of the list.
//		list.trimToSize();
		
		//26. sort(Comparator<? super E> c): Sorts the elements of the ArrayList according to the specified Comparator.
		//list.sort(Comparator.comparing(String::length));
		
		//27. spliterator(): Creates a Spliterator over the elements in the ArrayList.
//		Spliterator<String> spliterator = list.spliterator();
		
		
		//System.out.println(list + " -list");
		
		
//		ArrayList l new ArrayList();
//		l.add(10);
//		l.add("Ab");
//		System.out.println(l);
		
		ArrayList<String> alp = new ArrayList<String>();
		for(char c = 'A'; c <= 'Z'; c++) {
			alp.add(String.valueOf(c));
			//System.out.println(c + " -c");
        }		
		//System.out.println(alp + " - alphabets");
		
		
		
		ArrayList<Integer> nl = new	ArrayList<>();
		ArrayList<Integer> nlist = new	ArrayList<>();
		
		for(int i =0; i<=6; i++) {
			nl.add(i);
		}
		
		//System.out.println(nl);
		
		Iterator it = nl.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next());
			Integer newi = (Integer) it.next();
			//System.out.println(newi);
			if(newi % 2 == 0) {
				nlist.add(newi);
				//System.out.println(newi + " - if");
			}else {
				//System.out.println(newi + " - else");
			}
		}
		
		//System.out.println(nlist + " - nlist");
		
		
		List<Integer> li = new ArrayList<>();
//		li.add(10);
//		li.add(5);
//		li.add(9);
//		li.add(20);
		for (int i=0; i<=6; i++) {
			li.add(i);
		}
		
		Iterator<Integer> iterator = li.iterator();
		while(iterator.hasNext()) {
			int number = iterator.next();
			if(number%2==0) {
				//System.out.println(number + " - if");
			}else {
				iterator.remove();
			}
		}
		
		//System.out.println(li + " -iterator");
		
		ListIterator<Integer> num = li.listIterator();
		while (num.hasNext()) {
			int number = num.next();
			if (number%2 ==0) {
				//System.out.println(number + " -number");
			}else {
				num.remove();
			}
		}
		
		//System.out.println(li + " -li");
		
		
		
		
		
		
		
		
		
		
		
		
		ArrayList<Integer> newList = new ArrayList<>();
		for (int i=0; i<=8; i++) {
			newList.add(i);
		}
		//System.out.println(newList + " -l1");
		Iterator<Integer> it1 = newList.iterator();
		//System.out.println(it1 + " -it1");
		while (it1.hasNext()) {
			//System.out.println(it1.next());
			int it2 = it1.next();
			//System.out.println(it2+ " -it2");
			if(it2 % 2 == 0) {
				//System.out.println(it2 + " -if");
			}else {
				//System.out.println(it2 + " -else");
				it1.remove();
			}
		}
		//System.out.println(newList + " -newList");
		
		
		LinkedList<String> list123 = new LinkedList<>();
		list123.add("Mango");
		list123.add("Apple");
		list123.add("Banana");
		
		System.out.println(list123 + " -list123");
		ListIterator ltr = list123.listIterator();
		while (ltr.hasNext()) {
			String sl = (String)ltr.next();
			//System.out.println(sl);
			if(sl.equals("Apple")) {
				ltr.remove();
				//System.out.println(sl + ", -remove ");
			}else if (sl.equals("Banana")) {
				ltr.add("New Fruit");
				//System.out.println(sl + ", -add ");
			}else if(sl.equals("Mango")) {
				ltr.set("New");
				//System.out.println(sl + ", -set ");
			}
		}
		
		System.out.println(list123);
		
		//Three Cursors of Java
		Vector<Integer> v = new Vector<>();
		
		Enumeration<Integer> e=v.elements();
		Iterator<Integer> i=v.iterator();
		ListIterator lit = v.listIterator();
		
		System.out.println(e.getClass().getName());
		System.out.println(i.getClass().getName());
		System.out.println(lit.getClass().getName());
		
		
		
		
		
		
		
		
		
		
		
	}

}
