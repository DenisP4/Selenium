package com.noorteck.interview.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex26 {
	
	public static void main(String[] args) {
		
		HashMap<String,String> stateMap=new HashMap<String,String>();
		
		stateMap.put("VA", "Reston");
		stateMap.put("CA", "San Fran");
		stateMap.put("FL","Tampa Bay");
		stateMap.put("MD", "Baltimore");
		
		Iterator<Map.Entry<String,String>> it=stateMap.entrySet().iterator();
		
		while(it.hasNext()) {
			
			Map.Entry<String, String> keyValue=it.next();
			
			String key=keyValue.getKey();
			
			String value=keyValue.getValue();
			
			System.out.println("Key:"+key+"\tValue"+value);
		}
	}

}
