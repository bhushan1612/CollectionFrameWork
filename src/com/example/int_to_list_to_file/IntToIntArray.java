package com.example.int_to_list_to_file;

public class IntToIntArray {

	int[] intArra;
	public void intArray(){
		String fileContent = "1234567890123456789";
		char[] ch = fileContent.toCharArray();
		intArra = new int[ch.length];
		
		for (int i = 0; i < ch.length; i++) {
			intArra[i] = ch[i]-'0';
			
		}
		System.out.println(ch);
	}
	
	/*public static void main(String[] args) {
		IntToIntArray intToIntArray = new IntToIntArray();
		intToIntArray.intArray();

	}*/

}
