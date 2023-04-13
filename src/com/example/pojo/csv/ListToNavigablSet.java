package com.example.pojo.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class ListToNavigablSet {
	
	public List<String> surveyFileReader(File file){
		BufferedReader bufferedReader;
		List<String> list = new ArrayList<String>();
		
		try {
			bufferedReader =new BufferedReader(new FileReader(file));
			String line;
			
			while ((line =bufferedReader.readLine())!=null) {
				list.add(line);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void writeVariableSet(List<String> list,File file1) {
		
		List<String> setList =new ArrayList<String>();
		NavigableSet<String> setVariable =new TreeSet<String>(list);
		setList.addAll(setVariable.descendingSet());
		
		FileWriter writer=null;

		try {
			file1.createNewFile();
			try {
				writer =new FileWriter(file1);
				Iterator<String> variableIterator=setList.iterator();
				while(variableIterator.hasNext()) {
					writer.write(variableIterator.next()+"\n");			
				}
			}finally {
				writer.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListToNavigablSet listToNavigablSet = new ListToNavigablSet();
		String fileContaint = "C:\\Users\\bhush\\Desktop\\JAVA\\JAVA PROGRAMS\\CollectionFrameWork\\variableFile.txt";
		File file = new File(fileContaint);
		File file1 =new File("Setvariable_Navigable.txt");
		
		List<String> list =listToNavigablSet.surveyFileReader(file);
		listToNavigablSet.writeVariableSet(list,file1);
	}

}

