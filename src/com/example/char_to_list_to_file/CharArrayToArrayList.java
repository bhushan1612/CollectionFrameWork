package com.example.char_to_list_to_file;

import java.util.ArrayList;
import java.util.List;

public class CharArrayToArrayList {

	CharToCharArray charToCharArray;
	List<Character> charList;
	
	public CharArrayToArrayList() {
		charToCharArray = new CharToCharArray();
		charToCharArray.charArray();
	}
	
	public CharToCharArray getCharToCharArray() {
		return charToCharArray;
		
	}
	
	public void charArray(char[] arr) {
		
		char[] charArra = arr;
		charList = new ArrayList<Character>(charArra.length);
		for (Character c : charArra) {
			charList.add(c);
		}
		System.out.println(charList);
	}

}
