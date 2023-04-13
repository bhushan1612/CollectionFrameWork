package com.example.pojo.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ConvertFileFromListToSet {



	public List<String> surveyFileReader(File file){
		BufferedReader bufferedReader;
		List<String > list = new ArrayList<String>();
		try {
			
			bufferedReader = new BufferedReader(new FileReader(file));
			String line;
			
			while((line =bufferedReader.readLine())!=null) {
				list.add(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	public void writeVariableSet(List<String> list,File file1) {
		List<String> setList = new ArrayList<String>();
		Set<String> setVariable = new HashSet<String>();
		setList.addAll(setVariable);
		
		FileWriter writer= null;
		
		try {
			file1.createNewFile();
			try {
				writer = new FileWriter(file1);
				Iterator<String> variableIterator = setList.iterator();
				while(variableIterator.hasNext()) {
					writer.write(variableIterator.next()+"\n");
				}		
			} finally {
				writer.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		ConvertFileFromListToSet surveyReadFile = new ConvertFileFromListToSet();
		String fileContent = "C:\\Users\\bhush\\Desktop\\JAVA\\JAVA PROGRAMS\\CollectionFrameWork\\variableFile.txt";
		File file = new File(fileContent);
		File file1 = new File("SetVariable.txt");
		List<String> list =surveyReadFile.surveyFileReader(file1);
		surveyReadFile.writeVariableSet(list, file1);
	}

}
