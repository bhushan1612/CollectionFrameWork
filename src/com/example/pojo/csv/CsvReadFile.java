package com.example.pojo.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CsvReadFile {

	public void readCsvFile(File file) {
		BufferedReader bufferedReader;
		try {
			bufferedReader = new BufferedReader(new FileReader(file));
			try {
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					System.out.println(line);
				}

			} catch (IOException e) {
				e.printStackTrace();
			} finally {

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		CsvReadFile csvReadFile = new CsvReadFile();
		String fileContent = "C:\\Users\\bhush\\Desktop\\JAVA\\JAVA PROGRAMS\\CollectionFrameWork\\survey.csv";

		File file = new File(fileContent);
		csvReadFile.readCsvFile(file);
	}

}
