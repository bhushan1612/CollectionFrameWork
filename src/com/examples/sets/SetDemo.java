package com.examples.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public void convertListToSet(List<String> valueList) {
		Set<String> stringSet = new HashSet<String>(valueList);

		System.out.println("******************Set avoid duplicate Values*******************");
		for (String valueSet : stringSet) {
			System.out.println("Set Values : " + valueSet);
		}
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("D");
		list.add("C");
		list.add("D");
		list.add("Z");
		list.add("A");
		list.add("O");
		list.add("B");
		list.add("O");

		System.out.println("******************List Values*******************");
		System.out.println("Size of List : " + list.size());

		for (String strvalue : list) {
			System.out.println("List Values : " + strvalue);
		}

		SetDemo demo = new SetDemo();
		demo.convertListToSet(list);

	}

}
