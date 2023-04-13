package com.example.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> recordMap = new HashMap<Integer,String>();
		recordMap.put(101, "Tushar");
		recordMap.put(102, "Rutuja");
		recordMap.put(103, "Hitesh");
		recordMap.put(104, "Bhushan");
		recordMap.put(105, "Mansi");
		
		for(Map.Entry<Integer, String> me: recordMap.entrySet()) {
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
		
		
		
	}

}
