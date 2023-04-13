package com.example.collection.tree;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
		treeMap.put(1, "Mango");
		treeMap.put(2, "Orange");
		treeMap.put(3, "Apple");
		treeMap.put(4, "Banana");
		
		
		for(Entry<Integer, String> value : treeMap.entrySet()) {
				System.out.print(value.getKey()+" : ");
				System.out.println(value.getValue());
		}
	}

}
