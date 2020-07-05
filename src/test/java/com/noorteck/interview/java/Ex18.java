package com.noorteck.interview.java;

public class Ex18 {
	
	public static void main(String[] args) {
		
		int numOne[]= {1,32,3,34,5,7};
		int numTwo[]= {2,55,8,9,5,7,10,20}; //common elements are 5 and 7
		
		
		for(int i=0; i<numOne.length;i++) {
			
			for(int j= 0; j<numTwo.length;j++) {
				
				if(numOne[i]==numTwo[j]) {
					System.out.println("Common value:"+numOne[i]);
				}
			}
		}
		
		
	}

}
