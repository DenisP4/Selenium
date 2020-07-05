package com.noorteck.interview.java;

public class Demo {
	
	public static void main(String[] args) {
		
		int [] numOne= {1,2,3,4,5};
		int [] numTwo= {1,2,4,6,8};
		
		//check the size
		
		 int numOneSize= numOne.length;
		 int numTwoSize=numTwo.length;
		 
		 boolean arrayAreEqual=true;
		 
		
		 if(numOneSize ==numTwoSize) {
			 for(int i=0; i<numOneSize;i++) {
				 
				if ( numOne[i] != numTwo[i]) {
					arrayAreEqual = false;
					
				}else {
					arrayAreEqual=true;
				}
			 }
		 }else {
			 arrayAreEqual=false;
		 }
		if(arrayAreEqual) {
			System.out.println("The two array are equal");
		}else {
			System.out.println("The two array not equal");
		}
		
		
	}

}
