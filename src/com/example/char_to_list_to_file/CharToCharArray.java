package com.example.char_to_list_to_file;

public class CharToCharArray {

	char[] charArra;
	public void charArray() {
		String fileContent = "ABCDEFGHIJKLMNOPQRUTUSVWXYZ";
		charArra = fileContent.toCharArray();
		System.out.println(charArra);
	}
	/*public static void main(String[] args) {
		
		CharToCharArray charToCharArray = new CharToCharArray();
		charToCharArray.charArray();
	}*/

}
