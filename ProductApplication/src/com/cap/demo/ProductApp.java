package com.cap.demo;

public class ProductApp {
	
	int[] a = {1,2,3,4};

	public void productDisplay(){
		for (int i = 0; i < a.length; i++) {
			System.out.println("Data:"+i);
			System.out.println("Loop modified");
			System.out.println("Loop modified 2");
		}
	}
}
