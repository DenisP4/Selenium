package com.noorteck.interview.java;

import java.util.LinkedHashMap;

public class Exercise11 {
	

		
		
		public static void main(String[] args) {
			
			String s1 = "listen";
			
			String s2 = "";
			
			boolean isAnagram = true;
			
			//convert to charArray
			char [] s1Char = s1.toCharArray();
			char [] s2Char = s2.toCharArray();
			
			LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer> ();
			
			
			if(s1Char.length != s2Char.length) {
				
				isAnagram = false;
				
			} else {
				
				for(int i = 0; i<s1Char.length; i++) {
					
					
					if(map.containsKey(s1Char[i])) {
						map.put(s1Char[i], map.get(s1Char[i])+1);
						
					}else {
						map.put(s1Char[i], 1);
					}
				}
				

				//loop 2
				for(int i = 0; i<s2Char.length; i++) {
					
					if(map.containsKey(s2Char[i])) {
						
						if(map.get(s2Char[i]) == 1) {
							map.remove(s2Char[i]);
						}else {
							map.put(s2Char[i], map.get(s2Char[i])-1);
						}
						
					} else {
						isAnagram = false;
						break;
					}
		
				}	 
			}
			
			
			
			//now check the size of the map. if the size > 0 then it is NOT anagram else 
			if(isAnagram) {
				System.out.println(s1  + " and " + s2 + " is anagram");
				 
			} else {
				System.out.println(s1  + " and " + s2 + " is not anagram");
			}

		}

	}

