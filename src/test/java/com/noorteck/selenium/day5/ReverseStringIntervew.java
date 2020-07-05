
package com.noorteck.selenium.day5;

public class ReverseStringIntervew {

	
	public static void main(String[] args) {
		
		//Write a Java program to reverse the given String
		
		String str="Java Programming";
		
		System.out.println(reverseString(str));
		System.out.println(reverseString("Jawed"));
		System.out.println(reverseString("Denis"));
		
		//convert String str into char [] array
		
		char[] strCharArr=str.toCharArray();
		
		for(int i = strCharArr.length-1; i>=0;i--) {
			System.out.print(strCharArr[i]);
		}
		
	}
		
		 public static String reverseString(String str) {
			
			//Convert String to character array by using toCharArray() method
			//and store in char [] variable
			
			char[] strToCharArr=str.toCharArray();
			String rStr="";
			
			for(int i = strToCharArr.length-1;i>=0;i--) {
				rStr=rStr+strToCharArr[i];
				
			}
			return rStr;
		}
		
	}

