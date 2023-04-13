package com.example.int_to_list_to_file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class WriteToIntArray {

	IntArrayToArrayList intArrayToArrayList;
	
	public WriteToIntArray() {
		intArrayToArrayList= new IntArrayToArrayList();
		int[] intarra = intArrayToArrayList.getIntToIntArray().intArra;
		intArrayToArrayList.intArray(intarra);
		
	}
	public IntArrayToArrayList getIntArrayToArrayList(){
		return intArrayToArrayList;
		
	}
	
	public void writeIntArray(List<Integer> intarra) {
		
		String fileName="IntArraysFile.txt";
		File file = new File(fileName);
		FileWriter writer = null;
		
		try {
			file.createNewFile();
			try {
				writer = new FileWriter(file);
				for (Integer intarraa : intarra) {
					writer.write(intarraa + " ");
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {

			}
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		WriteToIntArray writeToIntArray =new WriteToIntArray();
		List<Integer> intarra = writeToIntArray.getIntArrayToArrayList().intList;
		writeToIntArray.writeIntArray(intarra);
	}
}
