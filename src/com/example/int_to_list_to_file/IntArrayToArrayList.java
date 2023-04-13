package com.example.int_to_list_to_file;

import java.util.ArrayList;
import java.util.List;

public class IntArrayToArrayList {

	IntToIntArray intToIntArray;
	List<Integer> intList;
	
	public IntArrayToArrayList() {
		intToIntArray = new IntToIntArray();
		intToIntArray.intArray();
	}
	
	public IntToIntArray getIntToIntArray() {
		return intToIntArray;
		
	}
	
	public void intArray(int[] arr) {
		int[] intArra = arr;
		intList = new ArrayList<Integer>(intArra.length);
		for (Integer intarra : intArra) {
			intList.add(intarra);
		}
	
		System.out.println(intList);
	}

}
