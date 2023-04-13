package com.example.char_to_list_to_file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToCharArray {

	CharArrayToArrayList charArrayToArrayList;
	//Constructor
	public WriteToCharArray() {
		charArrayToArrayList= new CharArrayToArrayList();
		char[] c = charArrayToArrayList.getCharToCharArray().charArra;
		
		charArrayToArrayList.charArray(c);
	}
	
	public CharArrayToArrayList getCharArrayToArrayList() {
		return charArrayToArrayList;
	}

	public void writeToCharArray(List<Character> charArra) {
		
		String fileName = "CharArrayList.txt";
		File file = new File(fileName);
		FileWriter writer = null;
		try {
			file.createNewFile();
			try {
				writer =new FileWriter(file);
				for (Character character : charArra) {
					writer.write(character+" ");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				
			}
			try {
				writer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		WriteToCharArray writeToCharArray = new  WriteToCharArray();
		
		List<Character> c =writeToCharArray.getCharArrayToArrayList().charList;
		writeToCharArray.writeToCharArray(c);
	}

}
