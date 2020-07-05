package com.noorteck.interview.java;

public class Exercise17 {

	public static void main(String[] args) {
		
		int numOne[]= {1,32,3,34,5,6,7};
		
		int numTwo [] = {1,32,3,5,6,7,34,10,20};
		
		
		//get the size of each
		int numOneSize=numOne.length;
		int numTwoSize=numTwo.length;
		
		boolean isArrayEqual=true;
		
		//check the size first
		if(numOneSize==numTwoSize) {
			//They are equal so far...
			
			for(int i=0 ;i<numOneSize; i++) {
				
				if(numOne[i] != numTwo[i] ) {
					
					isArrayEqual=false;
					
				break;
				}
			}
				}else {
                  isArrayEqual=false;	//they are not equal....			
				
			}
			
	if(isArrayEqual) {
		
		System.out.println("Two Arrays are equal");
		
		}else {
			System.out.println("Two Arrays are not equal");
		}
	}
}
