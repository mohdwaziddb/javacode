package com.demoClass;
import java.util.*;

public class NewFile123 {
	
	String name ="";
	public void demo(String name) {
		ArrayList <String> fA = new ArrayList();
		fA.add(name);
		
		System.out.println(" data ="+fA);
	
	}
	
	
	

	public static void main(String[] args) {
		
		NewFile123 nw =  new NewFile123();
		Object st= new staticCall();
		
		//st.showName();
		
		nw.demo("hello");
		
		
		
//		for(int i=0; i<5; i++){
//			System.out.println(i);
//		}
		
		
//		System.out.println(fA);
		
//		for(int i=0; i<fA.size(); i++) {
//			System.out.println(fA.get(i) + "-" + i);
//		}

	}

}
