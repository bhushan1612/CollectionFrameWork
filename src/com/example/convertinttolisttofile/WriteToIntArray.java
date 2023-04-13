package com.example.convertinttolisttofile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToIntArray {

	public void writeToIntArray(List<Integer> intarra) {
		String fileName = "IntArrayFile.txt";

		File file = new File(fileName);
		FileWriter writer = null;

		try {
			file.createNewFile();
			try {

				writer = new FileWriter(file);
				for (Integer intar : intarra) {
					writer.write(intar + " ");
				}

			} catch (Exception e) {
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
		IntToIntArray intToIntArray = new IntToIntArray();
		WriteToIntArray writeToIntArray = new WriteToIntArray();
		intToIntArray.intArray();
		List<Integer> intarr = intToIntArray.intList;
		writeToIntArray.writeToIntArray(intarr);
	}

}
