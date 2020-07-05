package com.noorteck.interview.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex25 {
	
	
	public static void main(String[] args) {
		
		ArrayList<String> stateList=new ArrayList<String>();
		
		//for loop
		for(int i = 0; i<=stateList.size()-1;i++) {
			System.out.println(stateList.get(i));
			
		}
		
		System.out.println("============================");
		
		//while 
		int x=0;
		while(x<=stateList.size()-1) {
			System.out.println(stateList.get(x));
			x++;
		}
		
		//do while loop
		
		int y=0;
		do {
			System.out.println(stateList.get(y));
			y++;
			
		}while (y<=stateList.size()-1);
		System.out.println("**************************************");
		
		for(String state:stateList) { //For each loop
			System.out.println(state);
		}
		
		System.out.println("================================");
		
		/**
		 * Create iterator object hasNext() -->to check if we have next element 
		 * next()-->retrieves the value of next element and move the cursor to remove()
		 * 
		 */
		
		Iterator it=stateList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("****************************");
		
		ListIterator lit= stateList.listIterator();
		
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("=======================");
	
	while(lit.hasPrevious()) {
		System.out.println(lit.previous());
	}
	}	

}
