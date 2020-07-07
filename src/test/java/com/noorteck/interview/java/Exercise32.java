package com.noorteck.interview.java;

import java.util.TreeSet;

public class Exercise32 {
	
		public static void main(String[] args) {
			
			
			Integer [] num = {12,23,23,77,32,12};
			
			
			TreeSet <Integer> list = new TreeSet <Integer>();
			
			// Iterrate trough array & add numbers in our TreeSet:
			
			for(int i= 0; i< num.length; i++) {
				
				list.add(num[i]);
				
			}
			
			System.out.println(list);
		}

	}


