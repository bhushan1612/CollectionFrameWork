package com.example.convertinttolisttofile;

import java.util.ArrayList;
import java.util.List;

public class IntToIntArray {

	List<Integer> intList;

	public void intArray() {

		String fileContent = "1234567890123456789";
		char[] ch = fileContent.toCharArray();
		int[] intArra = new int[ch.length];

		for (int i = 0; i < intArra.length; i++) {
			intArra[i] = ch[i] - '0';
		}
		intList = new ArrayList<Integer>(intArra.length);
		for (Integer intarra : intArra) {
			intList.add(intarra);
		}
		System.out.println(intList);

	}

}
