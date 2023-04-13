package com.example.collection.tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		TreeMap<Double, String> treeMap = new TreeMap<Double, String>();
		treeMap.put(new Double(4251.52), "Raghu");
		treeMap.put(new Double(85639.74), "Zagade");
		treeMap.put(new Double(7856.14), "Suyog");
		treeMap.put(new Double(4128.11), "Prasad");
		treeMap.put(new Double(7256.25), "Nitin");
		treeMap.put(new Double(451.32), "Pranali");
		treeMap.put(new Double(7256.25), "Nitin");
		treeMap.put(new Double(451.32), "Pranali");

		Map<Double, String> recordMap = new HashMap<Double, String>();
		for (Map.Entry<Double, String> me : treeMap.entrySet()) {
			System.out.print(me.getKey() + " : ");
			System.out.println(me.getValue());
		}
	}

}
