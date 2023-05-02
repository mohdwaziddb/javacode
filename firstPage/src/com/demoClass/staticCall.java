package com.demoClass;

public class staticCall {
	
	staticCall(){
		System.out.println("Constructor called");
	}

	public void showName() {
		System.out.println("Non-Static Method");
	}
	
	public static void showNameSatic() {
		System.out.println("Static Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticCall sc = new staticCall();
		sc.showName();
		staticCall.showNameSatic();
	}
}

//class Gagan{
//	
//	staticCall sc = new staticCall();
//
//}
